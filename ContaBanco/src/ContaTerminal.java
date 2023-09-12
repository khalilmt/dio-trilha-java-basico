import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criar objeto scanner.
        Scanner scn = new Scanner(System.in);

        //Receber dados.

        System.out.println("Informe o numero da conta: ");
        int numConta = scn.nextInt();

        System.out.println("Informe o numero da Agencia: ");
        String numAgencia = scn.next();

        System.out.println("Informe o nome do Cliente: ");
        String nomeClient = scn.next();

        System.out.println("Informe valor do Deposito Inicial: ");
        double saldoConta = scn.nextDouble();

        //Imprime Dados

        System.out.println("Olá " + nomeClient + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numAgencia + ", conta: " + numConta + " e seu saldo: " + "R$" + saldoConta + " já está disponível para saque");

    }

}

