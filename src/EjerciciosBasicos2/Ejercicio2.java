package EjerciciosBasicos2;

/* 2) Cambia el ejercicio anterior, para que en lugar de pedir un número, pida un
carácter (char) y muestre su código en la tabla ASCII. (Pista: para convertir un
carácter a número utilizaremos “(int)+carácter”)
* */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un carácter para convertir:");
        char caracter = lector.next().charAt(0);
        int asciiCaracter = (int) caracter;
        System.out.println("El valor ascii de " + caracter + " es " + asciiCaracter + ".");
    }
}
