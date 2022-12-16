package br.com.devsoft.infra.jpa.criteria.builder;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperApplierInterface;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;
import br.com.devsoft.infra.jpa.criteria.GroupByApplierInterface;
import br.com.devsoft.infra.jpa.criteria.HavingApplierInterface;
import br.com.devsoft.infra.jpa.criteria.OrderByApplierInterface;
import br.com.devsoft.infra.jpa.criteria.SelectionApplierInterface;
import br.com.devsoft.infra.jpa.criteria.WhereApplierInterface;

public class ConsultasCriteriaBuilder<D extends EntidadeBase, F extends FromWrapperInterface<D>>
        implements ConsultasCriteriaDtoApplierInterface<D, F>,
        ConsultaCriteriaFromWrapperApplierInterface<D, F>,
        ConsultaCriteriaSelectionApplierInterface<D, F>,
        ConsultaCriteriaWhereApplierInterface<D, F>,
        ConsultaCriteriaOrderByApplierInterface<D, F>,
        ConsultaCriteriaGroupByApplierInterface<D, F>,
        ConsultaCriteriaHavingApplierInterface<D, F>,
        ConsultaCriteriaBuildInterface<D, F> {
    
    private final ConsultaCriteriaObject<D, F> objeto;
    
    public ConsultasCriteriaBuilder() {
        this.objeto = new ConsultaCriteriaObject<>();
    }
    
    @Override
    public ConsultaCriteriaFromWrapperApplierInterface<D, F> dto(final Class<?> dto) {
        this.objeto.setDto(dto);
        return this;
    }
    
    @Override
    public ConsultaCriteriaSelectionApplierInterface<D, F> fromWrapperApplier(final FromWrapperApplierInterface<D, F> fromWrapperApplier) {
        this.objeto.setFromWrapperApplier(fromWrapperApplier);
        return this;
    }
    
    @Override
    public ConsultaCriteriaWhereApplierInterface<D, F> selectionApplier(final SelectionApplierInterface<D, F> selectionApplier) {
        this.objeto.setSelectionApplier(selectionApplier);
        return this;
    }
    
    @Override
    public ConsultaCriteriaOrderByApplierInterface<D, F> whereApplier(final WhereApplierInterface<D, F> whereApplier) {
        this.objeto.setWhereApplier(whereApplier);
        return this;
    }
    
    @Override
    public ConsultaCriteriaGroupByApplierInterface<D, F> orderByApplier(final OrderByApplierInterface<D, F> orderByApplier) {
        this.objeto.setOrderByApplier(orderByApplier);
        return this;
    }
    
    @Override
    public ConsultaCriteriaHavingApplierInterface<D, F> groupByApplier(final GroupByApplierInterface<D, F> groupByApplier) {
        this.objeto.setGroupByApplier(groupByApplier);
        return this;
    }
    
    @Override
    public ConsultaCriteriaBuildInterface<D, F> havingApplier(final HavingApplierInterface<D, F> havingApplier) {
        this.objeto.setHavingApplier(havingApplier);
        return this;
    }
    
    @Override
    public ConsultaCriteriaObject<D, F> build() {
        return this.objeto;
    }
    
}
