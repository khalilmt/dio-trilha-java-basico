import java.util.Scanner;
import java.text.DecimalFormat;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        double valorFinal = jurosComposto(valorInicial, taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$" + df.format(valorFinal));
        scanner.close();
    }

    static double jurosComposto(double valorInicial, double taxaJuros, int periodo) {
        return valorInicial * Math.pow(1 + taxaJuros / 100, periodo);
    }
}