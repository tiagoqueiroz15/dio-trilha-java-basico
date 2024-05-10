import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int numConta = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("valor do deposito: ");
        double saldo = scanner.nextDouble();

         System.out.println("Olá "+nome+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numConta+" e seu saldo "+saldo+ " já esta disponivel para saque.");


    }
}
