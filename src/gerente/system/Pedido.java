package gerente.system;

import java.util.List;

/**
 * A classe {@code Pedido} representa um pedido feito pelo cliente.
 * Cada pedido possui um número único, uma lista de pizzas e uma lista de bebidas.
 * O número do pedido é gerado automaticamente.
 */
public class Pedido {
    private static int contadorPedidos = 0; // Conta quantos pedidos foram feitos.
    private final int numeroPedido; // Número único do pedido.
    private final List<Pizza> pizzas; // Lista de pizzas no pedido.
    private final List<Bebida> bebidas; // Lista de bebidas no pedido.

    /**
     * Cria um novo pedido com uma lista de pizzas e bebidas.
     * O número do pedido é gerado automaticamente.
     *
     * @param pizzas  A lista de pizzas incluídas no pedido.
     * @param bebidas A lista de bebidas incluídas no pedido.
     */
    public Pedido(List<Pizza> pizzas, List<Bebida> bebidas) {
        this.numeroPedido = ++contadorPedidos;
        this.pizzas = pizzas;
        this.bebidas = bebidas;
    }

    /**
     * Retorna o número único deste pedido.
     *
     * @return O número do pedido.
     */
    public int getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * Retorna a lista de pizzas deste pedido.
     *
     * @return A lista de pizzas.
     */
    public List<Pizza> getPizzas() {
        return pizzas;
    }

    /**
     * Retorna a lista de bebidas deste pedido.
     *
     * @return A lista de bebidas.
     */
    public List<Bebida> getBebidas() {
        return bebidas;
    }

    /**
     * Retorna uma representação textual do pedido, incluindo o número do pedido,
     * as pizzas e bebidas incluídas.
     *
     * @return Uma string representando o pedido.
     */
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
