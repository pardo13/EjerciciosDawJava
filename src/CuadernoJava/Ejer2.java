package CuadernoJava;
/*
*A partir de una variable num1 con valor inicial 12 y una variable num2 con valor inicial 4,
* crear nuevas variables que almacenen el resultado de realizar la suma, resta, multiplicación,
* división y resto de num1 y num2. Mostrar el valor de las nuevas variables por pantalla.
 * */

public class Ejer2 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;
        System.out.println("La Suma de: "+ num1 +" y "+ num2 +" Es igual a: "+(num1+num2));
        System.out.println("La Resta de: "+ num1 +" y "+ num2 +" Es igual a: "+(num1-num2));
        System.out.println("La Multiplicación de: "+ num1 +" y "+ num2 +" Es igual a: "+(num1*num2));
        System.out.println("La División de: "+ num1 +" y "+ num2 +" Es igual a: "+(num1/num2));
        System.out.println("El Resto de: "+ num1 +" y "+ num2 +" Es igual a: "+(num1%num2));
    }
}
