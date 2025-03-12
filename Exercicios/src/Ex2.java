import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Moedas");
        System.out.println("1 - Dólar (R$ 1 = US$0.20)");
        System.out.println("2 - Euro  (R$ 1 = €$0.18)");
        System.out.println("3 - Libra (R$ 1 = £$0.15)");

        System.out.println("Selecione a opção de Conversão");

        int Opcao = sc.nextInt();

        System.out.println("Quantos reais quer converter?");

        double Reais = sc.nextDouble();

        switch (Opcao) {
            case 1:
                double calc1 = Reais * 0.20;
                
                System.out.println("A conversão de Reais para Dólar ficou de US$" + calc1);
                break;
            case 2:
                double calc2 = Reais * 0.18;
                
                System.out.println("A conversão de Reais para Euro ficou de €$" + calc2);
                break;
            case 3:
                double calc3 = Reais * 0.15;
                    
                System.out.println("A conversão de Reais para Libras ficou de £$" + calc3);

                break;
            default:
                System.out.println("Opção Inválida");
        }

        sc.close();

    }
}
