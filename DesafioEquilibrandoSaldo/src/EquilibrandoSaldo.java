import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Valor do Saldo Atual do conta: ");
        double saldoAtual = scanner.nextDouble();

        System.out.println("Informe o valor do Deposito: ");
        double valorDeposito = scanner.nextDouble();

        System.out.println("Informe o valor do Saque: ");
        double valorRetirada = scanner.nextDouble();

        double novoSaldo = equilibraSaldo(saldoAtual, valorDeposito, valorRetirada);
        System.out.printf("Novo Saldo: %.1f", novoSaldo);

    }

    static double equilibraSaldo(double saldoAtual, double valorDeposito, double valorRetirada) {
        saldoAtual = saldoAtual + valorDeposito - valorRetirada;
        return saldoAtual;
    }
}