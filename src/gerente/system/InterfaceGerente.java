package gerente.system;

/**
 * A interface {@code InterfaceGerente} define alguns métodos estáticos úteis para o gerente.
 * Tem um menu bonitinho e um método pra limpar a tela (mais ou menos).
 */
public interface InterfaceGerente {
    /**
     * Mostra o menu com as opções que o gerente pode escolher.
     * Tipo, adicionar ou remover pizzas, bebidas e entregadores, além de visualizar pedidos e outras coisas.
     */
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
        System.out.println("| 11 - Ver Cardápio                   |");
        System.out.println("| 12 - Ver Entregadores               |");
        System.out.println("| 13 - Sair                           |");
        System.out.println("+_____________________________________+");
    }

    /**
     * Imprime algumas linhas em branco pra dar aquela limpada na tela.
     * Não é uma super limpeza, mas ajuda a organizar o visual do console.
     */
    static void clear() {
        // imprime linhas em branco
        int contador = 0;
        while (contador < 1) {
            System.out.println();
            contador++;
        }
    }
}
