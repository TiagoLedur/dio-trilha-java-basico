import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("\nQual a sua agencia? ");
        String agencia = scanner.next();

        System.out.println("\nQual o numero da sua conta? ");
        int conta = scanner.nextInt();

        System.out.println("\nQuanto de saldo ha em sua conta? ");
        double saldo = scanner.nextDouble();


        System.out.println("\n\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");



    }

}
