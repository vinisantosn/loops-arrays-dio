package br.com.dio.exercicios.loops;

/*
 * Faça um programa que leia cinco números
 * e informe o maior número e a média desses.
 * */

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 0; // Contador
        double maior = 0;
        double numero, soma = 0, media;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextDouble();

            if (numero > maior) {
                maior = numero;
            }
            soma += numero;
            i++;

        } while (i < 5);
        media = soma / 5;
        System.out.println("a media é: " + media);
        System.out.println("maior "+ maior);
    }
}
