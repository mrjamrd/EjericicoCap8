import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();
        if(numero<1){
            System.out.println("El numero debe ser mayor a 1");
        }else{
            int suma = 0;
            for(int i = 1 ; i <= numero ; i++){
                suma += i;
            }
            System.out.println("La suma de los numeros es: "+suma);
        }
    }
}
