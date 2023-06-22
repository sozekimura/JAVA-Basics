package valores;
import java.util.Scanner;

public class valores {
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el primer valor: ");
			int valor1 = scanner.nextInt();

			System.out.println("Ingrese el segundo valor: ");
			int valor2 = scanner.nextInt();

			System.out.println("Ingrese el tercer valor: ");
			int valor3 = scanner.nextInt();

			int mayor = Math.max(Math.max(valor1, valor2), valor3);
			int menor = Math.min(Math.min(valor1, valor2), valor3);

			System.out.println("El mayor valor ingresado es: " + mayor);
			System.out.println("El menor valor ingresado es: " + menor);

			System.out.println("Ingrese su nombre: ");
			String nombre = scanner.nextLine();

			System.out.println("Ingrese su edad: ");
			int edad = scanner.nextInt();

			System.out.println("Nombre: " + nombre);
			System.out.println("Edad: " + edad);

			System.out.println("¡Hola, " + nombre + "! Bienvenido/a.");
		}
    }
}