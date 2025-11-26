import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        int numero = teclado.nextInt();

        if(numero < 1){
            System.out.println("El numero debe ser mayor 1");
        }else{
            for(int i = 1 ; i <= numero ; i++){
                if(i%5==0){
                    System.out.println("#: "+i);
                }
            }
        }
    }
}
