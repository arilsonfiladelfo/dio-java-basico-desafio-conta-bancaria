import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta bancaria: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite sua agência: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        double saldo = 540.40;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n", nome, agencia, numero, saldo);

        scanner.close();
    }
}
