package gerente.system.modelo;

public interface MenuAndClear {
    static void menu() {
        System.out.println("=======================================");
        System.out.println("| BOA NOITE! O QUE DESEJA FAZER HOJE? |");
        System.out.println("=======================================");
        System.out.println("| 1 - Adicionar Pizzas                |");
        System.out.println("| 2 - Remover Pizzas                  |");
        System.out.println("| 3 - Atualizar Pizzas                |");
        System.out.println("| 4 - Adicionar Bebidas               |");
        System.out.println("| 5 - Remover Bebidas                 |");
        System.out.println("| 6 - Atualizar Bebidas               |");
        System.out.println("| 7 - Adicionar Entregador            |");
        System.out.println("| 8 - Remover Entregador              |");
        System.out.println("| 9 - Atualizar Entregador            |");
        System.out.println("| 10 - Ver pedidos                    |");
        System.out.println("| 11 - Sair                           |");
        System.out.println("+_____________________________________+");
    }

    static void clear() {
        int contador = 0;
        while (contador < 20) {
            System.out.println();
            contador++;
        }
    }

}
