package br.com.devsoft.login;

import javax.persistence.criteria.Root;

import br.com.devsoft.entidades.Usuario;
import br.com.devsoft.infra.jpa.criteria.FromWrapperApplierInterface;
import br.com.devsoft.infra.jpa.criteria.FromWrapperInterface;

public class LoginFromWrapper implements FromWrapperInterface<Usuario> {
    
    private final Root<Usuario> from;
    
    public LoginFromWrapper(final Root<Usuario> from) {
        this.from = from;
    }
    
    public static FromWrapperApplierInterface<Usuario, LoginFromWrapper> applier() {
        return (from, criteria) -> new LoginFromWrapper(from);
    }
    
    @Override
    public Root<Usuario> getFrom() {
        return this.from;
    }
    
}
