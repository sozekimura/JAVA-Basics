package areaRectangulo;

import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("El área del rectángulo es: " + area);
    }
}
