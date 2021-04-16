package EjerciciosBasicos1;

import java.util.Scanner;

/**
 * Haz una aplicación que calcule el área de un círculo(pi*R2).
 * El radio se pedirá por teclado. Usa la constante PI y el método pow de Math.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float PI=3.1416f;
        double radio;
        double area;
        System.out.println("Introduce el radio: ");
        radio = reader.nextInt();
        area=PI*Math.pow(radio,2);
        System.out.println("El area del círculo es: "+ area);
    }
}
