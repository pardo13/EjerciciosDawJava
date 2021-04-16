package CuadernoJava;

import java.util.Scanner;

/*
*Construir un programa que, dado el radio de una esfera, calcule y devuelva por
pantalla el valor de la superficie y el volumen de la esfera correspondiente. Para
obtener el valor de PI, utilizar la variable estática Math.PI.

* Volumen esfera = (4/3)*PI*R3
* Superficie esfera = 4*PI*R2
* */
public class Ejer3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float PI=3.1416f;
        double radio;
        double volumen;
        double superficie;
        System.out.println("Introduce el radio: ");
        radio = reader.nextDouble();
        volumen = (4/3)*PI*Math.pow(radio,3);
        superficie = 4*PI*Math.pow(radio,2);

        System.out.println("Volumen de la esfera es: "+ volumen);
        System.out.println("La Superficie de la esfera es: "+ superficie);
    }
}
