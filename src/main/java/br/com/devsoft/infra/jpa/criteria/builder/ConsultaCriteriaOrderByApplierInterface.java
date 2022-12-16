package br.com.devsoft.infra.jpa.criteria.builder;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;
import br.com.devsoft.infra.jpa.criteria.OrderByApplierInterface;

public interface ConsultaCriteriaOrderByApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    ConsultaCriteriaGroupByApplierInterface<D, F> orderByApplier(OrderByApplierInterface<D, F> orderByApplier);
    
    ConsultaCriteriaObject<D, F> build();
    
}
