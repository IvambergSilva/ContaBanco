import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu NOME: ");
        String name = scanner.next();

        System.out.print("Digite o n�mero da sua AG�NCIA: ");
        String agency = scanner.next();

        System.out.print("Digite o n�mero da sua CONTA: ");
        int account = scanner.nextInt();

        System.out.print("Digite o valor do seu SALDO: ");
        Double balance = scanner.nextDouble();
    
        System.out.println("Ol� " + name + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + agency + ", conta " + account + " e seu saldo de R$ " + balance + " j� est� dispon�vel para saque.");
    }
}
