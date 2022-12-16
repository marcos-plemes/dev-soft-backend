package br.com.devsoft.infra.jpa.criteria;

import java.util.List;

import javax.persistence.criteria.Expression;

import br.com.devsoft.infra.entidade.EntidadeBase;

public interface GroupByApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    List<Expression<?>> apply(F fromWrapper);
    
}
