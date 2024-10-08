package gerente.system.modelo;

public class Entregador {
    private String nome;
    private int id; // o id é 100 + a posição do entregador no array
    private double salario;

    public Entregador() {
    }

    public Entregador(String nome, double salario) {
        this.nome = nome.toUpperCase();
        this.salario = salario;
    }

    public Entregador(int id){
        this.id = id;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entregador that = (Entregador) o;
        return id == that.id;
    }

}
