package br.utp.aulapratica.main;

public class FuncoesMatematicas {

    public static void main(String[] args) {

        // Classe Math: classe utilitária
        // - possui apenas métodos
        // - não precisa ser instanciada

        // Calcula a raiz quadrada
        double x1 = Math.sqrt(3);
        
        // Calcula a potenciacao: 2 elevado a 10
        double x2 = Math.pow(2, 10);
        
        // Calcula a raiz cubica
        double x3 = Math.cbrt(27);

        double x4 = Math.ceil(4.2); // teto = 5
        double x5 = Math.floor(4.7); // chao = 4

        double x6 = Math.max(2, 10);
        double x7 = Math.min(2, 10);
        
        double x8 = Math.round(6.3); // arredondamento
        
        double x = 0;
        for (int i = 0; i < 1_000_000; i++) {
            x += 0.1;
        }
        System.out.println(x);
        System.out.println(x == 10);


        
        
        

    }
}