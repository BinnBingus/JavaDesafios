public class Roupa {

    private String marcaRoupa;
    private String tipoRoupa;
    private String tamanhoRoupa;
    private int quantidade;
    private double preco;

    public Roupa() {
        this.marcaRoupa = "Sem marca";
        this.tipoRoupa = "Desconhecido";
        this.tamanhoRoupa = "M";
        this.quantidade = 0;
        this.preco = 0.0;
    }

    public Roupa(String marcaRoupa, String tipoRoupa, String tamanhoRoupa, int quantidade, double preco) {
        this.marcaRoupa = marcaRoupa;
        this.tipoRoupa = tipoRoupa;
        this.tamanhoRoupa = tamanhoRoupa;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void ValorEstoque() {
        double Valor = this.quantidade * this.preco;
        System.out.println("Valor em Estoque : R$" + Valor);
    }

    public String getMarcaRoupa() {
        return marcaRoupa;
    }

    public void setMarcaRoupa(String marcaRoupa) {
        this.marcaRoupa = marcaRoupa;
    }

    public String getTipoRoupa() {
        return tipoRoupa;
    }

    public void setTipoRoupa(String tipoRoupa) {
        this.tipoRoupa = tipoRoupa;
    }

    public String getTamanhoRoupa() {
        return tamanhoRoupa;
    }

    public void setTamanhoRoupa(String tamanhoRoupa) {
        this.tamanhoRoupa = tamanhoRoupa;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void IncrementarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void DecrementarEstoque(int quantidade) {
        if (this.quantidade - quantidade < 0) {
            System.out.println("Quantidade Insuficiente");
        } else {
            this.quantidade -= quantidade;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marcaRoupa);
        System.out.println("Tipo: " + tipoRoupa);
        System.out.println("Tamanho: " + tamanhoRoupa);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$ " + preco);
    }
}
