import java.util.ArrayList;
import java.util.List;

import javafx.scene.media.Media;

public class Desafio02 {
    public static void main(String[] args) {
        List <Integer> NumInteiros = new ArrayList<>();

        NumInteiros.add(10);
        NumInteiros.add(20);
        NumInteiros.add(30);
        NumInteiros.add(40);

        double Media = 0;
        int Soma = 0;

        for (int i = 0; i < NumInteiros.size(); i++) {
            Soma += NumInteiros.get(i);
		}

        Media = (double) Soma / NumInteiros.size();

        System.out.println("Soma dos números : " + Soma);
        System.out.println("Media dos números : " + Media);
        
    }
}
