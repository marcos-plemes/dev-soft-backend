package br.com.devsoft.infra.entidade;

import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Formula;

@MappedSuperclass
public abstract class EntidadeBase implements EntityInterface {
    
    private static final long serialVersionUID = 1L;
    
    @Formula("count(1) over()")
    protected String countOver;
    
    public String getCountOver() {
        return this.countOver;
    }
    
    public void setCountOver(final String countOver) {
        this.countOver = countOver;
    }
    
}
