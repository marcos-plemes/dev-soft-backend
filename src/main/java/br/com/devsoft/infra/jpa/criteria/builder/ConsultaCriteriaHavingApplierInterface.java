package br.com.devsoft.infra.jpa.criteria.builder;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;
import br.com.devsoft.infra.jpa.criteria.HavingApplierInterface;

public interface ConsultaCriteriaHavingApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    ConsultaCriteriaBuildInterface<D, F> havingApplier(HavingApplierInterface<D, F> havingApplier);
    
    ConsultaCriteriaObject<D, F> build();
}
