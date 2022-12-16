package br.com.devsoft.infra.jpa;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;
import br.com.devsoft.infra.jpa.criteria.JpaDatabaseCriteriaRepository;

@Component
@Transactional(propagation = Propagation.MANDATORY)
public class JpaDatabaseObjectRepository<E extends EntidadeBase, F extends FromWrapperInterface<E>> extends JpaDatabaseCriteriaRepository<E, F> {
    
}
