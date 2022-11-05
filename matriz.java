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
//        System.out.println("Introduce el numero de filas de la matriz a multiplicar");
//        int f1 = teclado.nextInt();
//        System.out.println("Introduce el numero de columnas de la matriz a multiplicar");
//        int c1 = teclado.nextInt();
//        System.out.println("Introduce el numero de filas de la segunda matriz a multiplicar");
//        int f2 = teclado.nextInt();
//        System.out.println("Introduce el numero de columnas de la segunda matriz a multiplicar");
//        int c2 = teclado.nextInt();
//        System.out.println("********Datos ingresados*********");
//        System.out.println("**Matriz 1 de : " + f1 + "x" + c1 +  "**");
//        System.out.println("** Matriz 2 de : " + f2 + "x" + c2 + "**");
        System.out.println("*****************************");
            int a[][] = new int[3][2];
            int b[][] = new int [2][3];
            int mR[][] = new int [3][3];
            //Matriz 1
            System.out.println("Ingresa los valores de matriz 1");
            for (int i = 0; i < 3; i++) {
                for(int j = 0; j < 2; j++){
                    System.out.println("Introduce los valores del elemento" + i + "," + j + ":");
                    a[i][j] = teclado.nextInt();
                    
                }
            }
            for (int i = 0; i < 3; i++) {
               for(int j = 0; j < 2; j++){
                  System.out.print(  a[i][j] + " " );
//                    a[i][j] = teclado.nextInt();
    
                }
                System.out.println("");
            }
                    //Matriz 2
            System.out.println("Ingresa los valores de matriz 2");
            for (int i = 0; i < 2; i++) {
                for(int j = 0; j < 3; j++){
                    System.out.println("Introduce los valores del elemento" + i + "," + j + ":");
                    b[i][j] = teclado.nextInt();
    
                }
            }
            for (int i = 0; i < 2; i++) {
               for(int j = 0; j < 3; j++){
                  System.out.print(  b[i][j] + " " );
//                    a[i][j] = teclado.nextInt();
    
                }
                System.out.println("");
            }
            
            
            //Matriz Resultante
            System.out.println("Matriz Resultante");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int h = 0; h < 2; h++) {
                        mR[i][j] += a[i][h] * b[h][j];
                        
                        
                    }
                    System.out.print(mR[i][j] + " ");
                    
                }
                System.out.println("");
                
                
            }
        }


            
        }
        
    
    


    

