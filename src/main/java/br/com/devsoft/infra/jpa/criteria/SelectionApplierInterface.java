package br.com.devsoft.infra.jpa.criteria;

import java.util.List;

import javax.persistence.criteria.Selection;

import br.com.devsoft.infra.entidade.EntidadeBase;

public interface SelectionApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    List<Selection<?>> apply(F fromWrapper);
    
}
