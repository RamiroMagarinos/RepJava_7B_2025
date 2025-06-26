import java.util.Scanner;

public class VocalOConsonante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");
        char c = scanner.next().toLowerCase().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("El carácter es una vocal.");
        } else {
            System.out.println("El carácter NO es una vocal.");
        }
    }
}

