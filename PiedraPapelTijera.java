import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Definiciones: 0 = Piedra, 1 = Papel, 2 = Tijera");

        System.out.print("Ingrese la jugada del competidor 1: ");
        int jugador1 = scanner.nextInt();

        System.out.print("Ingrese la jugada del competidor 2: ");
        int jugador2 = scanner.nextInt();

        if (jugador1 == jugador2) {
            System.out.println("Empate");
        } else if (jugador1 == 0) { // Piedra
            if (jugador2 == 2) {
                System.out.println("Gana competidor 1 (Piedra gana a Tijera)");
            } else {
                System.out.println("Gana competidor 2 (Papel gana a Piedra)");
            }
        } else if (jugador1 == 1) { // Papel
            if (jugador2 == 0) {
                System.out.println("Gana competidor 1 (Papel gana a Piedra)");
            } else {
                System.out.println("Gana competidor 2 (Tijera gana a Papel)");
            }
        } else if (jugador1 == 2) { // Tijera
            if (jugador2 == 1) {
                System.out.println("Gana competidor 1 (Tijera gana a Papel)");
            } else {
                System.out.println("Gana competidor 2 (Piedra gana a Tijera)");
            }
        } else {
            System.out.println("Entrada inválida para competidor 1");
        }
    }
}

