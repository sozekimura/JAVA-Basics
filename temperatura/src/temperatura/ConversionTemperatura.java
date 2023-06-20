package temperatura;

import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la temperatura en grados Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Convertir la temperatura a grados Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Mostrar el resultado
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}