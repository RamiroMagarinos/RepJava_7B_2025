import java.util.Scanner;

public class Docenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Usando AND (&&)
        if (numero >= 1 && numero <= 12) {
            System.out.println("El número " + numero + " pertenece a la primera docena.");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número " + numero + " pertenece a la segunda docena.");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("El número " + numero + " pertenece a la tercera docena.");
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }

        // Usando OR (||) para detectar fuera de rango
        if (numero < 1 || numero > 36) {
            System.out.println("El número " + numero + " está fuera de rango (detectado con OR).");
        }
    }
}

