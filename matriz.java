/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author OMAR
 */
public class Matriz_tres_cuatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de filas de la matriz a multiplicar");
        int f1 = teclado.nextInt();
        System.out.println("Introduce el numero de columnas de la matriz a multiplicar");
        int c1 = teclado.nextInt();
        System.out.println("Introduce el numero de filas de la segunda matriz a multiplicar");
        int f2 = teclado.nextInt();
        System.out.println("Introduce el numero de columnas de la segunda matriz a multiplicar");
        int c2 = teclado.nextInt();
        System.out.println("********Datos ingresados*********");
        System.out.println("**Matriz 1 de : " + f1 + "x" + c1 +  "**");
        System.out.println("** Matriz 2 de : " + f2 + "x" + c2 + "**");
        System.out.println("*****************************");
        if(c1 == f2){
            int a[][] = new int[c1][f1];
            int b[][] = new int [c2][f2];
            int mR[][] = new int [f1][c2];
            //Matriz 1
            System.out.println("Ingresa los valores de matriz 1");
            for (int i = 0; i < f1; i++) {
                for(int j = 0; j < c1; j++){
                    System.out.println("Introduce los valores del elemento" + i + "," + j + ":");
                    a[i][j] = teclado.nextInt();
                    
                }
            }
            for (int i = 0; i < f1; i++) {
               for(int j = 0; j < c1; j++){
                  System.out.print(  a[i][j] + " " );
//                    a[i][j] = teclado.nextInt();
    
                }
                System.out.println("");
            }
                    //Matriz 2
            System.out.println("Ingresa los valores de matriz 2");
            for (int i = 0; i < f2; i++) {
                for(int j = 0; j < c2; j++){
                    System.out.println("Introduce los valores del elemento" + i + "," + j + ":");
                    b[i][j] = teclado.nextInt();
    
                }
            }
            for (int i = 0; i < f2; i++) {
               for(int j = 0; j < c2; j++){
                  System.out.print(  b[i][j] + " " );
//                    a[i][j] = teclado.nextInt();
    
                }
                System.out.println("");
            }
            
            
            //Matriz Resultante
            System.out.println("Matriz Resultante");
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int h = 0; h < c1; h++) {
                        mR[i][j] += a[i][h] * b[h][j];
                        
                        
                    }
                    System.out.print(mR[i][j] + " ");
                    
                }
                System.out.println("");
                
                
            }
        }else{
            System.out.println("La operacion no se puede realizar");
        }


            
        }
        
    }
    

