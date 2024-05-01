/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Main {

    //MÉTODO LLAMADO INTERPRETE DE JAVA
    public static void main(String[] args) {
        //1.- DECLARACIÓN DE VARIABLES A TRAVÉS DE DATOS PRIMITIVOS
        //NÚMEROS ENTEROS
//        int numero = 0;
//        //NÚMEROS DECIMALES
//        double decimales = 0.0;
//        //CARACTERES
//        char caracter = 'a';
//        //BOOLANEOS
//        boolean booleaneo = true;
//        
//        //MODIFICAR VALORES
//        numero = 15;

        //2.- IMPRIMIR EN CONSOLA
        //System.out.println("El valor del entero es: " + numero);
        //System.out.println("El valor del decimal es: " + decimales);
        //System.out.println("El valor del caracter es: " + caracter);
        //System.out.println("El valor del booleaneo es: " + booleaneo);
        //3. DECLARACIÓN DE OBJETOS
        //TIPO TEXTO
        //String malasNoticias = "Hoy es viernes y mañana hay clases";
        //System.out.println("El contenido de la cadena es: " + malasNoticias);
        //EJERCICIO POBLACIONAL, VAMOS A SIMULAR LA POBLACIÓN DE
        //CONEJOS. POR LO QUE NECESITO CONOCER LOS SIGUIENTES DATOS:
        //1.- EL NÚMERO DE PAREJAS DE CONEJOS
        //2.- EL NÚMERO DE CRÍAS POR PAREJA
        //3.- EL PORCENTAJE DE TASA DE MORTALIDAD ANUAL
        //4.- SIMULAR DURANTE UN PERIODO DE TIEMPO
        Scanner s = new Scanner(System.in);
        //imprime en consola un mensaje
        System.out.println("Ingrese el numero de parejas");
        //capturar el mensaje
        int parejas = s.nextInt();
        // imprimo mensaje
        System.out.println("ingrese el numero de crias");
        //captura la entrada realizada pro el usuario mediante teclado
        int nCrias = s.nextInt();

        double tMortalidad = 20;
        int periodo = 5;
        int pAnual = 0;
        int pTotal = 0, pMorir = 0, crias = 0;

        for (int i = 0; i <= periodo; i++) {
            if (i == 0) {
                pAnual = parejas * 2;
                pMorir = (int) (pAnual * (tMortalidad) / 100);
                pTotal = pAnual - pMorir;
            } else {
                crias = parejas * nCrias;
                pAnual += crias;
                pMorir = (int) (pAnual * (tMortalidad) / 100);
                pTotal = pAnual - pMorir;
                parejas = pTotal / 2;

            }
            System.out.println("Año:" + i + "\n"
                    + "Población Actual es:" + pAnual);
            System.out.println("Población Morir es:" + pMorir);
            System.out.println("Población Total es:" + pTotal);
            System.out.println("El Número de parejas es:" + parejas);
            System.out.println("Número de Crias anuales:" + crias);
        }
    }
}
