package gerente.system;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe {@code SistemaDePedidos} gerencia os pedidos feitos pelos clientes.
 * Permite adicionar novos pedidos, visualizar todos os pedidos e simular pedidos automáticos.
 */
public class SistemaDePedidos {
    final private List<Pedido> pedidos = new ArrayList<>();

    /**
     * Adiciona um pedido ao sistema.
     *
     * @param pedido O pedido a ser adicionado.
     */
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    /**
     * Exibe todos os pedidos no sistema.
     */
    public void visualizarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido encontrado.");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println(pedido);
            }
        }
    }

    /**
     * Inicia a simulação de pedidos automáticos a partir do repositório de cardápio.
     *
     * @param repositorio O repositório de cardápio que fornece pizzas e bebidas.
     */
    public void iniciarSimulacaoPedidos(RepositorioCardapio repositorio) {
        Thread simulador = new Thread(() -> {
            while (true) {
                try {
                    // Gera um pedido aleatório de um cliente a cada 30 segundos
                    Cliente cliente = new Cliente();
                    Pedido pedido = cliente.fazerPedidoAleatorio(repositorio);
                    adicionarPedido(pedido);

                    // Espera por 30 segundos antes de gerar o próximo pedido
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    System.out.println("Simulação de pedidos interrompida.");
                    break;
                }
            }
        });
        simulador.start();
    }
}
