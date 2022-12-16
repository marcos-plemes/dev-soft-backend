package br.com.devsoft.infra.jpa;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsoft.infra.entidade.EntidadeBase;

@Component
@Transactional(propagation = Propagation.MANDATORY)
public class JpaDatabaseNativoRepository<E extends EntidadeBase> extends JpaDatabaseRepository<E> {
    
}
