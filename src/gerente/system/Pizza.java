package gerente.system;

/**
 * A classe {@code Pizza} representa uma pizza no sistema, com informações
 * como sabor, descrição e preço. Cada pizza pode ser comparada pelo seu sabor.
 */
public class Pizza {
    private String sabor;      // Sabor da pizza (ex: Margherita, Pepperoni).
    private String descricao;  // Descrição dos ingredientes da pizza.
    private double preco;      // Preço da pizza.

    /**
     * Construtor padrão para criar uma pizza vazia.
     */
    public Pizza() {
        // Construtor vazio, caso precise criar uma pizza e definir atributos depois.
    }

    /**
     * Construtor para criar uma pizza com sabor, descrição e preço especificados.
     *
     * @param sabor     O sabor da pizza.
     * @param descricao A descrição dos ingredientes da pizza.
     * @param preco     O preço da pizza.
     */
    public Pizza(String sabor, String descricao, double preco) {
        this.sabor = sabor;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * Retorna o sabor da pizza.
     *
     * @return O sabor da pizza.
     */
    public String getNome() {
        return sabor;
    }

    /**
     * Define o sabor da pizza. O sabor será armazenado em letras maiúsculas.
     *
     * @param sabor O sabor da pizza.
     */
    public void setNome(String sabor) {
        this.sabor = sabor.toUpperCase(); // Armazena o sabor sempre em maiúsculas.
    }

    /**
     * Retorna a descrição da pizza.
     *
     * @return A descrição dos ingredientes.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição da pizza.
     *
     * @param descricao A descrição dos ingredientes.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna o preço da pizza.
     *
     * @return O preço da pizza.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço da pizza.
     *
     * @param preco O preço da pizza.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }


}
