package gerente.system;

public class Gerente {
    final private SistemaDePedidos sistemaDePedidos;
    final private RepositorioCardapio repositorioCardapio;

    public Gerente(SistemaDePedidos sistemaDePedidos, RepositorioCardapio repositorioCardapio) {
        this.sistemaDePedidos = sistemaDePedidos;
        this.repositorioCardapio = repositorioCardapio;
    }

    public void visualizarPedidos() {
        sistemaDePedidos.visualizarPedidos();
    }

    public void vizualizarCardapio(){
        repositorioCardapio.vizualizarCardapio();
    }

    public void vizualizarEntregadores(){
        repositorioCardapio.vizualizarEntregadores();
    }
}
