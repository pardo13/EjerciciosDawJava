package EjerciciosBasicos2;

/* 3) Lee un número por teclado que pida el precio de un producto (puede tener decimales)
y calcule el precio final con IVA. El IVA será una constante que será del 21%.

 * */

import java.util.Scanner;

public class Ejercicio3 {
    public static final double IVA = 0.21;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el precio base del producto:");
        double precio = lector.nextDouble();
        System.out.println("El precio con IVA es " + (precio * (1 + IVA)));
    }
}
