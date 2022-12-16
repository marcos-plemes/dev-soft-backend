package br.com.devsoft.infra.jpa.criteria.builder;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperApplierInterface;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;

public interface ConsultaCriteriaFromWrapperApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    ConsultaCriteriaSelectionApplierInterface<D, F> fromWrapperApplier(FromWrapperApplierInterface<D, F> fromWrapperApplier);
    
}
