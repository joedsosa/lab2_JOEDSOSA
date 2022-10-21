/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2joed_sosa;

import java.util.Scanner;

/**
 *
 * @author joeds
 */
public class Lab2JOED_SOSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int opciones = 1;
        while (opciones >= 1 && opciones <= 3) {
            System.out.println("Menu");
            System.out.println("1) Ejercicio 1");
            System.out.println("2) Ejercicio 2");
            System.out.println("3) Ejercicio 3");
            System.out.println("4) Salir del menu");
            opciones = entrada.nextInt();

            if (opciones == 1) {
                System.out.println("Ejercicio MCD");
                System.out.println("Ingrese su primer numero: ");
                double A = entrada.nextDouble();
                System.out.println("Ingrese su segundo numero: ");
                double B = entrada.nextDouble();
                while (A != B) {
                    if (A > B) {
                        A = A - B;
                    } else if (B > A) {

                        {
                            B = B - A;
                            System.out.println("El MCD de sus numeros: " + B);

                        }

                    }
                }
            }else if (opciones == 2){
                    
                System.out.println("Ejercicio 2");
                System.out.println("Ingrese su año de nacimiento");
                int a = entrada.nextInt();
                if (a >= 2013 && a <= 2025) {
                    System.out.println("Usted es parte de la GEN ALPHA");
                } else if (a >= 1995 && a <= 2012) {
                    System.out.println("Usted es parte de la GEN Z");
                } else if (a >= 1986 && a <= 1994) {
                    System.out.println("Usted es parte de la GEN Millenials");
                } else if (a >= 1980 && a <= 1985) {
                    System.out.println("Usted es parte de la GEN XENNIALS");
                } else if (a >= 1965&& a <= 1979) {
                    System.out.println("Usted es parte de la GENERATION X");
                } else if (a >= 1946 && a <= 1964) {
                    System.out.println("Usted es parte de la BABY BOOMER GEN");
                } else {
                    System.out.println("no valido");

                }

            } else if (opciones == 3) {
                System.out.println("Ingrese el tipo de POKEMON : 1. HADA  2. HIERRO  3. LUCHADOR  4. PSIQUICO ");
                System.out.println("ingrese el tipo de atacador: ");
                int atacador = entrada.nextInt();
                System.out.println("Ingrese el tipo de defensor: ");
                int defensor = entrada.nextInt();
                if (atacador== 1 && defensor== 2){
                    System.out.println("HADA es debil contra HIERRO");
                }else if (atacador ==1 && defensor ==1){
                    System.out.println("HADA ES NEUTRO CONTRA HADA");
                }else if(atacador == 1 && defensor ==3){
                    System.out.println("HADA ES SUPER EFICAZ CONTRA ");                   
                }else if(atacador== 1 && defensor ==4){
                    System.out.println("HADA ES NEUTRAL CONTRA HADA ");  
                }else if(atacador==2 && defensor ==1){
                    System.out.println("HIERRO ES NEUTRAL CONTRA LUCHADOR");                                   
                }else if (atacador ==2 && defensor ==2){
                    System.out.println("HIERRO ES DEBIL CONTRA HIERRO");
                }else if(atacador ==2 && defensor ==3){
                    System.out.println("HIERRO ES NEUTRO CONTRA LUCHADOR");
                }else if (atacador ==2 && defensor ==4){
                    System.out.println("HIERRO ES NUETRO CONTRA PSIQUICO");
                }else if (atacador ==3 && defensor ==1){
                    System.out.println("LUCHADOR ES DEVIL CONTRA HADA");
                }else if (atacador ==3 && defensor ==2){
                    System.out.println("LUCHADOR ES SUPER EFICAZ CONTRA HIERRO ");
                }else if (atacador ==3 && defensor ==3){
                    System.out.println("LUCHADOR ES NEUTRO CONTRA LUCHADOR");
                }else if (atacador ==3 && defensor ==4){
                    System.out.println("LUCHADOR ES DEBIL CONTRA PSIQUICO");
                }else if (atacador ==4 && defensor ==1){
                    System.out.println("PSIQUICO ES NEUTRO CONTRA HADA");
                }else if (atacador ==4 && defensor ==2){
                    System.out.println("PSYQUICO ES DEBIL CONTRA HIERRO ");
                }else if (atacador ==4 && defensor ==3){
                    System.out.println("PSIQUICO ES SUPER EFICAZ CONTRA LUCHADOR");
                }else if (atacador ==4 && defensor ==4){
                    System.out.println("PSIQUICO ES DEBIL CONTRA PSIQUICO");
                }
                
                    
                    
                
               
                
                

            } else {
                System.out.println("ERROR 504");

            }
            
        }
    }
}