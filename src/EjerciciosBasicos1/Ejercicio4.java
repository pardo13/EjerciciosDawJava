package EjerciciosBasicos1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombre;
        System.out.println("Introduce tu nombre: ");
        nombre = reader.nextLine();
        System.out.println("Bienvenido "+nombre);
    }
}
