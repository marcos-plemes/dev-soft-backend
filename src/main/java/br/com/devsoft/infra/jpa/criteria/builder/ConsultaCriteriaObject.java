package br.com.devsoft.infra.jpa.criteria.builder;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperApplierInterface;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;
import br.com.devsoft.infra.jpa.criteria.GroupByApplierInterface;
import br.com.devsoft.infra.jpa.criteria.HavingApplierInterface;
import br.com.devsoft.infra.jpa.criteria.OrderByApplierInterface;
import br.com.devsoft.infra.jpa.criteria.SelectionApplierInterface;
import br.com.devsoft.infra.jpa.criteria.WhereApplierInterface;

public class ConsultaCriteriaObject<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    private Class<?> dto;
    
    private FromWrapperApplierInterface<D, F> fromWrapperApplier;
    
    private SelectionApplierInterface<D, F> selectionApplier;
    
    private WhereApplierInterface<D, F> whereApplier;
    
    private OrderByApplierInterface<D, F> orderByApplier;
    
    private GroupByApplierInterface<D, F> groupByApplier;
    
    private HavingApplierInterface<D, F> havingApplier;
    
    public ConsultaCriteriaObject() {}
    
    public Class<?> getDto() {
        return this.dto;
    }
    
    public void setDto(final Class<?> dto) {
        this.dto = dto;
    }
    
    public FromWrapperApplierInterface<D, F> getFromWrapperApplier() {
        return this.fromWrapperApplier;
    }
    
    public void setFromWrapperApplier(final FromWrapperApplierInterface<D, F> fromWrapperApplier) {
        this.fromWrapperApplier = fromWrapperApplier;
    }
    
    public SelectionApplierInterface<D, F> getSelectionApplier() {
        return this.selectionApplier;
    }
    
    public void setSelectionApplier(final SelectionApplierInterface<D, F> selectionApplier) {
        this.selectionApplier = selectionApplier;
    }
    
    public WhereApplierInterface<D, F> getWhereApplier() {
        return this.whereApplier;
    }
    
    public void setWhereApplier(final WhereApplierInterface<D, F> whereApplier) {
        this.whereApplier = whereApplier;
    }
    
    public OrderByApplierInterface<D, F> getOrderByApplier() {
        return this.orderByApplier;
    }
    
    public void setOrderByApplier(final OrderByApplierInterface<D, F> orderByApplier) {
        this.orderByApplier = orderByApplier;
    }
    
    public GroupByApplierInterface<D, F> getGroupByApplier() {
        return this.groupByApplier;
    }
    
    public void setGroupByApplier(final GroupByApplierInterface<D, F> groupByApplier) {
        this.groupByApplier = groupByApplier;
    }
    
    public HavingApplierInterface<D, F> getHavingApplier() {
        return this.havingApplier;
    }
    
    public void setHavingApplier(final HavingApplierInterface<D, F> havingApplier) {
        this.havingApplier = havingApplier;
    }
    
}
