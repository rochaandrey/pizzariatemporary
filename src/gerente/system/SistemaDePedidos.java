package gerente.system;

import java.util.ArrayList;
import java.util.List;

public class SistemaDePedidos {
    private List<Pedido> pedidos = new ArrayList<>();

    // Adiciona pedido ao sistema
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    // Visualiza todos os pedidos
    public void visualizarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido encontrado.");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println(pedido);
            }
        }
    }

    // Método para simular pedidos automáticos
    public void iniciarSimulacaoPedidos(RepositorioCardapio repositorio) {
        Thread simulador = new Thread(() -> {
            while (true) {
                try {
                    // Gera um pedido aleatório de um cliente a cada 1 min
                    Cliente cliente = new Cliente();
                    Pedido pedido = cliente.fazerPedidoAleatorio(repositorio);
                    adicionarPedido(pedido);

                    // Espera por 5 segundos antes de gerar o próximo pedido
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    System.out.println("Simulação de pedidos interrompida.");
                    break;
                }
            }
        });
        simulador.start();
    }
}
