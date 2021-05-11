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
    
    private static Scanner scanf = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        /*
        FAZER UM PROGRAMA QUE LÊ NOME, SOBRENOME, ENDEREÇO. E no final, mostrar o resultado.
        */
        
        System.out.println("Programa Imc");
        
        System.out.println("Informe o seu nome moucher");
        
        String nome = scanf.nextLine();
       
        System.out.println("O nome informado foi: " + nome);
        
        System.out.println("FIM DO PROGRAMA IMC");
        
    }
}
