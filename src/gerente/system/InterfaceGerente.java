package gerente.system;

public interface InterfaceGerente {
    static void menu() {
        System.out.println("BOA NOITE! O QUE DESEJA FAZER HOJE?");
        System.out.println(" 1 - Adicionar Pizzas");
        System.out.println(" 2 - Remover Pizzas");
        System.out.println(" 3 - Atualizar Pizzas");
        System.out.println(" 4 - Adicionar Bebidas");
        System.out.println(" 5 - Remover Bebidas");
        System.out.println(" 6 - Atualizar Bebidas");
        System.out.println(" 7 - Gerenciar entregadores");
        System.out.println(" 8 - Ver pedidos");
    }

    //imprime linhas em branco
    static void clear() {
        //imprime linhas em branco
        int contador = 0;
        while (contador < 20) {
            System.out.println();
            contador++;
        }
    }

}
