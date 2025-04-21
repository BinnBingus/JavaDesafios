public class Main {
    public static void main(String[] args) {
        Roupa roupa1 = new Roupa("Nike", "Camiseta", "M", 5, 50);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        roupa1.ValorEstoque();
        roupa1.IncrementarEstoque(1);
        roupa1.ValorEstoque();
        roupa1.DecrementarEstoque(5);
        roupa1.ValorEstoque();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        roupa1.exibirInformacoes();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
