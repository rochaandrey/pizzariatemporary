package gerente.system.modelo;

import java.util.Objects;

public class Pizza {
    private String sabor;
    private String descricao;
    private double preco;

    public Pizza() {

    }

    public Pizza(String sabor, String descricao, double preco) {
        this.sabor = sabor.toUpperCase();
        this.descricao = descricao;
        this.preco = preco;
    }

    public Pizza(String sabor){
        this.sabor=sabor.toUpperCase();
    }

    public String getSabor() {
        return sabor.toUpperCase();
    }

    public void setSabor(String sabor) {
        this.sabor = sabor.toUpperCase();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return '{' +
                "sabor='" + sabor + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(sabor, pizza.sabor);
    }


}
