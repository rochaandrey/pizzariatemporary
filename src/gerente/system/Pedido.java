package gerente.system;

import java.util.List;

public class Pedido {
    private static int contadorPedidos = 0;
    private final int numeroPedido;
    private final List<Pizza> pizzas;
    private final List<Bebida> bebidas;

    public Pedido(List<Pizza> pizzas, List<Bebida> bebidas) {
        this.numeroPedido = ++contadorPedidos;
        this.pizzas = pizzas;
        this.bebidas = bebidas;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    @Override
    public String toString() {
        StringBuilder descricao = new StringBuilder("Pedido #" + numeroPedido + ":\n");
        descricao.append("Pizzas: \n");
        for (Pizza pizza : pizzas) {
            descricao.append("- ").append(pizza.getNome()).append("\n");
        }
        descricao.append("Bebidas: \n");
        for (Bebida bebida : bebidas) {
            descricao.append("- ").append(bebida.getNome()).append("\n");
        }
        return descricao.toString();
    }
}
