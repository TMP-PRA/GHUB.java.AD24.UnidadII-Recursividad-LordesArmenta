package miPrincipal;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("El fibonacci de " + n + " es " + fibonacci_iterativo(n));
        System.out.println("El fibonacci de " + n + " es " + fibonacci_recursivo(n));
    }
    public static int fibonacci_recursivo(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonacci_recursivo(n-1) + fibonacci_recursivo(n-2);
    }
    public static int fibonacci_iterativo(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
