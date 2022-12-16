package br.com.devsoft.infra.jpa;

import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsoft.comum.utils.GenericoUtil;
import br.com.devsoft.infra.entidade.EntidadeBase;

@Component
@Transactional(propagation = Propagation.MANDATORY)
public class JpaDatabaseRepository<E extends EntidadeBase> {
    
    private Class<E> classeDeE;
    
    protected Class<E> getClasseDeE() {
        if (Objects.isNull(this.classeDeE)) {
            return GenericoUtil.retornarClasseDoDiamante(this.getClass(), 0);
        }
        return this.classeDeE;
    }
    
    @PersistenceContext
    private EntityManager entityManager;
    
    protected EntityManager getEntityManager() {
        return this.entityManager;
    }
    
    protected CriteriaBuilder cb() {
        return this.getEntityManager().getCriteriaBuilder();
    }
    
}
