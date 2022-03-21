package br.com.dio.exercicios.loops;

/*
 * Faça um programa que peça N números inteiros
 * calcule e mostre a quantidade de números pa-
 * res e a quantidade de números ímpares.
 *
 * */

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero, quantidadeNumeros, count = 0;
        int quantidadeNumeroPar = 0;
        int quantidadeNumeroImpar = 0;

        System.out.println("Insira a quantidade de números inteiros que deseja analisar: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                quantidadeNumeroPar++;
            } else {
                quantidadeNumeroImpar++;
            }
            count++;


        } while (count < quantidadeNumeros);

        System.out.println("Qtd. pares -> " + quantidadeNumeroPar);
        System.out.println("Qtd. impares -> " + quantidadeNumeroImpar);
    }
}
