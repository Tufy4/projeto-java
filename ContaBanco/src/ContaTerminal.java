import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        

    Scanner scanner = new Scanner(System.in);

      System.out.println("Digite seu numero de usuario:");
      int numero = scanner.nextInt();

      System.out.println("Digite o numero da sua agencia:");
      String agencia = scanner.next();

      System.out.println("Digite seu nome:");
      String nome = scanner.next();

      System.out.println("Digite seu saldo:");
      Double saldo = scanner.nextDouble();

      System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
