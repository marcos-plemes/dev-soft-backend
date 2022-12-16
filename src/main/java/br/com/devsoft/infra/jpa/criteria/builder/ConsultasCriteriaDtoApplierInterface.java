package br.com.devsoft.infra.jpa.criteria.builder;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;

public interface ConsultasCriteriaDtoApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    ConsultaCriteriaFromWrapperApplierInterface<D, F> dto(Class<?> dto);
    
}
