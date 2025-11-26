import java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero : ");
        int n = teclado.nextInt();

        if (n == 0) {
            System.out.println("Todo numero entero");
        } else {
             for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

