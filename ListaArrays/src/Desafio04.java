import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> palavras = new ArrayList<>();
        palavras.add("Banana");
        palavras.add("Maçã");
        palavras.add("Abacate");
        palavras.add("Manga");

        System.out.println("Palavras originais: " + palavras);

        System.out.print("Informe a letra para remover palavras que a contenham: ");
        String letra = scanner.nextLine().toLowerCase();

        for (int i = palavras.size() - 1; i >= 0; i--) {
            if (palavras.get(i).toLowerCase().contains(letra)) {
                palavras.remove(i);
            }
        }

        System.out.println("Removendo palavras que contêm \"" + letra + "\": " + palavras);

        scanner.close();
    }
}
