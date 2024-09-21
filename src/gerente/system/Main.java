package gerente.system;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static RepositorioCardapio repositorio = new RepositorioCardapio();

    public static void main(String[] args) {
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
                case 10:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
            }
            InterfaceGerente.clear();
        } while (escolha != 10);
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
            if (pizza.getNome().equalsIgnoreCase(nome)) {
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

        for (Bebida bebida : repositorio.bebidas) {
            if (bebida.getNome().equalsIgnoreCase(nome)) {
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
            if (entregador.getNome().equalsIgnoreCase(nome)) {
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
}
