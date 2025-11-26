public class ejercicio19 {
    public static void main(String[] args) {
        int valorSegunda = 1;
        int contadorPrimera = 0;

        // Dos bloques: valorSegunda = 1 y valorSegunda = 2
        for (int bloque = 0; bloque < 2; bloque++) {
            for (int i = 0; i < 4; i++) {
                System.out.println(contadorPrimera + " " + valorSegunda);
                contadorPrimera++;
            }
            valorSegunda++;
        }
    }
}
