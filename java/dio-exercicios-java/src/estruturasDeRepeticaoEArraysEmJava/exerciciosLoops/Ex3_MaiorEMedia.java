package estruturasDeRepeticaoEArraysEmJava.exerciciosLoops;

import java.util.Scanner;
/*
Faça um programa que leia 5 números e informe o maior número e
a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado
        double maior = 0, soma = 0, media; //guarda o maior número, guarda a soma, guarda a média
        int count = 0; //controla o loop

        do {
            System.out.println("Número: "); //Peça um número
            double numero = scan.nextDouble(); //Entrada de dados, neste caso de um Double.
            if (numero > maior) { //Caso o valor que o usuário digitou seja maior que o valor armazanado na variável maior.
                maior = numero; //atribua o valor deste número a variável maior.
            }
            soma += numero; //some o número informado pelo usuário com variável soma (independente do valor)
            count++; //some o valor 1 ao contador, até que invalide a condição do loop. (count < 5)
        } while (count < 5); //enquanto o contador tiver o valor menor que 5

        media = soma / 5; //faça o cálculo da média. (soma/quantidade)
        //imprimindo o maior número digtados e a média dos mesmos
        System.out.println("Maior: " + maior + " - Média: " + media);
    }
}