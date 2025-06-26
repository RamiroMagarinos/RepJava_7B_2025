import java.util.Scanner;

public class SueldoNetoEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);

        System.out.print("Ingrese la antigüedad (en años): ");
        int antiguedad = scanner.nextInt();

        System.out.print("Ingrese el sueldo bruto: ");
        double sueldoBruto = scanner.nextDouble();

        // Calcular aumento por antigüedad
        double aumento = 0;
        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = 0.05 * sueldoBruto;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = 0.10 * sueldoBruto;
        } else if (antiguedad > 10) {
            aumento = 0.30 * sueldoBruto;
        }

        // Plus por categoría
        int plus = 0;
        switch (categoria) {
            case 'A':
                plus = 1000;
                break;
            case 'B':
                plus = 2000;
                break;
            case 'C':
                plus = 3000;
                break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }

        double sueldoNeto = sueldoBruto + aumento + plus;

        System.out.println("Sueldo neto: " + sueldoNeto);
    }
}

