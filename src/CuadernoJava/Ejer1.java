package CuadernoJava;

/*
Crear dos variables de cualquiera de los tipos básicos, dar un valor a la primera
y a continuación asigne la segunda a la primera. Imprimir por pantalla las dos
variables. Cambiar el valor de la segunda variable y volver a imprimir las variables
por pantalla. ¿Qué es lo que ocurre?
* */

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
/*        Scanner reader = new Scanner(System.in);
        String nombre;
        int edad = 0;

        System.out.println("Introduce tu nombre: ");
        nombre = reader.nextLine();

        System.out.println("Introduce tu edad:");
        edad = reader.nextInt();

        System.out.println("Los datos introducidos son: "+ nombre +" Tienes la edad de: "+ edad + "años");
    }
    public void ejer1plus(){*/
        Scanner reader = new Scanner(System.in);
        String nombre = "Eymi Pardo";
        int edad = 28;
        System.out.println("Los datos introducidos son: " + nombre + " Tienes la edad de: "+ edad );
    }
}
