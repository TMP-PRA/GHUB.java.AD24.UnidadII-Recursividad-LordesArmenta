package miPrincipal;
public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19,21,23};
        int valor = 100;
        int resultado = busquedaBinaria_iterativa(arreglo, valor);
        if (resultado == -1) {
            System.out.println("El valor no se encuentra en el arreglo");
        } else {
            System.out.println("El valor se encuentra en la posición " + resultado);
        }

        resultado = busquedaBinaria_recursiva(arreglo, valor, 0, arreglo.length - 1);
        if (resultado == -1) {
            System.out.println("El valor no se encuentra en el arreglo");
        } else {
            System.out.println("El valor se encuentra en la posición " + resultado);
        }
    }

    public static int busquedaBinaria_iterativa(int[] arreglo, int valor) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arreglo[medio] == valor) {
                return medio;
            } else if (arreglo[medio] < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
    public static int busquedaBinaria_recursiva(int[] arreglo, int valor, int inicio, int fin) {
        if (inicio > fin) {
            return -1;
        }
        int medio = (inicio + fin) / 2;
        if (arreglo[medio] == valor) {
            return medio;
        } else if (arreglo[medio] < valor) {
            return busquedaBinaria_recursiva(arreglo, valor, medio + 1, fin);
        } else {
            return busquedaBinaria_recursiva(arreglo, valor, inicio, medio - 1);
        }
    }
}