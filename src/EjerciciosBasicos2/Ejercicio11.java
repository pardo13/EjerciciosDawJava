package EjerciciosBasicos2;

import java.util.Arrays;
import java.util.Scanner;

/*
* 11) Pide por teclado dos números y genera 10 números aleatorios entre esos números.
* Usa el método Math.random para generar un número aleatorio.
* */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero1 = lector.nextInt();
        System.out.println("Introduce otro número mayor que " + numero1 + ":");
        int numero2 = lector.nextInt();
        //decido meter los números en una lista
        int[] listaNumeros = new int[10];
        for (int i = 0; i < 10; i++) {
            listaNumeros[i] = generarNumeros(numero1, numero2);
        }
        System.out.println("Impresión de los números: " + Arrays.toString(listaNumeros));
    }

    public static int generarNumeros (int min, int max) {
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
