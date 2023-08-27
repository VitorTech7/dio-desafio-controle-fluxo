import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = sc.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = sc.nextInt();

            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException();
            }

            for (int i = parametroUm; i < parametroDois; i++) {
                System.out.println("Imprimindo o número " + i);

            }

            int ocorrencia = parametroDois - parametroUm;
            System.out.println("Quantidades de ocorrências: " + ocorrencia);

        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}

