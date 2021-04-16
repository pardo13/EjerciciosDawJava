package EjerciciosBasicos2;

/*1) Lee un número por teclado y haz que se muestre por consola el carácter al que pertenece en la tabla ASCII.
Por ejemplo: si introduzco un 97, me muestre una a. (Pista: para convertir un número a carácter
utilizaremos “(char)+numero”)
*
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean valido = false;
        while (valido == false) {
            System.out.println("Introduce un número (97 o superior) para convertir:");
            int numero = lector.nextInt();
            if (numero < 97) {
                System.out.println("Número incorrecto.");
            } else {
                char ascii = (char) numero;
                System.out.println("Su ASCII es '" + ascii + "'.");
                valido = true;
            }
        }
    }
}
