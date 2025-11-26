import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero mayor que 0: ");
        int numero = teclado.nextInt();

        if(numero <= 0){
            System.out.println("El numero debe ser mayor a 0");
        }else{
            for(int i =1; i <= numero; i++){
                if(numero % i == 0){
                    System.out.println("#: "+i);
                }
            }
        }
    }
}
