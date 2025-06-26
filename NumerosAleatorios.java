import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        int contador = 0;
        int suma = 0;

        while (contador < 10) {
            int numero = rand.nextInt(100) + 1; // números del 1 al 100
            System.out.println("Número " + (contador + 1) + ": " + numero);
            suma += numero;
            contador++;
        }

        double promedio = suma / 10.0;
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}

