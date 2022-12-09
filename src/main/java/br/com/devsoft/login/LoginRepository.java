package br.com.devsoft.login;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import br.com.devsoft.comum.BaseRepository;
import br.com.devsoft.entidades.Usuario;
import br.com.devsoft.entidades.Usuario_;

@Repository
public class LoginRepository extends BaseRepository {
    
    public String login() {
        final CriteriaQuery<String> criteria = this.cb().createQuery(String.class);
        final Root<Usuario> from = criteria.from(Usuario.class);
        
        criteria.select(from.get(Usuario_.nome));
        criteria.where(this.cb().equal(from.get(Usuario_.codigo), 1));
        
        try {
            return this.getEntityManager().createQuery(criteria).getSingleResult();
        } catch (final NoResultException e) {
            return null;
        }
        
    }
    
}
