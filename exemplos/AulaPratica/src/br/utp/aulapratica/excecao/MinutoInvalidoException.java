package br.utp.aulapratica.excecao;

public class MinutoInvalidoException extends Exception {
    public MinutoInvalidoException() {
        super();
    }
    public MinutoInvalidoException(String mensagem) {
        super(mensagem);
    }

}
