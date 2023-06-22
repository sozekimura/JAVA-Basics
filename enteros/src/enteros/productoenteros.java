package enteros;
import java.util.Scanner;

public class productoenteros

{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer entero: ");
        int entero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo entero: ");
        int entero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer entero: ");
        int entero3 = scanner.nextInt();

        int producto = entero1 * entero2 * entero3;
        System.out.println("El producto de los tres enteros es: " + producto);
	}
}
