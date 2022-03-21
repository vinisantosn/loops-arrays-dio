package br.com.dio.exercicios.arrays;

/*
 * Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa.
 * */

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        System.out.println("VETOR: ");
        for (int i = 0; i< (vetor.length);i++){
            System.out.print(vetor[i]+ " ");
        }
        System.out.println(" ");
        System.out.println("VETOR INVERTIDO: ");
        for (int i=(vetor.length-1);i>=0;i--){
            System.out.print(vetor[i]+ " ");
        }


    }
}
