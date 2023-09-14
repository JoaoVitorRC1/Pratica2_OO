public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    // Construtor sem parâmetros
    public Estoque() {
        this.nome = "Estoque";
        this.qtdAtual = 200;
        this.qtdMinima = 50;
    }

    // Construtor com parâmetros
    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    // Método para dar baixa no estoque
    public void darBaixa(int qtde) {
        if (qtde <= qtdAtual) {
            qtdAtual -= qtde;
        } else {
            System.out.println("Quantidade indisponível em estoque.");
        }
    }

    // Método para mostrar os dados do estoque
    public String mostra() {
        return "Nome do produto: " + nome + "\nQuantidade mínima: " + qtdMinima + "\nQuantidade atual: " + qtdAtual;
    }

    // Método para verificar se é necessário repor o estoque
    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Estoque
        Estoque estoque = new Estoque("Produto", 50, 10);

        System.out.println("Dados do estoque:");
        System.out.println(estoque.mostra());

        // Movimentando o estoque
        estoque.darBaixa(20);

        System.out.println("\nApós dar baixa de 20 unidades:");
        System.out.println(estoque.mostra());

        // Verificando se precisa repor o estoque
        if (estoque.precisaRepor()) {
            System.out.println("\nÉ necessário repor o estoque.");
        } else {
            System.out.println("\nNão é necessário repor o estoque.");
        }
    }
}

