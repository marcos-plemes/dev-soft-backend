package br.com.devsoft.infra.jpa.criteria;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;

import org.springframework.data.util.CastUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.entidade.EntidadeBase_;
import br.com.devsoft.infra.jpa.JpaDatabaseNativoRepository;
import br.com.devsoft.infra.jpa.criteria.builder.ConsultaCriteriaObject;
import br.com.devsoft.infra.jpa.criteria.builder.ConsultasCriteriaBuilder;
import br.com.devsoft.infra.jpa.criteria.builder.ConsultasCriteriaDtoApplierInterface;

@Component
@Transactional(propagation = Propagation.MANDATORY)
public class JpaDatabaseCriteriaRepository<E extends EntidadeBase, F extends FromWrapperInterface<E>> extends JpaDatabaseNativoRepository<E> {
    
    protected ConsultasCriteriaDtoApplierInterface<E, F> gerarConsultaCriteria() {
        return new ConsultasCriteriaBuilder<>();
    }
    
    protected <T> List<T> getResultList(final ConsultaCriteriaObject<E, F> criteriaObject) {
        final List<T> resultado = CastUtils.cast(this.createTypedQuery(criteriaObject).getResultList());
        return !CollectionUtils.isEmpty(resultado) ? resultado : Collections.emptyList();
    }
    
    protected <T> Optional<T> getSingleResult(final ConsultaCriteriaObject<E, F> criteriaObject) {
        try {
            return Optional.ofNullable(CastUtils.cast(this.createTypedQuery(criteriaObject).getSingleResult()));
        } catch (final NoResultException e) {
            return Optional.empty();
        }
    }
    
    private TypedQuery<?> createTypedQuery(final ConsultaCriteriaObject<E, F> criteriaObject) {
        
        final CriteriaQuery<?> criteria = this.cb().createQuery(criteriaObject.getDto());
        final F fromWrapper = criteriaObject.getFromWrapperApplier().apply(criteria.from(this.getClasseDeE()), criteria);
        criteria.multiselect(criteriaObject.getSelectionApplier().apply(fromWrapper));
        
        this.montarConsulta(criteria, criteriaObject, fromWrapper);
        
        return this.getEntityManager().createQuery(criteria);
        
    }
    
    private Long count(final ConsultaCriteriaObject<E, F> criteriaObject) {
        
        final CriteriaQuery<Long> criteria = this.cb().createQuery(Long.class);
        final F fromWrapper = criteriaObject.getFromWrapperApplier().apply(criteria.from(this.getClasseDeE()), criteria);
        criteria.select(fromWrapper.getFrom().get(EntidadeBase_.countOver).as(Long.class)).distinct(true);
        
        this.montarConsulta(criteria, criteriaObject, fromWrapper);
        
        try {
            return this.getEntityManager().createQuery(criteria).getSingleResult();
        } catch (final NoResultException e) {
            return 0L;
        }
        
    }
    
    private void montarConsulta(final CriteriaQuery<?> criteria, final ConsultaCriteriaObject<E, F> criteriaObject, final F fromWrapper) {
        
        final List<Predicate> predicates = criteriaObject.getWhereApplier().apply(fromWrapper);
        criteria.where(predicates.toArray(new Predicate[predicates.size()]));
        
        if (Objects.nonNull(criteriaObject.getOrderByApplier())) {
            criteria.orderBy(criteriaObject.getOrderByApplier().apply(fromWrapper));
        }
        
        if (Objects.nonNull(criteriaObject.getGroupByApplier())) {
            criteria.groupBy(criteriaObject.getGroupByApplier().apply(fromWrapper));
        }
        
        if (Objects.nonNull(criteriaObject.getHavingApplier())) {
            final List<Predicate> predicatesHaving = criteriaObject.getWhereApplier().apply(fromWrapper);
            criteria.having(predicatesHaving.toArray(new Predicate[predicatesHaving.size()]));
        }
    }
    
}
