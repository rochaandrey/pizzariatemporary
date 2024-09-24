package gerente.system;

/**
 * A classe {@code Gerente} representa o chefão do sistema.
 * Ele pode dar uma olhada nos pedidos, no cardápio e nos entregadores.
 */
public class Gerente {
    final private SistemaDePedidos sistemaDePedidos; // Sistema para gerenciar os pedidos.
    final private RepositorioCardapio repositorioCardapio; // Repositório que guarda o cardápio e os entregadores.

    /**
     * Construtor que cria um gerente com um sistema de pedidos e um repositório de cardápio.
     *
     * @param sistemaDePedidos     O sistema responsável por cuidar dos pedidos.
     * @param repositorioCardapio  O repositório que guarda o cardápio e os entregadores.
     */
    public Gerente(SistemaDePedidos sistemaDePedidos, RepositorioCardapio repositorioCardapio) {
        this.sistemaDePedidos = sistemaDePedidos;
        this.repositorioCardapio = repositorioCardapio;
    }

    /**
     * Mostra todos os pedidos que foram feitos. Tipo uma lista do que já foi pedido.
     */
    public void visualizarPedidos() {
        sistemaDePedidos.visualizarPedidos();
    }

    /**
     * Dá uma olhada no cardápio disponível. Basicamente vê o que tem pra vender.
     */
    public void vizualizarCardapio() {
        repositorioCardapio.vizualizarCardapio();
    }

    /**
     * Mostra os entregadores que estão na lista. Só pra conferir quem tá na ativa.
     */
    public void vizualizarEntregadores() {
        repositorioCardapio.vizualizarEntregadores();
    }
}
