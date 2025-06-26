import java.util.Random;

public class MaxMinAleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        int contador = 0;
        int max = Integer.MIN_VALUE;  // Inicializamos al menor valor posible
        int min = Integer.MAX_VALUE;  // Inicializamos al mayor valor posible

        do {
            int numero = rand.nextInt(100) + 1; // números entre 1 y 100
            System.out.println("Número " + (contador + 1) + ": " + numero);

            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
            contador++;
        } while (contador < 10);

        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
    }
}

