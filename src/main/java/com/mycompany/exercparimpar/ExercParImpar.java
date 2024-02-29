package com.mycompany.exercparimpar;

import java.util.Scanner;

public class ExercParImpar {

    public static void main(String[] args) {

Scanner teclado2 = new Scanner(System.in);

int numero;

        System.out.println("Impar ou Par");
        numero = teclado2.nextInt();
        
        
        if (numero% 2 == 0){
        System.out.println("Este número é par");
         } else { 

        System.out.println("Este número é impar");
        
    }
}
}