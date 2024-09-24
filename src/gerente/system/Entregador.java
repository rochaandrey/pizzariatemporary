package gerente.system;

/**
 * A classe {@code Entregador} é basicamente um entregador do sistema.
 * Ela guarda algumas informações básicas como nome, id e salário.
 */
public class Entregador {
    private String nome; // Nome do entregador.
    private int id; // Identificador do entregador (tipo o RG, mas só no sistema).
    private double salario; // Salário do entregador.

    /**
     * Construtor padrão. Não faz muita coisa, só inicializa o entregador vazio.
     */
    public Entregador() {
    }

    /**
     * Pega o nome do entregador.
     *
     * @return O nome do entregador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do entregador.
     *
     * @param nome O nome que você quer dar pro entregador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Pega o id do entregador.
     *
     * @return O id do entregador.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o id do entregador.
     *
     * @param id O id que você quer dar pro entregador (tipo, 101, 102...).
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Pega o salário do entregador.
     *
     * @return O salário do entregador.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define o salário do entregador.
     *
     * @param salario O valor do salário que o entregador vai ganhar.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
