package Practica2Java;

import java.util.Arrays;
import java.util.Scanner;

public class ejerciciosPractica2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //A partir de este punto se elabora el menú que contendrá los ejercicios propuestos
        boolean salir=false;
        while (salir==false){
            System.out.println("********************************************");
            System.out.println("                Bienvenido !!!              ");
            System.out.println("********************************************");
            System.out.println("Seleccione uno de los siguietes ejercicios: ");
            System.out.println("---> 1.- PRIMER EJERCICIO   ");
            System.out.println("---> 2.- SEGUNDO EJERCICIO  ");
            System.out.println("---> 3.- TERCER EJERCICIO   ");
            System.out.println("---> 4.- CUARTO EJERCICIO   ");
            System.out.println("---> 5.- QUINTO EJERCICIO   ");
            System.out.println("---> 6.- SEXTO EJERCICIO    ");
            System.out.println("---> 7.- SÉPTIMO EJERCICIO  ");
            System.out.println("---> 8.- OCTAVO EJERCICIO   ");
            System.out.println("---> 9.- NOVENO EJERCICIO   ");
            System.out.println("--->      10.- SALIR         ");
            System.out.println("--------------------------------------------");
            System.out.println(">>> Opción: ");
            int seleccion = sc.nextInt();
            //aquí las cadenas de dos ejercicios para poder realizarlas y se aplique el método
            String sCadenaInvertida = "";
            String cadenaSinBlancos = "";


            //A partir de aquí se realizaría el procedimiento para la elección de las opciones del menu
            switch (seleccion){
                case 1:
                    primerEjercicio(sc);
                    break;
                case 2:
                    segundoEjercicio(sc);
                    break;
                case 3:
                    tercerEjercicio(sc);
                    break;
                case 4:
                    cuartoEjercicio(sc);
                    break;
                case 5:
                    quintoEjercicio(sCadenaInvertida);
                    break;
                case 6:
                    sextoEjercicio(cadenaSinBlancos);
                    break;
                case 7:
                    septimoEjercicio(sc);
                    break;
                case 8:
                    octavoEjercicio(sc);
                    break;
                case 9:
                    novenoEjercicio(sc);
                    break;
                case 10:
                    salir = true;
                    System.out.println("======================");
                    System.out.println("  Hasta la próxima !!!");
                    System.out.println("======================");
                    break;
                default:
                    System.out.println("Esta opción es imposible");
            }
        }
    }

    /*Leer 5 números (con bucle por favor, no pongáis 5 scanner consecutivos) y mostrarlos
    en el mismo orden introducido. Los 5 números se deben almacenar en un array.
    * */
    public static void primerEjercicio(Scanner sc){
        int[] primerArray = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.println("Introduce un número: ");
            int num = sc.nextInt();
            primerArray[i] = num; //array en el que se guardaría los números introducidos
        }
        System.out.println("--------------------------------");
        System.out.println("Impresión en orden introducido: ");
        System.out.println(Arrays.toString(primerArray));
    }

    //Leer 5 números y mostrarlos en orden inverso al introducido.
    public static void segundoEjercicio(Scanner sc){
        int[] segundoArray = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número: ");
            int num = sc.nextInt();
            segundoArray[4-i] = num; //en este punto el segundo array haría la inversión
        }
        System.out.println("--------------------------------");
        System.out.println("Impresión en orden invertido: ");
        System.out.println(Arrays.toString(segundoArray));
    }

    /*Leer 5 números por teclado y a continuación realizar la media de los números positivos,
    la media de los negativos y contar el número de ceros que se han introducido por teclado.*/
    public static void tercerEjercicio(Scanner sc){
        //Se declara las variables antes del for para su funcionamiento
        int totalPositivo = 0;
        int numeroPositivo = 0;
        int totalNegativo = 0;
        int numeroNegativo = 0;
        int numeroCeros = 0;
        //A partir de aquí se realizaría el "for"
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce a continuación un número:");
            int numero = sc.nextInt();
            if (numero == 0) {
                numeroCeros += 1;
            } else if (numero > 0) {
                totalPositivo += numero;
                numeroPositivo += 1;
            } else {
                totalNegativo += numero;
                numeroNegativo += 1;
            }
        }
        if (numeroCeros == 0) {
            System.out.println("No has introducido ningún 0");
        } else {
            System.out.println("Has introducido el 0: " + numeroCeros + " veces");
        }
        if (numeroPositivo == 0) {
            System.out.println("No has introducido ningún número positivo");
        } else {
            System.out.println("La media de los números positivos es " + (totalPositivo / numeroPositivo));
        }
        if (numeroNegativo == 0) {
            System.out.println("No has introducido ningún número negativo");
        } else {
            System.out.println("La media de los números negativos es " + (totalNegativo / numeroNegativo));
        }
    }

    /*Reciba como parámetro un texto y devuelva la cantidad de caracteres que incorpora el texto.
    (ojo! no puede contar espacios en blanco, pista: podéis usar “.replace”)*/
    public static void cuartoEjercicio(Scanner sc){
        System.out.println("Mi frase a analizar es la siguiente:");
        System.out.println("Desarrollo de Aplicaciones Web");
        String miFrase = "Desarrollo de Aplicaciones Web" ;
        int contador = 0;
        for (int i = 0; i < miFrase.length(); i++){
            contador += 1;
        }
        System.out.println(contador + " cantidad total de caracteres");
    }

    //Reciba como parámetro un texto y devuelva el texto invertido.
    public static void quintoEjercicio(String sCadenaInvertida){
        System.out.println("Mi frase a analizar es la siguiente:");
        System.out.println("Desarrollo de Aplicaciones Web");
        String textoFrase = "Desarrollo de Aplicaciones Web";
        for (int i = textoFrase.length()-1; i >= 0 ; i--){
            sCadenaInvertida = sCadenaInvertida + textoFrase.charAt(i);
        }
        System.out.println(sCadenaInvertida);

    }
    //Reciba como parámetro un texto y lo devuelva sin espacios en blanco.
    public static void sextoEjercicio(String cadenaSinBlancos){
        System.out.println("Mi frase a analizar es la siguiente:");
        System.out.println("Desarrollo de Aplicaciones Web");
        String textoFrase = "Desarrollo de Aplicaciones Web";
        for (int x=0; x < textoFrase.length(); x++) {
            if (textoFrase.charAt(x) != ' ')
                cadenaSinBlancos += textoFrase.charAt(x);
        }
        System.out.println(cadenaSinBlancos);
    }

    //Reciba como parámetro dos cadenas y las devuelva concatenadas.
    public static void septimoEjercicio(Scanner sc){
        System.out.println("Esta es mi primera cadena ");
        System.out.println("Esta es mi segunda cadena ");
        String cadena1 = "Esta es mi primera cadena ";
        String cadena2 = "Esta es mi segunda cadena ";
        System.out.println("Este sería el resultado de concatenar 2 cadenas: ");
        System.out.println("-------------------------------------------------");
        System.out.println("1º cadena: "+ cadena1 + "2º cadena: " + cadena2);
    }

    /*Reciba como parámetro una cadena y una vocal, el método sustituye todas las vocales
    de la cadena por la vocal que se ha pasado como parámetro (no devuelve nada).*/
    public static void octavoEjercicio(Scanner sc){
        System.out.println("Mi frase a analizar es la siguiente:");
        System.out.println("Desarrollo de Aplicaciones Web");
        String textoFrase = "Desarrollo de Aplicaciones Web";
        textoFrase = textoFrase.replace('a','e');
        textoFrase = textoFrase.replace('i','e');
        textoFrase = textoFrase.replace('o','e');
        textoFrase = textoFrase.replace('u','e');
        System.out.println(textoFrase);
    }

    /*Reciba como parámetro una cadena, y muestre el código ASCII de cada uno de los
    caracteres de la cadena (no devuelve nada el método).*/
    public static void novenoEjercicio(Scanner sc){
        System.out.println("Mi frase a analizar es la siguiente:");
        System.out.println("Desarrollo de Aplicaciones Web9");
        String textoFrase = "Desarrollo de Aplicaciones Web";
        for (int i = 0; i < textoFrase.length(); i++) {
            if (textoFrase.charAt(i) != ' ') {
                System.out.print((int)textoFrase.charAt(i) + " ");
            }
        }
    }
}
