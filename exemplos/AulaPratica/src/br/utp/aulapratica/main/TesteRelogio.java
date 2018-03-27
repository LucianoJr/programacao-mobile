package br.utp.aulapratica.main;

import br.utp.aulapratica.excecao.HoraInvalidaException;
import br.utp.aulapratica.excecao.MinutoInvalidoException;
import br.utp.aulapratica.excecao.SegundoInvalidoException;
import br.utp.aulapratica.model.Relogio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteRelogio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um horario: ");

        try {
            Relogio novo = new Relogio();
            novo.setHora(teclado.nextInt());
            novo.setMinuto(teclado.nextInt());
            novo.setSegundo(teclado.nextInt());

            System.out.printf("%02d:%02d:%02d", novo.getHora(), novo.getMinuto(), novo.getSegundo());
        }
        catch (HoraInvalidaException ex) {
            // Utilizado para questoes de debug
            // Imprime a pilha de execucao de memoria
            ex.printStackTrace();

            // Recupera a mensagem de erro
            System.err.println(ex.getMessage());
        }
        catch (MinutoInvalidoException ex) {
            // Recupera a mensagem de erro
            System.err.println(ex.getMessage());
        }
        catch (InputMismatchException ex) {
            System.out.println("Vc nao digitou um numero!");
        }
//        catch (SegundoInvalidoException ex) {
//
//        }

        System.out.println("FIM");
        
    }
}
