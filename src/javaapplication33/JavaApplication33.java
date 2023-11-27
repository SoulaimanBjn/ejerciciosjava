/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam_boujnani_soulaimane
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Scanner reder = new Scanner(System.in);
//        int m, n;
//        System.out.println("Dame el tamaño del vector ");
//        n = reder.nextInt();
//        System.out.println("Dame los valores que quieres");
//        m = reder.nextInt();
//        int[] tamnaño = new int[n];
//        Arrays.fill(tamnaño, m);
//        System.out.println(Arrays.toString(tamnaño));
      




//
//        int tamanio = 0, cont = 0, longarray = 17;
//        for (int i = 0; i <= longarray; i++) {
//            tamanio += i;
//        }
//
//        int[] valores = new int[tamanio];
//
//        for (int i = 1; i <= longarray; i++) {
//            Arrays.fill(valores, cont, valores.length, i);
//            cont += i;
//        }
//
//        System.out.println(Arrays.toString(valores));
//        
    
        int[] valores = new int[30];
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) ((Math.random() * (10)));
        }
        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));
    
    
    
    }
    
}
