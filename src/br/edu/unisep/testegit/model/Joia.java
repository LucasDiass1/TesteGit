package br.edu.unisep.testegit.model;

public class Joia {
    public String nome;
    private int idade;
    private Boolean sexo;
    private int ano;

    public Joia(String nome) {
        this.nome = nome;
    }

    public Joia(String nome, int idade, Boolean sexo, int ano) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.ano = ano;
    }
    public boolean ligar(){
        return this.sexo;
    }
}
