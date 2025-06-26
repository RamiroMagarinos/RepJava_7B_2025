import java.util.Scanner;

public class ParImparSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        switch (numero % 2) {
            case 0:
                System.out.println(numero + " es un número PAR.");
                break;
            case 1:
            case -1: // Para números negativos también
                System.out.println(numero + " es un número IMPAR.");
                break;
        }
    }
}

