package br.utp.aulapratica.model;

public class Pirata extends Pessoa {

    // Se nenhum construtor for definido, o compilador
    // cria o construtor vazio
    // - Os construtores nunca sao herdados, logo devem
    // ser implementados


    public Pirata() {
        // Primeira coisa que qualquer construtor deve
        // fazer eh chamar o construtor da classe pai. Se nao
        // for informado, o compilador chama o construtor vazio
        // do pai
        super();    // Chama o construtor vazio do pai
        System.out.println("Pirata()");
    }

    public Pirata(String nome, int idade) {
        super(nome, idade);

        //this.nome = "???"; // nome nao eh acessivel
        this.idade = 100;
    }




}
