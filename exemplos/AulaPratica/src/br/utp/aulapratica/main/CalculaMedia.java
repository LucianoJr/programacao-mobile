package br.utp.aulapratica.main;

import java.util.Scanner;

public class CalculaMedia {
    
    public static void main(String[] args) {
        
        // Leitura do teclado
        Scanner teclado = new Scanner(System.in);
        
        // Le as notas do aluno
        System.out.print("Digite o nome do aluno: ");
//        String nome = teclado.next();   // le uma string
        String nome = teclado.nextLine();   // le uma linha

        System.out.print("Digite as 3 notas do aluno: ");
        int nota1 = teclado.nextInt();
        int nota2 = teclado.nextInt();
        int nota3 = teclado.nextInt();

        // Calcula a media

        // type casting = coerção de dados
//        float media = (nota1 + nota2 + nota3) / (float) 3.0;
        float media = (nota1 + nota2 + nota3) / 3.0F;

        // Imprime a media na tela
        System.out.println("A nota do " + nome + " é " + media);






        
    }
    
}
