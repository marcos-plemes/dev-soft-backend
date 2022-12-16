package br.com.devsoft.infra.jpa.criteria;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.devsoft.infra.entidade.EntidadeBase;

public interface FromWrapperApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    F apply(Root<D> from, CriteriaQuery<?> criteria);
    
}
