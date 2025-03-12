import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo Taxa de Empréstimo");

        System.out.println("Qual o valor do Empréstimo?");

        double ValorEmp = sc.nextDouble();

        System.out.println("(1) -  6 meses +  5% Do Valor Total");
        System.out.println("(2) - 12 meses + 10% Do Valor Total");
        System.out.println("(3) - 24 meses + 20% Do Valor Total");
        System.out.println("Selecione a opção de número de parcelas desejadas");

        int Opcao = sc.nextInt();

        switch (Opcao) {
            case 1:
                double calc1 = ValorEmp * 1.05;

                System.out.println("O total a ser pago durante 6 mêses será de R$" + calc1);     
                break;
            case 2:
                double calc2 = ValorEmp * 1.10;

                System.out.println("O total a ser pago durante 12 mêses será de R$" + calc2);     

                break;
            case 3:
                double calc3 = ValorEmp * 1.20;

                System.out.println("O total a ser pago durante 24 mêses será de R$" + calc3);     
                break;
            default:

                System.out.println("Opção Inválida");
                break;
        }

        sc.close();
    }
}
