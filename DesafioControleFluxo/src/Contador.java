import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("\n Contador, os parametros inseridos devem ser numeros INTEIROS, o PRIMEIRO PARAMETRO DEVE SER MENOR QUE O SEGUNDO!\n");

        System.out.println("Informe o Primeiro Parametro: ");
        int parametroUm = scn.nextInt();

        System.out.println("Informe o Segundo Parametro: ");
        int parametroDois = scn.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println("\n O Primeiro Parametro deve ser menor que o Segundo Parametro!!!");
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException  {
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException ("/n O Primeiro Parametro deve ser menor que o Segundo Parametro!!!");
        }else{
            for (int contagem = parametroUm; contagem <= parametroDois; contagem++){
                System.out.println("Contagem = " + contagem);
            }
        }

    }

}
