package gerente.system;

public class Gerente {
    private SistemaDePedidos sistemaDePedidos;

    public Gerente(SistemaDePedidos sistemaDePedidos) {
        this.sistemaDePedidos = sistemaDePedidos;
    }

    public void visualizarPedidos() {
        sistemaDePedidos.visualizarPedidos();
    }
}
