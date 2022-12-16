package br.com.devsoft.infra.jpa.criteria;

import java.util.List;

import javax.persistence.criteria.Order;

import br.com.devsoft.infra.entidade.EntidadeBase;

public interface OrderByApplierInterface<D extends EntidadeBase, F extends FromWrapperInterface<D>> {
    
    List<Order> apply(F fromWrapper);
    
}
