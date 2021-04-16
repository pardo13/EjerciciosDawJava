package CuadernoJava;

/*
* Construir un programa que dado el peso (en kilogramos) y la altura de una persona (en metros)
* calcule y muestre por pantalla su Indice de Masa Corporal (IMS) o índice de Quetelet.
* Este índice pretende determinar el intervalo de peso más saludable que puede tener una persona.
* El valor de este índice se calcula mediante la siguiente expresión:
*
* `IMS = peso/altura2`
*/

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double peso;
        double altura;
        double imc;
        System.out.println("Introduce tu peso en Kilogramos: ");
        peso = reader.nextDouble();
        System.out.println("Introduce tu altura en Metros: ");
        altura = reader.nextDouble();
        imc = peso/(altura*altura);
        System.out.println("Su IMC correspondiente a su peso: "+ peso + " y "+ altura +" es de: "+ imc);
    }
}
