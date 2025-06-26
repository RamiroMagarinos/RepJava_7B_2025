import java.util.Scanner;

public class CategoriaFamiliar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una categoría (a, b o c): ");
        char categoria = scanner.next().toLowerCase().charAt(0); // Convertimos a minúscula

        switch (categoria) {
            case 'a':
                System.out.println("hijo");
                break;
            case 'b':
                System.out.println("padres");
                break;
            case 'c':
                System.out.println("abuelos");
                break;
            default:
                System.out.println("Categoría no válida. Debe ser 'a', 'b' o 'c'.");
        }
    }
}

