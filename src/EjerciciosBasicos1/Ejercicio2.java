package EjerciciosBasicos1;

import java.util.Scanner;

/**
 * 2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 * Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
 */

public class Ejercicio2{
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
