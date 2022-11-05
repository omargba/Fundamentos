/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serieFibonacci;

import java.util.Scanner;

/**
 *
 * @author OMAR
 */
public class fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, a=0, b=1, c;
        int contador = 0;
        System.out.print("Ingresa el numero limite para la serie de fibonacci: ");
        n = teclado.nextInt();
        System.out.println("***** El lomite sera: " + n + "*******");
        int arreglo[]  = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

                        
            
        }
    }
    
}
