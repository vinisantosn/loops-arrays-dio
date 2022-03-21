package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 *  Faça um programa que peça uma nota, entre zero e dez.
 *  Mostre uma mensagem caso o valor seja inválido e con-
 *  tinue pedindo até que o usuário informe um valor
 *  válido.
 *
 */
public class Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota;
        System.out.println("Digite uma nota entre zero e dez: ");
        nota = scan.nextDouble();

        while(nota<0.0 || nota>10.0){
            System.out.println("Valor inválido");
            System.out.println("Digite uma nota entre zero e dez: ");
            nota = scan.nextDouble();



        }

        System.out.println("fim");


    }

}
