package br.utp.aulapratica.main;

import br.utp.aulapratica.model.Aluno;

public class TesteAluno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Pedro", 1234);
        Aluno aluno2 = new Aluno("Pedro", 1234);
        Aluno aluno3 = aluno1;
        Aluno aluno4;

        aluno3.setNome("Jackson");

        //System.out.println(aluno4.getNome());

        System.out.println(aluno1);
        System.out.println(aluno2);

        if (aluno1.equals(aluno2)) {
            System.out.println("Sao iguais");
        } else {
            System.out.println("Sao diferentes");
        }



        // Teste instanceof
        // Verifica se um objeto pertence a instancia de uma classe
        Object obj = aluno1;
        System.out.println(obj instanceof Aluno);
        System.out.println(obj instanceof String);
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof Object);

        
        
        
    }

}
