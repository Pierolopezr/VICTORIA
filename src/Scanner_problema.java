import java.util.Scanner; // Importamos Scanner
/**
 * @author Piero López Rosas
 * 📌 Tarea: Crea un programa que le pida al usuario:
 * ✅ Nombre
 * ✅ Edad
 * ✅ Ciudad
 * ✅ Hobby favorito
 * Y muestre un mensaje como este:
 * ¡Hola! Me llamo Juan, tengo 25 años, vivo en Madrid y me gusta jugar videojuegos.
 */
public class Scanner_problema { // Defino la clase principal del programa
    public static void main(String[] args) { // El punto de inicio del programa
        Scanner op = new Scanner(System.in); // Creamos un objeto Scanner
        System.out.println("Hola. Cuál es tu nombre?: "); // Mensaje para el usuario
        String nome = op.nextLine(); // Guarda el texto ingresado

        System.out.println("Cuántos años tienes¿?: "); // Mensaje para el usuario
        int anos = op.nextInt(); // Guarda un número entero
        op.nextLine(); // Limpieza del buffer

        System.out.println("¿En qué ciudad vives?");
        String ciudade = op.nextLine(); // Guarda el texto ingresado

        System.out.println("¿Cuál es tu hobby favorito?");
        String hobby = op.nextLine();

        System.out.println("Cuál es tu profesión?");
        String profesion = op.nextLine();

        System.out.println("¡Hola! Me llamo "+ nome +", tengo "+ anos + " años, vivo en " + ciudade + ", me gusta " + hobby + " y soy " + profesion + ".");
    }
}
