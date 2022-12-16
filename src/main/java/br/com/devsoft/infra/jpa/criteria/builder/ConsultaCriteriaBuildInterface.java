package br.com.devsoft.infra.jpa.criteria.builder;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;

public interface ConsultaCriteriaBuildInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    ConsultaCriteriaObject<D, F> build();
}
