package entendendoMetodosJava.exercicio1;

public class Main {
    public static void main(String[] args) {
        //exercicio calculadora
        Calculadora.somar(1, 2);
        Calculadora.subtrair(9, 2);
        Calculadora.multiplicar(2, 5);
        Calculadora.dividir(5, 3);

        //exercicio mensagem
        Mensagem.obterMensagem(0);
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(15);

        //exercicio emprestimo
        Emprestimo.calcularEmprestimo(1100, Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(1100, Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(1100, 5);
    }
}
