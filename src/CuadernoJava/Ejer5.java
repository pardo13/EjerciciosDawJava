package CuadernoJava;

import java.util.Scanner;

/**
 *Definir dos variables num1 y num2 e implementar un programa que asigne un valor a cada una,
 * y obtenga el mayor de los dos, mostrando el resultado por pantalla.
 */
public class Ejer5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Introduce el primer número:");
        num1 = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        num2 = reader.nextInt();
        if (num1>num2){
            System.out.println("El numéro mayor es:"+num1);
        }else{
            System.out.println("El número mayor es:" + num2);
        }if(num1 == num2){
            System.out.println("Los números introducidos son iguales");
        }
    }
}
