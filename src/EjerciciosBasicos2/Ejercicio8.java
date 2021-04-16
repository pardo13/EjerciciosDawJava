package EjerciciosBasicos2;
/*
8) Lee un número por teclado y comprueba que este número es mayor o igual que cero,
si no lo es lo volverá a pedir (do while), después haz que nos muestre el número por consola.
* */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;
        do {
            System.out.println("Escribe un número mayor o igual que 0:");
            num = lector.nextInt();
            if (num < 0) {
                System.out.println("Número incorrecto.");
            }
        } while (num < 0);
    }
}
