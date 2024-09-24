package gerente.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A classe {@code Cliente} representa um cliente que pode fazer pedidos aleatórios de pizzas e bebidas
 * de um cardápio disponível no {@code RepositorioCardapio}.
 */
public class Cliente {
    // Instância de Random para gerar números aleatórios.
    final private Random random = new Random();

    /**
     * Cria um pedido aleatório de pizzas e bebidas com base nos itens disponíveis
     * no {@code RepositorioCardapio} fornecido.
     *
     * @param repositorio O repositório contendo o cardápio de pizzas e bebidas.
     * @return Um objeto {@code Pedido} com uma seleção aleatória de pizzas e bebidas.
     * Caso não tenha nenhuma pizza ou bebida o código é encerrado
     */
    public Pedido fazerPedidoAleatorio(RepositorioCardapio repositorio) {
        // Lista de pizzas disponíveis no cardápio.
        List<Pizza> pizzas = repositorio.pizzas;
        // Lista de bebidas disponíveis no cardápio.
        List<Bebida> bebidas = repositorio.bebidas;

        // Verifica se há pizzas disponíveis no cardápio.
        if (pizzas.isEmpty()) {
            System.out.println("Não há pizzas disponíveis no cardápio.");
            System.exit(1); // Encerra o programa se não houver pizzas.
        }

        // Verifica se há bebidas disponíveis no cardápio.
        if (bebidas.isEmpty()) {
            System.out.println("Não há bebidas disponíveis no cardápio.");
            System.exit(1); // Encerra o programa se não houver bebidas.
        }

        // Seleciona aleatoriamente de 1 a 3 pizzas do cardápio.
        List<Pizza> pizzasSelecionadas = new ArrayList<>();
        int numPizzas = random.nextInt(3) + 1; // Número de pizzas selecionadas aleatoriamente de 1 a 3.
        for (int i = 0; i < numPizzas; i++) {
            Pizza pizza = pizzas.get(random.nextInt(pizzas.size())); // Seleciona uma pizza aleatoriamente.
            pizzasSelecionadas.add(pizza); // Adiciona a pizza selecionada à lista de pizzas selecionadas.
        }

        // Seleciona aleatoriamente de 1 a 2 bebidas do cardápio.
        List<Bebida> bebidasSelecionadas = new ArrayList<>();
        int numBebidas = random.nextInt(2) + 1; // Número de bebidas selecionadas aleatoriamente de 1 a 2.
        for (int i = 0; i < numBebidas; i++) {
            Bebida bebida = bebidas.get(random.nextInt(bebidas.size())); // Seleciona uma bebida aleatoriamente.
            bebidasSelecionadas.add(bebida); // Adiciona a bebida selecionada à lista de bebidas selecionadas.
        }

        // Retorna um novo pedido com as pizzas e bebidas selecionadas aleatoriamente.
        return new Pedido(pizzasSelecionadas, bebidasSelecionadas);
    }
}
