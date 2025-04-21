import java.util.ArrayList;
import java.util.List;

public class Desafio01 {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Alice");
        nomes.add("Bruno");
        nomes.add("Beatriz");
        nomes.add("André");
        nomes.add("Carlos");

        char letraFiltro = 'A';

        List<String> nomesFiltrados = new ArrayList<>();

        for (String nome : nomes) {
            if (nome.startsWith(String.valueOf(letraFiltro))) {
                nomesFiltrados.add(nome);
            }
        }

        String nomesFormatados = "[" + String.join(", ", nomesFiltrados) + "]";

        System.out.println("Nomes encontrados que começam com \"" + letraFiltro + "\" : " + nomesFormatados);
        System.out.println("Total de nomes : " + nomesFiltrados.size());
    }
}
