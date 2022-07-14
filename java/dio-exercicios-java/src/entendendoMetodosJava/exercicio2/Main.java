package entendendoMetodosJava.exercicio2;

public class Main {
    public static void main(String[] args) {
        CalculoArea.calcularArea(3);
        CalculoArea.calcularArea(5d, 5d);//necessário especificar o tipo para nao confundir pois ha dois parametros parecidos
        CalculoArea.calcularArea(7, 8, 9);
        CalculoArea.calcularArea(4f, 6f); //necessário especificar o tipo para nao confundir pois ha dois parametros parecidos
    }
}
