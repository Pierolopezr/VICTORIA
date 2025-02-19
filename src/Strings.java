/**
 * @author Piero López Rosas
 * String, introducción + ejercicios
 */
import java.util.Scanner;
public class Strings { // Declaro la clase principal
    public static void main(String[] args) { // Punto de inicio del programa

        /**
         * Introducción al String
         * Declarar String e imprimirlo por pantalla
         */

        String saludo = "Hola, bienvenido a JAVA"; // Declaro el String
        String nombre = "Piero";

        System.out.println(saludo + "! " +nombre + "."); // Imprimo por pantalla

        System.out.println("------------------- x ------------------------------------");

        /**
         *
         * Concatenación : Unir Strings
         * Unir los String usando "+"
         */

        // nome + apellido

        String nome = "Piero";
        String apellido = "López";

        String nomeCompleto = nome + " " + apellido; // Uno strings mediante "+"
        System.out.println("Mi nombre completo es " + nomeCompleto); // muestro por patalla el String concatenado

        //  nome + comida favorita (Scanner)

        Scanner op = new Scanner(System.in);
        System.out.println("Hola Piero, dime tu plato favorito: ");
        String platoFav = op.nextLine();



        String nomeYplato = nomeCompleto + " y " + platoFav; // Uno strings meidante "+"
        System.out.println("Tu nombre completo y plato favorito es: " + nomeYplato); // Muestro por pantalla el String concatenado

        /**
         * Longitud de un String (.length())
         * Nos dice cuántos carácteres tiene un String
         */

        // logitud de "Hola mundo"

        String mensaje = "Hola mundo";
        int longitud = mensaje.length();

        System.out.println("El mensaje tiene " + longitud + " caracteres.");

       // longitud de palabra dicha por Scanner

        Scanner ob = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = ob.nextLine();  // Lee una sola palabra
        System.out.println("La longitud de la palabra es: " + palabra.length());
        ob.close();

    }
}
