package br.utp.aulapratica.model;

import br.utp.aulapratica.excecao.HoraInvalidaException;
import br.utp.aulapratica.excecao.MinutoInvalidoException;
import br.utp.aulapratica.excecao.SegundoInvalidoException;

public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    public Relogio() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public void setHora(int hora) throws HoraInvalidaException {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            throw new HoraInvalidaException("Hora fora do intervalo 00 - 23");
        }
    }

    public void setMinuto(int minuto) throws MinutoInvalidoException {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            throw new MinutoInvalidoException("Minuto fora do intervalo 00- 59");
        }
    }

    /**
     * Define valor dos segundos.
     *
     * @param segundo valor do segundo
     * @throws SegundoInvalidoException fora do intervalo
     */
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            throw new SegundoInvalidoException("Segundo fora do intervalo 00 - 59");
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
}
