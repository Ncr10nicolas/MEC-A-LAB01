package javaaplication1;
import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
       while (option != 11) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Función Seno");
            System.out.println("6. Función Coseno");
            System.out.println("7. Función Tangente");
            System.out.println("8. Raíz enésima");
            System.out.println("9. Potencia enésima");
            System.out.println("10. Calcular IVA");
            System.out.println("11. Salir");
            System.out.print("Opción: ");
        option = input.nextInt();
        switch (option) {
            case 1 ->                 {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = input.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = input.nextDouble();
                    double result = num1 + num2;
                    System.out.println("El resultado de la suma es: " + result);
                }
            case 2 ->                 {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = input.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = input.nextDouble();
                    double result = num1 - num2;
                    System.out.println("El resultado de la resta es: " + result);
                }
            case 3 ->                 {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = input.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = input.nextDouble();
                    double result = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + result);
                }
            case 4 ->                 {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = input.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = input.nextDouble();
                    double result = num1 / num2;
                    System.out.println("El resultado de la división es: " + result);
                }
            case 5 ->                 {
                    System.out.print("Ingrese el número: ");
                    double num1 = input.nextDouble();
                    double result = Math.sin(num1);
                    System.out.println("El resultado del seno es: " + result);
                }
            case 6 ->                 {
                    System.out.print("Ingrese el número: ");
                    double num1 = input.nextDouble();
                    double result = Math.cos(num1);
                    System.out.println("El resultado del coseno es: " + result);
                }
            case 7 ->                 {
                    System.out.print("Ingrese el número: ");
                    double num1 = input.nextDouble();
                    double result = Math.tan(num1);
                    System.out.println("El resultado de la tangente es: " + result);
                }
            case 8 ->                 {
                    System.out.print("Ingrese la base: ");
                    double base = input.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    double exponent = input.nextDouble();
                    double result = Math.pow(base, 1 / exponent);
                    System.out.println("El resultado de la raíz enésima es: " + result);
                }
            case 9 ->                 {
                    System.out.print("Ingrese la base: ");
                    double base = input.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    double exponent = input.nextDouble();
                    double result = Math.pow(base, exponent);
                    System.out.println("El resultado de la potencia enésima es: " + result);
                }
            case 10 ->                 {
                    System.out.print("Ingrese el valor: ");
                    double value = input.nextDouble();
                    System.out.print("Ingrese el porcentaje de IVA: ");
                    double percentage = input.nextDouble();
                    double result = value * (percentage / 100);
                    System.out.println("El resultado del porcentaje de IVA es: " + result);
                }
            default -> System.out.println("Opción inválida. Por favor, seleccione una opción válida (1-10).");
        }
    }
  }
}
