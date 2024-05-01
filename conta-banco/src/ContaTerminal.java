import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.print("Por favor digite seu nome: ");
    String clientName = scanner.next();

    System.out.print("Por favor digite o número de sua agência (XXX-X): ");
    String branch = scanner.next();

    System.out.print("Agora o número da sua conta (XXXX): ");
    int accountNumber = scanner.nextInt();

    System.out.print("E, por último, seu saldo: ");
    double balance = scanner.nextDouble();

    Conta account = new Conta(accountNumber, branch, clientName, balance);
    
    System.out.println("\nOlá " + account.clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + account.branch + ", conta " + account.accountNumber + " e seu saldo " + account.balance + " já está disponível para saque");

    scanner.close();
  }
}