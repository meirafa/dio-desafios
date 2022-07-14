package entendendoMetodosJava.exercicio3;

public class Main {
    public static void main(String[] args) {
        double areaQuadrado = Quadrilatero.calcularArea(5, 8);
        System.out.println("Area quadrado: " + areaQuadrado);
        double areaTrapezio = Quadrilatero.calcularArea(5, 6, 2);
        System.out.println("Area trapezio: " + areaTrapezio);
        double areaRetangulo = Quadrilatero.calcularArea(5.6d, 6.0d); //necessário especificar o tipo para nao confundir pois ha dois parametros parecidos
        System.out.println("Area retangulo: " + areaRetangulo);
        float areaLosango = Quadrilatero.calcularArea(4.6f, 6.3f); //necessário especificar o tipo para nao confundir pois ha dois parametros parecidos
        System.out.println("Area losango: " + areaLosango);
    }
}