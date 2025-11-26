import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero de inicio: ");
        int numero = teclado.nextInt();
        System.out.println("Ingresa el numero tope");
        int tope = teclado.nextInt();

        if (numero < tope){
            for(int i = numero ; i <= tope ; i++){
                System.out.println("#: "+i);
            }
        }else{
            System.out.println("El numero inicio no puede ser mayor al tope y tampoco puede ser igual");
        }



    }

}
