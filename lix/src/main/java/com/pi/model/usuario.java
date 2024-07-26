
package com.pi.model;


public class usuario {
    int id,salario;
        String nome,endereco,senha,funcao,cpf;         
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }

    public String getSenha() {
        return senha;
    }

    public int getSalario() {
        return salario;
    }
     public String getFuncao() {
        return funcao;
    }
      public String getCpf() {
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
    public void setCpf(String cpf) {
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
