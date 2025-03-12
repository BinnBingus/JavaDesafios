import java.lang.Math;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        int NumeroAleatorio = (int)(Math.random() * 10);
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivinhe o número de 1 a 9");

        while (true) {
            int numero = sc.nextInt();
            
            if (numero == NumeroAleatorio) {
                System.out.println("Você acertou!");
                break;
            } else {
                System.out.print("Errou! Tente Novamente : ");
            }
        }

        sc.close();
    }
}
