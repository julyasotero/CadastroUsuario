/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sotero.imc;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    private static Scanner scanf = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        FAZER UM PROGRAMA QUE LÊ NOME, SOBRENOME, ENDEREÇO. E no final, mostrar o resultado.
         */
 /*System.out.println(":::...CADASTRO DE USUARIO...:::");

        System.out.println("Informe o seu nome moucher");

        String nome = scanf.nextLine();

        System.out.println("O nome informado foi: " + nome);

        System.out.println(":::...FIM CADASTRO DE USUARIO...:::");
         */
        System.out.println("CADASTRO USUARIO");

        System.out.println("Infome seu Nome");

        String nome = scanf.nextLine();

        System.out.println("Informe seu SobreNome");

        String sobreNome = scanf.nextLine();

        System.out.println("Informe seu Endereco");

        String endereco = scanf.nextLine();

        System.out.println("Final do cadastro");

        System.out.println("Nome: " + nome);
        System.out.println("SobreNome: " + sobreNome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Final do cadastro");
    }
}
