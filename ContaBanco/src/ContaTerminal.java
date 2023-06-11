import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Por favor, digite o número da Agência: ");
    String agencia = scan.next();

    System.out.print("Digite o numero da conta: ");
    int numero = scan.nextInt();

    System.out.print("Digite o seu nome: ");
    String nomeCliente = scan.next();

    System.out.print("Digite seu saldo: ");
    Float saldo = scan.nextFloat();

    System.out
        .println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            ", conta: " + numero + " e seu saldo " + saldo + " já está disponivel para saque");
    scan.close();
  }
}
