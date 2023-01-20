package br.com.devsoft.login.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginDto {
    
    private Integer codigo;
    
    private String nome;
    
    private String sobrenome;
    
    private String senha;
    
    private String email;
    
    private String cpf;
    
    private String celular;
    
    private byte[] conteudo;
    
    public LoginDto() {}
    
    public LoginDto(
            final Integer codigo,
            final String nome) {
        
        this.codigo = codigo;
        this.nome = nome;
    }
    
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
    
    public byte[] getConteudo() {
        return this.conteudo;
    }
    
    public void setConteudo(final byte[] conteudo) {
        this.conteudo = conteudo;
    }
    
}
