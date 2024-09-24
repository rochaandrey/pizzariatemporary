package gerente.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cliente {
    final private Random random = new Random();

    public Pedido fazerPedidoAleatorio(RepositorioCardapio repositorio) {
        List<Pizza> pizzas = repositorio.pizzas;
        List<Bebida> bebidas = repositorio.bebidas;

        // Verifica se há pizzas e bebidas disponíveis no cardápio
        if (pizzas.isEmpty()) {
            System.out.println("Não há pizzas disponíveis no cardápio.");
            System.exit(1);
        }

        if (bebidas.isEmpty()) {
            System.out.println("Não há bebidas disponíveis no cardápio.");
            System.exit(1);
        }

        // Seleciona de 1 a 3 pizzas aleatoriamente
        List<Pizza> pizzasSelecionadas = new ArrayList<>();
        int numPizzas = random.nextInt(3) + 1; // Número de pizzas de 1 a 3
        for (int i = 0; i < numPizzas; i++) {
            Pizza pizza = pizzas.get(random.nextInt(pizzas.size()));
            pizzasSelecionadas.add(pizza);
        }

        // Seleciona de 1 a 2 bebidas aleatoriamente
        List<Bebida> bebidasSelecionadas = new ArrayList<>();
        int numBebidas = random.nextInt(2) + 1; // Número de bebidas de 1 a 2
        for (int i = 0; i < numBebidas; i++) {
            Bebida bebida = bebidas.get(random.nextInt(bebidas.size()));
            bebidasSelecionadas.add(bebida);
        }

        return new Pedido(pizzasSelecionadas, bebidasSelecionadas);
    }
}
