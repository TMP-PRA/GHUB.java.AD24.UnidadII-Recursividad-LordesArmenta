package miPrincipal;

public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        int[] arreglo = {5, 3, 2, 4, 1};
        System.out.println("Arreglo original:");
       
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        
        arreglo=ordenaSeleccion_iterativa(arreglo);
        
        System.out.println("Arreglo ordenado:");
        for (Integer i : arreglo) {
            System.out.println(i);
        }

        int[] arreglo2 = {5, 3, 2, 4, 1};
        System.out.println("Arreglo original:");
        
        for (Integer i : arreglo2) {
            System.out.println(i);
        }
        
        arreglo2=ordenaSeleccion_iterativa(arreglo2);
        
        System.out.println("Arreglo ordenado:");
        for (Integer i : arreglo) {
            System.out.println(i);
        }


    }
    public static int [] ordenaSeleccion_iterativa(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }
            }
            if (i != minimo) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[minimo];
                arreglo[minimo] = aux;
            }
        }
        return arreglo;
    }

    public static int[] ordenaSeleccion_recursiva(int[] arreglo, int i) {
        if (i == arreglo.length - 1) {
            return arreglo;
        }
        int minimo = i;
        for (int j = i + 1; j < arreglo.length; j++) {
            if (arreglo[j] < arreglo[minimo]) {
                minimo = j;
            }
        }
        if (i != minimo) {
            int aux = arreglo[i];
            arreglo[i] = arreglo[minimo];
            arreglo[minimo] = aux;
        }
        return ordenaSeleccion_recursiva(arreglo, i + 1);
    }
    
}
