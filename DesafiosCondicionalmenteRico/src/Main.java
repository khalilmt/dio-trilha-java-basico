import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        try {

            int novoSaldo = realizaSaque (saldoTotal, valorSaque);
            System.out.println( "Saque realizado com sucesso. Novo saldo: " + novoSaldo);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Saldo insuficiente. Saque nao realizado!");

        }

    }
    static int  realizaSaque(int saldoTotal, int valorSaque) throws ParametrosInvalidosException {
        if(valorSaque > saldoTotal){
            throw new ParametrosInvalidosException("Saldo insuficiente. Saque nao realizado!");
        }else{
            saldoTotal = saldoTotal - valorSaque;
            return saldoTotal;

        }

    }
}