package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

      //  Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

       // Mensagem
        System.out.println("Exercicio.mensagem");
        Mensagem.obtermensagem(9);
        Mensagem.obtermensagem(14);
        Mensagem.obtermensagem(1);

        //Emprestimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);




    }
}
