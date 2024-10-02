package miPrincipal;

import java.util.Scanner;

public class Principal {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Alfabeto");
            System.out.println("2. BusquedaBinaria");
            System.out.println("3. Factorial");
            System.out.println("4. Fibonacci");
            System.out.println("5. Hanoi");
            System.out.println("6. Incremento");
            System.out.println("7. MaximoComunDivisor");
            System.out.println("8. MuestraNaturales");
            System.out.println("9. OrdenamientoMezcla");
            System.out.println("10. OrdenamientoSeleccion");
            System.out.println("11. Pared");
            System.out.println("12. ParImparRecursivo");
            System.out.println("13. SumaDigitos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Alfabeto.main(args);
                    break;
                case 2:
                    BusquedaBinaria.main(args);
                    break;
                case 3:
                    Factorial.main(args);
                    break;
                case 4:
                    Fibonacci.main(args);
                    break;
                case 5:
                    Hanoi.main(args);
                    break;
                case 6:
                    Incremento.main(args);
                    break;
                case 7:
                    MaximoComunDivisor.main(args);
                    break;
                case 8:
                    MuestraNaturales.main(args);
                    break;
                case 9:
                    //OrdenamientoMezcla.main(args);
                    break;
                case 10:
                    OrdenamientoSeleccion.main(args);
                    break;
                case 11:
                    Pared.main(args);
                    break;
                case 12:
                    ParImparRecursivo.main(args);
                    break;
                case 13:
                    SumaDigitos.main(args);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
       
    }
}