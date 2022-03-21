package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorail de um
 * número inteiro fornecido pelo usuário.
 * Ex.: 5! = 120
 * */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroFatorial;

        System.out.println("Digite um número para descobrir seu fatorial: ");
        numeroFatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(numeroFatorial+"! = ");
        for (int i = numeroFatorial ; i> 0; i--){
            multiplicacao*=i;
        }
        System.out.println(multiplicacao);
    }
}
