
package Calculadora;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); //Creación del lector para toda la calculadora
        //Imprimimos el menu principal de la calculadora
        boolean salir = false;
        while (salir == false) {
            System.out.println("------------------------------------------");
            System.out.println("-------- C A L C U L A D O R A -----------");
            System.out.println("==========================================");
            System.out.println("Selecciona una de las siguientes opciones:");
            System.out.println("__________________________________________");
            System.out.println("--> 1.- S U M A R");
            System.out.println("--> 2.- R E S T A R");
            System.out.println("--> 3.- M U L T I P L I C A R");
            System.out.println("--> 4.- D I V I D I R");
            System.out.println("--> 5.- R E S T O");
            System.out.println("--> 6.- SALIR");
            System.out.println("-------------------------------------------");
            System.out.println("Opción: ");
            int seleccion = lector.nextInt();

            switch (seleccion) {
                case 1:
                    sumar(lector);
                    break;
                case 2:
                    restar(lector);
                    break;
                case 3:
                    multiplicar(lector);
                    break;
                case 4:
                    division(lector);
                    break;
                case 5:
                    resto(lector);
                    break;
                case 6:
                    salir = true;
                    System.out.println("================");
                    System.out.println("  Hasta Luego!!!");
                    System.out.println("=================");
                    break;
                default:
                    System.out.println("Esta opción es imposible");
            }
        }
    }

        public static void sumar(Scanner lector){
            double num1 = 0;
            double num2 = 0;
            System.out.println("Introduce el primer número:");
            num1 = lector.nextDouble();
            System.out.println("Introduce el segundo número:");
            num2 = lector.nextDouble();
            double resultado = num1 + num2;
            System.out.println("*****************************************************");
            System.out.println("La suma es " + num1 + " + " + num2 + " = " + resultado);
            System.out.println("*****************************************************");
        }
        public static void restar(Scanner lector){
            double num1 = 0;
            double num2 = 0;
            System.out.println("Introduce el primer número:");
            num1 = lector.nextDouble();

            System.out.println("Introduce el segundo número:");
            num2 = lector.nextDouble();
            double resultado = num1 - num2;
            System.out.println("******************************************************");
            System.out.println("La resta es " + num1 + " - " + num2 + " = " + resultado);
            System.out.println("******************************************************");
        }
        public static void multiplicar(Scanner lector){
            double num1 = 0;
            double num2 = 0;
            System.out.println("Introduce el primer número:");
            num1 = lector.nextDouble();

            System.out.println("Introduce el segundo número:");
            num2 = lector.nextDouble();

            double resultado = num1 * num2;
            System.out.println("***************************************************************");
            System.out.println("La multiplicación es " + num1 + " * " + num2 + " = " + resultado);
            System.out.println("***************************************************************");
        }
        public static void division(Scanner lector){
            double num1 = 0;
            double num2 = 0;
            System.out.println("Introduce el primer número:");
            num1 = lector.nextDouble();

            System.out.println("Introduce el segundo número:");
            num2 = lector.nextDouble();

            double resultado = num1 / num2;

            System.out.println("*********************************************************");
            System.out.println("La división es " + num1 + " / " + num2 + " = " + resultado);
            System.out.println("*********************************************************");
        }
        public static void resto(Scanner lector){
            double num1 = 0;
            double num2 = 0;
            System.out.println("Introduce el primer número:");
            num1 = lector.nextDouble();

            System.out.println("Introduce el segundo número:");
            num2 = lector.nextDouble();

            double resultado = num1 % num2;

            System.out.println("******************************************************");
            System.out.println("El resto es " + num1 + " % " + num2 + " = " + resultado);
            System.out.println("******************************************************");
        }
}