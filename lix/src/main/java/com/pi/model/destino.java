
package com.pi.model;


public class destino {
    int id,unidades;
        String nome,endereco,data;         
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }

    public String getData() {
        return data;
    }
    public int getUnidades() {
        return unidades;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setData(String data) {
        this.data = data;
    }
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
