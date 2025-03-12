import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Média de Números");

        int Qtd = 0;
        double Soma = 0;

        while (true) {
            double Numero = sc.nextDouble();

            if (Numero != 0) {
                Qtd = Qtd + 1;
                Soma = Soma + Numero;
            } else {
                double Media = Soma / Qtd;
                System.out.println("A média dos números digitados foram de " + Media); 

                break;
            }
        }

        sc.close();
    }
}
