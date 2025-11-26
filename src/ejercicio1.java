import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        if(numero >= 1){
            for(int i = 1 ; i <= numero ; i++){
                System.out.println("#: "+i);
            }
        }else{
            System.out.println("EL numero debe ser mayor a 0");
        }

    }
}
