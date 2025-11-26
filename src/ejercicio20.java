import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();
        int f = 1;
        for(int i = 2; i <= numero; i++) {
            f *= i;
        }
        System.out.println("El factorial del numero "+numero +" es: "+f);

    }
  }

