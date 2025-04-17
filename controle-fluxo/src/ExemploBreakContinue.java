public class ExemploBreakContinue {
    public static void main(String[] args) {
        for ( int numero = 1; numero <= 5; numero++){
            if (numero == 3)
            break; // interrompe todo o FOR
            //continue; // interrompe apenas a iteração atual e continua o loop

            System.out.println(numero);
        }
    }
}
