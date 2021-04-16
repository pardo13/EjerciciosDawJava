package EjerciciosBasicos1.EjercicioOperaciones1;

import java.util.Scanner;

/**1) Declara dos variables numéricas (con el valor que desees),
 * muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
**/

public class Ejercicio1Suma {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        System.out.println("Introduce el primer número:");
        num1 = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        num2 = reader.nextInt();

        int resultado = num1 + num2;

        System.out.println("La suma es " + num1 + " + " + num2 + " = " + resultado);
    }
}


