package gerente.system;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static RepositorioCardapio repositorio = new RepositorioCardapio();
    private final static SistemaDePedidos sistemaDePedidos = new SistemaDePedidos();
    private final static Gerente gerente = new Gerente(sistemaDePedidos, repositorio);

    public static void main(String[] args) {
        // Inicia a simulação de pedidos automáticos
        inicializarCardapio();
        sistemaDePedidos.iniciarSimulacaoPedidos(repositorio);

        int escolha;

        do {
            InterfaceGerente.menu();
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (escolha) {
                case 1: // Adicionar Pizza
                    adicionarPizza();
                    break;
                case 2: // Remover Pizza
                    removerPizza();
                    break;
                case 3: // Atualizar Pizza
                    atualizarPizza();
                    break;
                case 4: // Adicionar Bebida
                    adicionarBebida();
                    break;
                case 5: // Remover Bebida
                    removerBebida();
                    break;
                case 6: // Atualizar Bebida
                    atualizarBebida();
                    break;
                case 7: // Adicionar Entregador
                    adicionarEntregador();
                    break;
                case 8: // Remover Entregador
                    removerEntregador();
                    break;
                case 9: // Atualizar Entregador
                    atualizarEntregador();
                    break;
                case 10: // Ver pedidos
                    gerente.visualizarPedidos();
                    break;
                case 11:
                    gerente.vizualizarCardapio();
                    break;
                case 12:
                    gerente.vizualizarEntregadores();
                    break;
                case 13:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            InterfaceGerente.clear();
        } while (true);
    }

    // Métodos de Adicionar
    public static void adicionarPizza() {
        Pizza pizza = new Pizza();
        System.out.println("Adicionar Pizza");
        System.out.print("Nome: ");
        pizza.setNome(scanner.nextLine());
        System.out.print("Descrição: ");
        pizza.setDescricao(scanner.nextLine());
        System.out.print("Preço: ");
        pizza.setPreco(scanner.nextDouble());
        scanner.nextLine();
        repositorio.adicionar(pizza);
    }

    public static void adicionarBebida() {
        Bebida bebida = new Bebida();
        System.out.println("Adicionar Bebida");
        System.out.print("Nome: ");
        bebida.setNome(scanner.nextLine());
        System.out.print("Preço: ");
        bebida.setPreco(scanner.nextDouble());
        scanner.nextLine();
        repositorio.adicionar(bebida);
    }

    public static void adicionarEntregador() {
        Entregador entregador = new Entregador();
        System.out.println("Adicionar Entregador");
        System.out.print("Nome: ");
        entregador.setNome(scanner.nextLine());
        System.out.print("Id: ");
        entregador.setId(scanner.nextInt());
        System.out.print("Salário: ");
        entregador.setSalario(scanner.nextDouble());
        scanner.nextLine();
        repositorio.adicionar(entregador);
    }

    // Métodos de Remover
    public static void removerPizza() {
        System.out.println("Remover Pizza");
        System.out.print("Nome da Pizza a remover: ");
        String nome = scanner.nextLine();
        Pizza pizza = new Pizza();
        pizza.setNome(nome);
        repositorio.remover(pizza);
    }

    public static void removerBebida() {
        System.out.println("Remover Bebida");
        System.out.print("Nome da Bebida a remover: ");
        String nome = scanner.nextLine();
        Bebida bebida = new Bebida();
        bebida.setNome(nome);
        repositorio.remover(bebida);
    }

    public static void removerEntregador() {
        System.out.println("Remover Entregador");
        System.out.print("Nome do Entregador a remover: ");
        String nome = scanner.nextLine();
        Entregador entregador = new Entregador();
        entregador.setNome(nome);
        repositorio.remover(entregador);
    }

    // Métodos de Atualizar
    public static void atualizarPizza() {
        System.out.println("Atualizar Pizza");
        System.out.print("Nome da Pizza a atualizar: ");
        String nome = scanner.nextLine();

        for (Pizza pizza : repositorio.pizzas) {
            if (pizza.getNome().equals(nome)) {
                System.out.print("Novo Nome: ");
                pizza.setNome(scanner.nextLine());
                System.out.print("Nova Descrição: ");
                pizza.setDescricao(scanner.nextLine());
                System.out.print("Novo Preço: ");
                pizza.setPreco(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Pizza atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Pizza não encontrada.");
    }

    public static void atualizarBebida() {
        System.out.println("Atualizar Bebida");
        System.out.print("Nome da Bebida a atualizar: ");
        String nome = scanner.nextLine();

        for (Bebida bebida: repositorio.bebidas) {
            if (bebida.getNome().equals(nome)) {
                System.out.print("Novo Nome: ");
                bebida.setNome(scanner.nextLine());
                System.out.print("Novo Preço: ");
                bebida.setPreco(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Bebida atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Bebida não encontrada.");
    }

    public static void atualizarEntregador() {
        System.out.println("Atualizar Entregador");
        System.out.print("Nome do Entregador a atualizar: ");
        String nome = scanner.nextLine();

        for (Entregador entregador : repositorio.entregadores) {
            if (entregador.getNome().equals(nome)) {
                System.out.print("Novo Nome: ");
                entregador.setNome(scanner.nextLine());
                System.out.print("Novo Salário: ");
                entregador.setSalario(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Entregador atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Entregador não encontrado.");
    }


    private static void inicializarCardapio() {
        // Adicionando pizzas básicas
        repositorio.adicionar(new Pizza("Margherita", "Molho de tomate, mozzarella, manjericão", 25.00));
        repositorio.adicionar(new Pizza("Pepperoni", "Molho de tomate, mozzarella, pepperoni", 30.00));
        repositorio.adicionar(new Pizza("Quatro Queijos", "Molho de tomate, mozzarella, gorgonzola, parmesão, provolone", 35.00));
        repositorio.adicionar(new Pizza("Frango com Catupiry", "Molho de tomate, mozzarella, frango desfiado, catupiry", 28.00));

        // Adicionando bebidas básicas
        repositorio.adicionar(new Bebida("Coca-Cola", 5.00));
        repositorio.adicionar(new Bebida("Água", 3.00));
        repositorio.adicionar(new Bebida("Guaraná", 5.00));
        repositorio.adicionar(new Bebida("Suco de Laranja", 7.00));
    }
}
