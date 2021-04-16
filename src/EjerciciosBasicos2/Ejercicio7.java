package EjerciciosBasicos2;
/* 7) Realiza una aplicación que nos pida un número de productos vendidos,
después nos pedirá el precio de cada producto (tendrá que pedirnos tantos
precios como productos le hayamos indicado al principio) Al final mostrará
la suma del total de productos por el precio de cada producto.
Piensa que es lo que se repite y lo que no.
 * */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuántas ventas has hecho?");
        int ventas = lector.nextInt();
        double totalVentas = 0;
        for (int i = 0; i < ventas; i++) {
            System.out.println("Introduce el valor de la venta número " + (i+1) + ":");
            double unicaVenta = lector.nextDouble();
            totalVentas += unicaVenta;
        }
        System.out.println("El total de todas las ventas es " + totalVentas);
    }
}
