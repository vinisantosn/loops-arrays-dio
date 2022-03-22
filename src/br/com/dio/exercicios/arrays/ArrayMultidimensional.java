package br.com.dio.exercicios.arrays;

/*
 * Gere e imprima uma matriz M 4x4
 * com valores aleatorios entre 0-9.
 *
 * */

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizM = new int[4][4];

        for (int i = 0; i<4;i++){
            for (int j = 0; j<4; j++){
                int numero = random.nextInt(9);
                matrizM[i][j] = numero;
            }
        }

        for (int i = 0; i<4;i++){
            for (int j = 0; j<4; j++){
                System.out.print(matrizM[i][j] +" ");
            }
            System.out.println(" ");
        }
//        IMPRIMINDO POR FOREACH
//        for (int[] linha :
//             matrizM) {
//            for (int coluna:
//                 linha) {
//                System.out.print(coluna +" ");
//
//            }
//            System.out.println();
//
//        }
    }
}
