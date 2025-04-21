import java.util.ArrayList;
import java.util.List;

import javafx.scene.media.Media;

public class Desafio03 {
    public static void main(String[] args) {
        List <Integer> NumInteiros = new ArrayList<>();
        List <Integer> NumPares = new ArrayList<>();

        NumInteiros.add(10);
        NumInteiros.add(15);
        NumInteiros.add(20);
        NumInteiros.add(25);
        NumInteiros.add(30);

        for (int i = 0; i < NumInteiros.size(); i++) {
            if (NumInteiros.get(i) % 2 == 0) {
                NumPares.add(NumInteiros.get(i));
            }
		}

        System.out.println("Os números pares foram :");

        for (int i = 0; i < NumPares.size(); i++) {
            System.out.println(NumPares.get(i));
		}
        
    }
}
