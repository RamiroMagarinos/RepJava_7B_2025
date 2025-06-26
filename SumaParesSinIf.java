public class SumaParesSinIf {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 2; i <= 10; i += 2) {  // solo números pares
            suma += i;
        }

        System.out.println("La suma de los valores pares es: " + suma);
    }
}

