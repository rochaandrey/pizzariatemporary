package gerente.system;

public class Entregador {
    private String nome;
    private int id; // o id é 100 + a posição do entregador no array
    private double salario;

    public Entregador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", salario=" + salario +
                '}';
    }
}
