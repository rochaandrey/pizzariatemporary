package gerente.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A classe {@code RepositorioCardapio} gerencia o cardápio de pizzas,
 * bebidas e entregadores. Permite adicionar, remover e visualizar os itens
 * do cardápio.
 */
public class RepositorioCardapio {
    // Listas para armazenar bebidas, pizzas e entregadores
    public ArrayList<Bebida> bebidas = new ArrayList<>();
    public ArrayList<Pizza> pizzas = new ArrayList<>();
    public ArrayList<Entregador> entregadores = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    /**
     * Adiciona um objeto (Pizza, Bebida ou Entregador) ao repositório.
     *
     * @param obj O objeto a ser adicionado.
     */
    public void adicionar(Object obj) {
        if (obj instanceof Pizza) {
            if (objExistente(obj)) {
                System.out.println("Erro ao adicionar Pizza! A Pizza já existe no Cardápio!");
            } else {
                pizzas.add((Pizza) obj);
                System.out.println("Pizza adicionada: " + ((Pizza) obj).getNome());
            }
        } else if (obj instanceof Bebida) {
            if (objExistente(obj)) {
                System.out.println("Erro ao adicionar Bebida! A Bebida já existe no Cardápio");
            } else {
                bebidas.add((Bebida) obj);
                System.out.println("Bebida adicionada: " + ((Bebida) obj).getNome());
            }
        } else if (obj instanceof Entregador) {
            if (objExistente(obj)) {
                System.out.println("Erro ao adicionar entregador! O entregador já é funcionário da empresa!");
            } else {
                for (Entregador entregador : entregadores) {
                    while (((Entregador) obj).getId() == entregador.getId()) {
                        System.out.println("O id já existe! Escolha outro!");
                        System.out.print("Id: ");
                        entregador.setId(scanner.nextInt());
                    }
                }
                entregadores.add((Entregador) obj);
                System.out.println("Entregador adicionado: " + ((Entregador) obj).getNome());
            }
        } else {
            System.out.println("Não é possível adicionar esse tipo de objeto!");
        }
    }

    /**
     * Remove um objeto (Pizza, Bebida ou Entregador) do repositório.
     *
     * @param obj O objeto a ser removido.
     */
    public void remover(Object obj) {
        if (obj instanceof Pizza) {
            if (pizzas.remove(obj)) {
                System.out.println("Pizza removida: " + ((Pizza) obj).getNome());
            } else {
                System.out.println("Pizza não encontrada!");
            }
        } else if (obj instanceof Bebida) {
            if (bebidas.remove(obj)) {
                System.out.println("Bebida removida: " + ((Bebida) obj).getNome());
            } else {
                System.out.println("Bebida não encontrada!");
            }
        } else if (obj instanceof Entregador) {
            if (entregadores.remove(obj)) {
                System.out.println("Entregador removido: " + ((Entregador) obj).getNome());
            } else {
                System.out.println("Entregador não encontrado!");
            }
        } else {
            System.out.println("Não é possível remover esse tipo de objeto!");
        }
    }

    /**
     * Verifica se um objeto (Pizza, Bebida ou Entregador) já existe no repositório.
     *
     * @param obj O objeto a ser verificado.
     * @return {@code true} se o objeto já existir, {@code false} caso contrário.
     */
    private boolean objExistente(Object obj) {
        if (obj instanceof Pizza) {
            for (Pizza p : pizzas) {
                if (p.getNome().equals(((Pizza) obj).getNome())) {
                    return true;
                }
            }
        } else if (obj instanceof Bebida) {
            for (Bebida b : bebidas) {
                if (b.getNome().equals(((Bebida) obj).getNome())) {
                    return true;
                }
            }
        } else {
            for (Entregador e : entregadores) {
                if (e.getNome().equals(((Entregador) obj).getNome())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Exibe o cardápio de pizzas e bebidas.
     */
    public void vizualizarCardapio() {
        if (pizzas.isEmpty()) {
            System.out.println("Nenhuma pizza encontrada.");
        } else {
            System.out.println("Pizzas: ");
            for (Pizza pizza : pizzas) {
                System.out.println("Sabor: " + pizza.getNome());
                System.out.println("Descrição: " + pizza.getDescricao());
                System.out.println("Preço: " + pizza.getPreco());
            }
        }

        if (bebidas.isEmpty()) {
            System.out.println("Nenhuma bebida encontrada.");
        } else {
            System.out.println("Bebidas: ");
            for (Bebida bebida : bebidas) {
                System.out.println("Nome: " + bebida.getNome());
                System.out.println("Preço: " + bebida.getPreco());
            }
        }
    }

    /**
     * Exibe a lista de entregadores.
     */
    public void vizualizarEntregadores() {
        if (entregadores.isEmpty()) {
            System.out.println("Nenhum entregador encontrado.");
        } else {
            for (Entregador entregador : entregadores) {
                System.out.println("Nome: " + entregador.getNome());
                System.out.println("Id: " + entregador.getId());
                System.out.println("Salário: " + entregador.getSalario());
            }
        }
    }
}
