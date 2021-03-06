/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriovariables66206;

import java.util.Scanner;

/**
 *
 * @author starco
 */
public class LaboratorioVariables66206 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
boolean booleano;
char caracter;
byte numeroMuyPequeño;
short numeroPequeño;
int entero;
long largo;
float flotante;
double doble;

entero = 97;
doble = 97;
caracter = 97;
        System.out.println("el valor 97 como entero es: " + entero);
        System.out.println("el valor 97 como doble es: " + doble);
        System.out.println("el valor 97 como caracter es: " + caracter);
        
        String cadena = new String("variables de referencia!");
        Scanner lector = new Scanner (System.in);
        System.out.println("¡Los String en Java son " + cadena);
        System.out.println("");
        
        booleano = true;
        caracter = '7';
        System.out.println(booleano);
        System.out.println(caracter);
        System.out.println("");
        booleano = false;
        caracter = '\n';
        System.out.println("el caracter salto de linea en accion: ");
        System.out.println(caracter);
        
        flotante = 3.14159265f;
        System.out.println("flotante");
        
        cadena = "¡Puedes asignar valores a un String con literales!";
        System.out.println("cadena");
        System.out.println("caracter");
        
        System.out.println("¿Como te llamas?: ");
        String nombre= lector.nextLine();
        System.out.println("¿Cuantos años tienes?: ");
        int edad = lector.nextInt();
        System.out.println("¡Te llamas " + nombre + "y tienes "+ edad + "años");
        
}
        // TODO code application logic here
    }
    

