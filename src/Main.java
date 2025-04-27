import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("\n===== CALCULADORA =====");
                System.out.println("Elija una opción:");
                System.out.println("1 - Sumar");
                System.out.println("2 - Restar");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("5 - Potencia");
                System.out.println("6 - Raíz Cuadrada");
                System.out.println("0 - Salir");
                System.out.print("Su opción: ");

                int opcion = sc.nextInt();

                if (opcion == 0) {
                    continuar = false;
                    System.out.println("Gracias por usar la calculadora. ¡Hasta pronto!");
                    continue;
                }

                double num1, num2 = 0;

                System.out.print("Ingrese el valor del número 1: ");
                num1 = sc.nextDouble();

                // Para la raíz cuadrada solo necesitamos un número
                if (opcion != 6) {
                    System.out.print("Ingrese el valor del número 2: ");
                    num2 = sc.nextDouble();
                }

                switch (opcion) {
                    case 1:
                        Suma sumar = new Suma(num1, num2);
                        System.out.println("Resultado: " + sumar.sumar());
                        break;
                    case 2:
                        Resta restar = new Resta(num1, num2);
                        System.out.println("Resultado: " + restar.restar());
                        break;
                    case 3:
                        Multiplicacion multiplicar = new Multiplicacion(num1, num2);
                        System.out.println("Resultado: " + multiplicar.multiplicar());
                        break;
                    case 4:
                        Division dividir = new Division(num1, num2);
                        System.out.println("Resultado: " + dividir.dividir());
                        break;
                    case 5:
                        Potencia potenciar = new Potencia(num1, num2);
                        System.out.println("Resultado: " + potenciar.potenciar());
                        break;
                    case 6:
                        RaizCuadrada raiz = new RaizCuadrada(num1);
                        System.out.println("Resultado: " + raiz.calcular());
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un valor numérico válido.");
                sc.nextLine(); // Limpia el buffer del scanner
            } catch (ArithmeticException e) {
                System.out.println("Error aritmético: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}