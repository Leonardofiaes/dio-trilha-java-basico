import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira seu primeiro nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, insira seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu numero da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
              
    }
}
