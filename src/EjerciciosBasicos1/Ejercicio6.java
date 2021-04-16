package EjerciciosBasicos1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Introduce un número:");
        num1 = reader.nextInt();

        System.out.println("Introduce el número que quieres saber si es divisible: ");
        num2 = reader.nextInt();
        if (num1%num2 == 0)
            System.out.println(num1 + " Sí es divisible por " + num2);
        else
            System.out.println(num1 + " No es divisible por " + num2);
    }
}
