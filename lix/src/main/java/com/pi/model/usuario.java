
package com.pi.model;


public class usuario {
    int id,cpf;
        String nome,endereco,senha;         
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }

    public String getSenha() {
        return senha;
    }
    public int getCPF() {
        return cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setCPF(int cpf) {
        this.cpf = cpf;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
