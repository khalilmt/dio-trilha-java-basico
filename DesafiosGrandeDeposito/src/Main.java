import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valor = scanner.nextDouble();


        if (valor > 0) {
            System.out.println("Deposito realizado com sucesso!\n" +
                    "Saldo atual: " + df.format(valor));
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");
        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }

    }
}