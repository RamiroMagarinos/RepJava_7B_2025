import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del mes: ");
        String mes = scanner.nextLine().toLowerCase(); // Convertimos a minúsculas para facilitar la comparación

        int dias;

        switch (mes) {
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            case "febrero":
                dias = 28; // Asumiendo un año no bisiesto
                break;
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":

