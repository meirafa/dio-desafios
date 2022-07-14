package entendendoMetodosJava.exercicio2;

public class CalculoArea {

    public static void calcularArea(double lado) {
        System.out.println("àrea do quadrado: " + lado * lado);
    }

    public static void calcularArea(double lado1, double lado2) {
        System.out.println("àrea do retangulo: " + lado1 * lado2);
    }

    public static void calcularArea(double baseMaior, double baseMenor, double altura) {
        System.out.println("àrea do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    //alterado o tipo para não confundir pois já existe uma sobrecarga com dois parametros double:
    public static void calcularArea(float diagonal1, float diagonal2){
        System.out.println("área do losango: " + (diagonal1 * diagonal2)/2);
    }

}
