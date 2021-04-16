package EjerciciosBasicos2;

/*
*12) Pide por teclado un número entero positivo y muestra el número de cifras que tiene.
* Por ejemplo: si introducimos 1250, nos muestra que tiene 4 cifras.
* Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.
* (Pista: tendrás que hacer dos bucles para lograrlo)
*  */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int miNumero = 0;
        while (miNumero <= 0) {
            System.out.println("Introduce un número entero positivo:");
            miNumero = lector.nextInt();
            if (miNumero <= 0) {
                System.out.println("Error.");
            }
        }
        int cifras = 0;
        int controlador = miNumero;
        while (controlador > 0) {
            controlador /= 10;
            cifras += 1;
        }
        System.out.println("El número " + miNumero + " tiene " + cifras + " cifras ");
    }
}
