package br.com.devsoft.infra.jpa.criteria;

import java.util.List;

import javax.persistence.criteria.Predicate;

import br.com.devsoft.infra.entidade.EntidadeBase;

public interface WhereApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    List<Predicate> apply(F fromWrapper);
}
