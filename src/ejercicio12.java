import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();

        System.out.println("Ingrese otro numero: ");
        int numero2 = teclado.nextInt();

        if(numero > numero2){
            System.out.println("El numero mayor es: "+numero);
        }else if(numero2 > numero) {
            System.out.println("El numero mayor es: "+numero2);
        }else{
            System.out.println("Tiene la misma cantidad");
        }
    }
}
