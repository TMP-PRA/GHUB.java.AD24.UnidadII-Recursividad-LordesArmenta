package miPrincipal;
public class OrdenamientoMezcla{
    
    
	public int[] ordenar_iterativo(int[] ArregloA, int[] ArregloB) {
        int i, j, k;
        int[] ArregloC = new int[ArregloA.length + ArregloB.length];

        // Repetir mientras los arreglos A y B tengan elementos que comparar
        for (i = j = k = 0; i < ArregloA.length && j < ArregloB.length; k++) {
            if (ArregloA[i] < ArregloB[j]) {
                ArregloC[k] = ArregloA[i];
                i++;
            } else {
                ArregloC[k] = ArregloB[j];
                j++;
            }
        }

        // Copiar los elementos restantes de ArregloA, si los hay
        while (i < ArregloA.length) {
            ArregloC[k++] = ArregloA[i++];
        }

        // Copiar los elementos restantes de ArregloB, si los hay
        while (j < ArregloB.length) {
            ArregloC[k++] = ArregloB[j++];
        }

        return ArregloC;
    }

	public int[] ordenar_recursivo(int[] ArregloA, int[] ArregloB) {
        int[] ArregloC = new int[ArregloA.length + ArregloB.length];
        ordenar_recursivo_helper(ArregloA, 0, ArregloB, 0, ArregloC, 0);
        return ArregloC;
    }

    private void ordenar_recursivo_helper(int[] ArregloA, int i, int[] ArregloB, int j, int[] ArregloC, int k) {
        // Caso base: si ambos arreglos se han agotado
        if (i == ArregloA.length && j == ArregloB.length) {
            return;
        }

        // Caso base: si solo el arreglo A se ha agotado
        if (i == ArregloA.length) {
            ArregloC[k] = ArregloB[j];
            ordenar_recursivo_helper(ArregloA, i, ArregloB, j + 1, ArregloC, k + 1);
            return;
        }

        // Caso base: si solo el arreglo B se ha agotado
        if (j == ArregloB.length) {
            ArregloC[k] = ArregloA[i];
            ordenar_recursivo_helper(ArregloA, i + 1, ArregloB, j, ArregloC, k + 1);
            return;
        }

        // Comparar los elementos actuales de ambos arreglos y fusionar
        if (ArregloA[i] < ArregloB[j]) {
            ArregloC[k] = ArregloA[i];
            ordenar_recursivo_helper(ArregloA, i + 1, ArregloB, j, ArregloC, k + 1);
        } else {
            ArregloC[k] = ArregloB[j];
            ordenar_recursivo_helper(ArregloA, i, ArregloB, j + 1, ArregloC, k + 1);
        }
    }

	
		
}
	