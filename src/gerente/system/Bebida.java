package gerente.system;

/**
 * A classe {@code Bebida} representa uma bebida com um nome e um preço e
 * fornece métodos para acessar e modificar esses atributos.
 */
public class Bebida {
    private String nome;  // Nome da bebida
    private double preco; // Preço da bebida

    /**
     * Construtor padrão que inicializa um objeto {@code Bebida}.
     */
    public Bebida() {
        // Construtor vazio
    }

    /**
     * Construtor que inicializa um objeto {@code Bebida} com um nome e um preço.
     *
     * @param nome  O nome da bebida.
     * @param preco O preço da bebida.
     */
    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Retorna o nome da bebida.
     *
     * @return O nome da bebida.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da bebida.
     * O nome é convertido para letras maiúsculas ao ser definido.
     *
     * @param nome O novo nome da bebida.
     */
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    /**
     * Retorna o preço da bebida.
     *
     * @return O preço da bebida.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço da bebida.
     *
     * @param preco O novo preço da bebida.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
