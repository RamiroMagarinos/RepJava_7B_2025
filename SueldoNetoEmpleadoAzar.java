public class SueldoNetoEmpleadoAzar {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 10) {
            // Generar categoría al azar (A, B o C)
            char categoria = generarCategoria();

            // Generar antigüedad al azar entre 0 y 20 años
            int antiguedad = (int) (Math.random() * 21); // 0 a 20 inclusive

            // Generar sueldo bruto al azar entre 10000 y 50000
            double sueldoBruto = 10000 + Math.random() * 40000;

            // Validar categoría válida
            if (categoria == 'A' || categoria == 'B' || categoria == 'C') {
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
                }

                double sueldoNeto = sueldoBruto + aumento + plus;

                System.out.printf("Empleado %d - Categoría: %c, Antigüedad: %d años, Sueldo bruto: %.2f, Sueldo neto: %.2f\n",
                        (contador + 1), categoria, antiguedad, sueldoBruto, sueldoNeto);
                contador++;
            }
        }
    }

    public static char generarCategoria() {
        // Genera un número entre 0 y 2, luego mapea a A,B o C
        int valor = (int) (Math.random() * 3);
        switch (valor) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            default:
                return 'A'; // fallback (no debería pasar)
        }
    }
}

