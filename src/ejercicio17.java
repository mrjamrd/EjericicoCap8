import java.util.Scanner;
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = teclado.nextInt();
        int contador = 0;
        if (numero == 0) {
            contador = 0;
        } else {
            while (numero > 0) {
                if (numero % 10 == 1) {
                    contador++;
                }
                numero /= 10;
            }
        }
        System.out.println("El dígito 1 aparece " + contador + " veces.");

    }
}
