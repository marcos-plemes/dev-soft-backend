package br.com.devsoft.entidades;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.devsoft.infra.entidade.EntidadeBase;

@Entity
@Table(name = "usuario")
public class Usuario extends EntidadeBase {
    
    private static final long serialVersionUID = -4063291031574463046L;
    
    @Id
    @SequenceGenerator(name = "seq_usuario", sequenceName = "usuario_us_codigo_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    @Column(name = "us_codigo", nullable = false)
    private Integer codigo;
    
    @Column(name = "us_nome", nullable = false, length = 20)
    private String nome;
    
    @Column(name = "us_sobrenome", nullable = false, length = 20)
    private String sobrenome;
    
    @Column(name = "us_senha", nullable = false, length = 265)
    private String senha;
    
    @Column(name = "us_email", nullable = false, length = 40)
    private String email;
    
    @Column(name = "us_cpf", nullable = false, length = 11)
    private String cpf;
    
    @Column(name = "us_celular", nullable = false, length = 11)
    private String celular;
    
    @Column(name = "us_datacad", nullable = false)
    private LocalDateTime dataDeCadastro;
    
    @Column(name = "us_dataalt", nullable = true)
    private Timestamp dataDeAlteracao;
    
    public Usuario() {}
    
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(final Integer codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(final String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(final String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(final String senha) {
        this.senha = senha;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }
    
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(final String celular) {
        this.celular = celular;
    }
    
    public LocalDateTime getDataDeCadastro() {
        return this.dataDeCadastro;
    }
    
    public void setDataDeCadastro(final LocalDateTime dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
    
    public Timestamp getDataDeAlteracao() {
        return this.dataDeAlteracao;
    }
    
    public void setDataDeAlteracao(final Timestamp dataDeAlteracao) {
        this.dataDeAlteracao = dataDeAlteracao;
    }
    
}
