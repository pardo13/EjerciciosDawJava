package EjerciciosBasicos2;

/* 6) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
Utiliza el bucle que desees para realizarlo. (Pista: piensa que tienes que hacer
para que el número sea divisible por 2 o 3)
 * */

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Múltiplos de 2 y 3 (ambos) entre el 1 y el 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
