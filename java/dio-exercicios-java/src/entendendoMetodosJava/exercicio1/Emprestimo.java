package entendendoMetodosJava.exercicio1;

public class Emprestimo {
    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcularEmprestimo(double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor + getTaxaDuasParcelas());
            System.out.printf("Valor final do empréstimo para %d parcelas: R$ %.2f \n", parcelas, valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor + getTaxaTresParcelas());
            System.out.printf("Valor final do empréstimo para %d parcelas: R$ %.2f \n", parcelas, valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita");
        }
    }
}
