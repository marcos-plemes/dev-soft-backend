package br.com.devsoft.infra.jpa.criteria.builder;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;
import br.com.devsoft.infra.jpa.criteria.GroupByApplierInterface;

public interface ConsultaCriteriaGroupByApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    ConsultaCriteriaHavingApplierInterface<D, F> groupByApplier(GroupByApplierInterface<D, F> groupByApplier);
    
    ConsultaCriteriaObject<D, F> build();
    
}
