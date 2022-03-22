package br.com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * Faça um programga que leia 20 números inteiros
 * aleatorios (entre 0 e 100) armazene-os em um
 * vetor. Ao final mostre os números e seus sucessores.
 *
 * */
public class NumerosAleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.println("\t NUMEROS ALEATORIOS ");
        for (int numero:
             numerosAleatorios) {
            System.out.print(numero + " ");
            
        }

        System.out.println(" ");
        System.out.println("\t SUCESSORES ");
        for (int numero:
                numerosAleatorios) {
            System.out.print((numero+1) + " ");

        }
    }
}
