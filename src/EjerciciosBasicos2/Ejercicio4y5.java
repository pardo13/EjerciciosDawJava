package EjerciciosBasicos2;

/* 4) Muestra los números del 1 al 100 (ambos incluidos), Usando un bucle while.
5) Haz el mismo ejercicio anterior pero con un bucle for.
* */

public class Ejercicio4y5 {
    public static void main(String[] args) {
        System.out.println("Números del 1 al 100: ");
        for (int i = 1; i <= 100; i++) {
            //quiero probar para imprimir en línea
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Números del 100 al 1: ");
        for (int i = 100; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
