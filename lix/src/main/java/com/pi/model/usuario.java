
package com.pi.model;


public class usuario {
    int id,cpf,salario;
        String nome,endereco,senha,funcao;         
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
    public int getSalario() {
        return salario;
    }
     public String getFuncao() {
        return funcao;
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
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
