package br.com.devsoft.infra.jpa.criteria.builder;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;
import br.com.devsoft.infra.jpa.criteria.SelectionApplierInterface;

public interface ConsultaCriteriaSelectionApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    ConsultaCriteriaWhereApplierInterface<D, F> selectionApplier(SelectionApplierInterface<D, F> selectionApplier);
    
}
