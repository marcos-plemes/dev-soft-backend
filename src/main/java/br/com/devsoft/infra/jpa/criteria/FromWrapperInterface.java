package br.com.devsoft.infra.jpa.criteria;

import javax.persistence.criteria.Root;

import br.com.devsoft.infra.entidade.EntidadeBase;

public interface FromWrapperInterface<D extends EntidadeBase> {
    
    Root<D> getFrom();
}
