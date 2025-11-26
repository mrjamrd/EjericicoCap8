import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        if(numero >= 2){
            System.out.println("Los numero pares son: ");
            for(int i = 2 ; i <= numero ; i+=2){
                System.out.println("#: "+i);
            }
        }else{
            System.out.println("El numero debe ser mayor a 1");
        }
    }
}
