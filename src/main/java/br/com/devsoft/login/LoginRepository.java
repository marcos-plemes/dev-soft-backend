package br.com.devsoft.login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.Predicate;

import org.springframework.stereotype.Repository;

import br.com.devsoft.entidades.Usuario;
import br.com.devsoft.entidades.Usuario_;
import br.com.devsoft.infra.jpa.JpaEntityRepository;
import br.com.devsoft.infra.jpa.criteria.SelectionApplierInterface;
import br.com.devsoft.infra.jpa.criteria.WhereApplierInterface;
import br.com.devsoft.infra.jpa.criteria.builder.ConsultaCriteriaObject;
import br.com.devsoft.login.dtos.LoginDto;

@Repository
public class LoginRepository extends JpaEntityRepository<Usuario, LoginFromWrapper, Integer> {
    
    public Optional<LoginDto> login(final LoginDto filtro) {
        
        final ConsultaCriteriaObject<Usuario, LoginFromWrapper> teste = this.gerarConsultaCriteria()
                .dto(LoginDto.class)
                .fromWrapperApplier(LoginFromWrapper.applier())
                .selectionApplier(this.selectionApplier())
                .whereApplier(this.whereApplier(filtro))
                .build();
        
        return this.getSingleResult(teste);
        
    }
    
    private SelectionApplierInterface<Usuario, LoginFromWrapper> selectionApplier() {
        return from -> Arrays.asList(
                from.getFrom().get(Usuario_.codigo),
                from.getFrom().get(Usuario_.nome));
    }
    
    private WhereApplierInterface<Usuario, LoginFromWrapper> whereApplier(final LoginDto filtro) {
        return from -> {
            final List<Predicate> predicates = new ArrayList<>();
            
            predicates.add(this.cb().equal(from.getFrom().get(Usuario_.email), filtro.getEmail()));
            predicates.add(this.cb().equal(from.getFrom().get(Usuario_.senha), filtro.getSenha()));
            
            return predicates;
        };
    }
    
}
