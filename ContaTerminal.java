import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor! Digite o numero da Conta");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o numero da Agencia");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero do Cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("\nOla" + nomeCliente + ", Obrigado por criar a conta em nosso banco, "
        + "Sua Agencia " + agencia + ", conta " + numero + "Saldo R$" + saldo + "Disponivel para saque");

        scanner.close();
    }
}
