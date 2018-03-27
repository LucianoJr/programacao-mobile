package br.utp.aulapratica.excecao;

public class HoraInvalidaException extends Exception {
    public HoraInvalidaException() {
        super();
    }

    public HoraInvalidaException(String mensagem) {
        super(mensagem);
    }
}
