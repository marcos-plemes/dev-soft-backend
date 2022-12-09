package br.com.devsoft.comum;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation = Propagation.MANDATORY)
public class BaseRepository {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    protected EntityManager getEntityManager() {
        return this.entityManager;
    }
    
    protected CriteriaBuilder cb() {
        return this.getEntityManager().getCriteriaBuilder();
    }
    
}
