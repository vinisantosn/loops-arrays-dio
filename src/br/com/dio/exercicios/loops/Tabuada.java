package br.com.dio.exercicios.loops;

/*
 * Desenvolva um gerador de tabuada, capaz de gerar
 * a tabuada de qualquer número inteiro entre 1 a 10.
 * o usuário deve informar de qual número ele deseja
 * ver a tabuada.
 *
 * A saída deve ser conforme o exemplo abaixo:
 *
 * Tabuada do 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 * */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroTabuada;

        System.out.println("Insira o número ao qual você deseja ver a tabuada: ");
        numeroTabuada = scan.nextInt();

        System.out.println("\t Tabuada do número " + numeroTabuada);
        for (int count = 0; count < 10; count++) {
            int multiplicador = count + 1;
            int resultado = numeroTabuada * multiplicador;
            System.out.println(numeroTabuada + " x " + multiplicador + " = " + resultado);
        }
    }
}
