package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 *  Faça um programa que leia conjuntos de dois valores,
 *  o primeiro representando o nome do aluno e o segundo
 *  representando a sua idade.
 *
 *  (pare inserindo o valor 0 no campo nome)
 */

public class NomeEIdade {
    public static void main(String[] args) {

        Scanner scanNomeEIdade = new Scanner(System.in);

        String nomeDoAluno ;
        int idadeDoAluno;
        boolean nome = true;

        while(nome){

            System.out.println("Digite o nome do aluno: ");
            nomeDoAluno = scanNomeEIdade.next();

            if(nomeDoAluno.equals("0")) break;

            System.out.println("Digite a idade do aluno: ");
            idadeDoAluno = scanNomeEIdade.nextInt();



        }



    }
}
