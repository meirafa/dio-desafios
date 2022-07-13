package entendendoMetodosJava.exercicio1;

public class Calculadora {

    public static void somar(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.printf("A soma do %.2f, mais %.2f é %.2f \n", numero1, numero2, resultado);
    }

    public static void subtrair(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.printf("A subtracao do %.2f, mais %.2f é %.2f \n", numero1, numero2, resultado);
    }

    public static void multiplicar(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.printf("A multiplicacao do %.2f, mais %.2f é %.2f \n", numero1, numero2, resultado);
    }

    public static void dividir(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.printf("A divisao do %.2f, mais %.2f é %.2f \n", numero1, numero2, resultado);
    }
}
