package br.com.devsoft.infra.jpa;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsoft.infra.entidade.EntidadeBase;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;

@Component
@Transactional(propagation = Propagation.MANDATORY)
public class JpaEntityRepository<E extends EntidadeBase, F extends FromWrapperInterface<E>, C extends Number> extends JpaDatabaseObjectRepository<E, F> implements EntityRepositoryInterface<E, C> {
}
