/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Alejandro
 */
public class Main {
    //MÉTODO LLAMADO INTERPRETE DE JAVA
    public static void main(String[]args){
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
        
        int numeroParejas = 2;
        int numeroCrias = 0;
        double tasaMortalidad = 20;
        int años = 3;
        int poblacion;
        int poblacionFinal;
        
        double tasaMortalidadDecimal = (100 - tasaMortalidad) / 100;
        
        for (int i = 0; i <= años; i++) {
            poblacion = (numeroParejas * 2);
            if (i > 0) {
                poblacion += (numeroParejas * numeroCrias);
            }
            
            poblacionFinal = (int) Math.round(poblacion * tasaMortalidadDecimal);
            numeroParejas = (int) Math.round(poblacionFinal / 2);
            
            System.out.println("La población en el año " + i + " es: " + poblacion);
            System.out.println("Debido a la tasa de mortalidad, la población bajó a: " + poblacionFinal);
        }   
    }
}