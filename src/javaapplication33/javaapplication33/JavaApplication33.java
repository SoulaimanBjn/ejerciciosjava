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
    
       





//
//        int[] valores = new int[30];
//        
//        for (int i = 0; i < valores.length; i++) {
//            valores[i] = (int) ((Math.random() * (10)));
//        }
//        Arrays.sort(valores);
//        System.out.println(Arrays.toString(valores));
//    
    
    
//   
//        String s1 = "prova de text!";
//        String s2 = "Prova de Text!";
//        System.out.println("Comprebemos si son iguales");
//        System.out.println(s1.equals(s2));
//        System.out.println("comprebemos si son eguales, ahora sin contar las mayusculas");
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println("compremos las consideando el orden alfabetico ");
//        System.out.println(s2.compareTo(s1)); // da la valor 32 porque segun ASCII la def entre ua letra min y su mayi es 32
//        
//        System.out.println("comparemos las considerando el orden alfabetico , sin contar mayusculas");
//        System.out.println(s1.compareToIgnoreCase(s2));
    
   


        // Ejemplo 1 :
    
//        String s1 = "Papallona";
//
//        System.out.println(s1.replace('a', 'e'));
//        System.out.println(s1);
//
//        String s2 = s1.replace('a', 'e');
        

//        double numero = 3.245777 ;
//        System.out.println(String.format("%.2f", numero));
       
        
        
// crea un programa que demane dues cadenes de text per teclat i despres indique
// si son iguales , a mes de sin son iguales sense diferenciar entre majuscules i miniscules
//        
//        Scanner reader = new Scanner(System.in);
//        System.out.println("dame la primera frase");
//        String s1 = reader.nextLine();
//        System.out.println("dame la segunda frase");
//        String s2 = reader.nextLine();
//        System.out.println("haber si son eguales ?");
//        System.out.println(s1.equals(s2));
//
//        System.out.println("comprebemos si son eguales, ahora sin contar las mayusculas");
//        System.out.println(s1.equalsIgnoreCase(s2));

    
    //crea un programa que demana dues cadenes de text : nom i congnoms. despres mostrara un codi
    // d'usuari (en majuscules) format per la contenacio de les tres primers lletres de cadascun d'ells.
    
//        Scanner reader = new Scanner(System.in);
//        System.out.println("dame tu nombre");
//        String s1 = reader.nextLine();
//        System.out.println("dame tu apellido");
//        String s2 = reader.nextLine();
//        System.out.println("Dame tu segudo appelido");
//        String s3 = reader.nextLine();
//
//        System.out.println(s1.toUpperCase().substring(0, 3) + (s2.toUpperCase().substring(0, 3)) + s3.toUpperCase().substring(0, 3));
//    
    
        Scanner reader = new Scanner(System.in);
        System.out.println("dame en phrase");
        String s1 = reader.nextLine();

        int na = 0, ne = 0, ni = 0, no = 0, nu = 0;

        for (int i = 0; i < s1.length(); i++) {
            switch (s1.toLowerCase().charAt(i)) {

                case 'a':
                    na++;
                    break;

                case 'e':
                    ne++;
                    break;

                case 'i':
                    ni++;
                    break;

                case 'o':
                    no++;
                    break;

                case 'u':
                    nu++;
                    break;
            }

        }
        System.out.println("Num de A es " + na);
        System.out.println("Num de E es " + ne);
        System.out.println("Num de I es " + ni);
        System.out.println("Num de O es " + no);
        System.out.println("Num de U es " + nu);

  
    
    
    
    }
    
}
