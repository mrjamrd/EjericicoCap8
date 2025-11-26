import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();

        System.out.println("La tabla es del numero:"+numero);
        for(int i = 1; i <= 10 ; i++){
            System.out.println(numero+"x"+i+"="+numero*i);
        }
    }
}
