package br.utp.aulapratica.model;

public class Pessoa {

    private String nome;
    protected int idade;

    public Pessoa() {
        System.out.println("Pessoa()");
        nome = "";
        idade = 0;
    }

    public Pessoa(String nome, int idade) {
        System.out.println("Pessoa(nome, idade)");
        this.nome = nome;   // this usado para resolver ambiguidade
        this.idade = idade;
    }

    public void andar() {
        System.out.println(nome + " esta andando...");
    }

}
