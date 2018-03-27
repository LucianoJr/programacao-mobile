package br.utp.aulapratica.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aluno {

    // ------------------------------------------------
    // CONSTANTES
    // ------------------------------------------------

    // nomes de constantes sempre em maiusculo separado por _
    private static final int NUM_NOTAS = 2;

    // ------------------------------------------------
    // ATRIBUTOS
    // ------------------------------------------------

    // Modificadores de acesso:
    // - public: Todos os objetos de outras classes tem acesso
    // - private: Somente a classe tem acesso
    // - protected: Somente a classe e as classes filhas
    // - default: Somente a classe e todas as outras do mesmo
    //            pacote

    private String nome;
    private long matricula;
    private Date aniversario;
    private int[] notas;

    // ------------------------------------------------
    // CONSTRUTORES
    // ------------------------------------------------
    // - Objetivo dos construtores eh inicializar o objeto

    /**
     * Construtor default/vazio
     */
    public Aluno() {
        nome = "";
        matricula = 0;
        aniversario = new Date();
        notas = new int[NUM_NOTAS];
    }

    public Aluno(String nome, long matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.aniversario = new Date();
        this.notas = new int[NUM_NOTAS];
    }

    // ------------------------------------------------
    // METODOS
    // ------------------------------------------------

    public void estude() {
        System.out.println(nome + " esta estudando...");
    }

    // METODOS MUTANTES
    // Alteram os valores de atributos
    // Normalmente comecam com o prefixo: set

    public void setNome(String nome) {
        this.nome = nome.toUpperCase().trim();
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void setNotas(int nota1, int nota2) {
        this.notas[0] = nota1;
        this.notas[1] = nota2;
    }

    public void setAniversario(int dia, int mes, int ano) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, dia);
        calendar.set(Calendar.MONTH, mes - 1);
        calendar.set(Calendar.YEAR, ano);

        this.aniversario = calendar.getTime();
    }

    // ACESSORES
    // Acessa os valores dos atributos
    // Comecam com o prefixo: get

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public int getNota1() {
        return notas[0];
    }

    public int getNota2() {
        return notas[1];
    }

    public String getAniversario() {
        SimpleDateFormat sdf =
                new SimpleDateFormat("dd/MMMM/YYYY");

        return sdf.format(aniversario);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aluno) {
            Aluno aluno = (Aluno) obj;
            return aluno.nome.equals(nome)
                    && aluno.matricula == matricula;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + '\n'+ nome + '\n' + matricula;
    }
}

