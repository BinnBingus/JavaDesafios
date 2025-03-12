import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Soma de Números Pares e Ímpares");

        int Par = 0;
        int Imp = 0;

        while (true) {
            int Numero = sc.nextInt();

            if (Numero != 0) {
                if (Numero % 2 == 0) {
                    Par = Par + Numero;
                } else {
                    Imp = Imp + Numero;
                }
            } else {
                System.out.println("Soma dos Números Pares   : " + Par);
                System.out.println("Soma dos Números Impares : " + Imp);

                break;
            }
        }

        sc.close();
    }
}
