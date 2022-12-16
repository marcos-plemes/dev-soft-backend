package br.com.devsoft.infra.jpa.criteria.builder;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;
import br.com.devsoft.infra.jpa.criteria.WhereApplierInterface;

public interface ConsultaCriteriaWhereApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    ConsultaCriteriaOrderByApplierInterface<D, F> whereApplier(WhereApplierInterface<D, F> whereApplier);
    
}
