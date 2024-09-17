package gerente.system;

import java.util.Objects;

public class Pizza {
    private String sabor;
    private String descricao;
    private double preco;

    public Pizza() {

    }

    public Pizza(String sabor){
        this.sabor=sabor;
    }

    public Pizza(String nome, String descricao, double preco) {
        this.sabor = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
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
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(this == null){return false;}
        if( getClass() != obj.getClass()){return false;}
        Pizza newobject = (Pizza) obj;
        return sabor.equals(newobject.sabor);
    }
}
