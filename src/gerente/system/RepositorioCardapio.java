package gerente.system;

import java.util.ArrayList;

public class RepositorioCardapio {
    // Listas para armazenar bebidas, pizzas e entregadores
    public ArrayList<Bebida> bebidas = new ArrayList<>();
    public ArrayList<Pizza> pizzas = new ArrayList<>();
    public ArrayList<Entregador> entregadores = new ArrayList<>();

    private static int qtdBebidas;
    private static int qtdPizzas;
    private static int qtdEntregadores;


    // Método para adicionar objetos ao repositório
    public void adicionar(Object obj) {
        if (obj instanceof Pizza) {
            if(objExistente(obj)){
                System.out.println("Erro ao adicionar Pizza! A Pizza já existe no Cardápio!");
            } else {
                pizzas.add((Pizza) obj);
                qtdPizzas++;
                System.out.println("Pizza adicionada: " + ((Pizza) obj).getNome());
            }
        } else if (obj instanceof Bebida) {
            if(objExistente(obj)){
                System.out.println("Erro ao adicionar Bebida! A Bebida já existe no Cardápio");
            } else {
                bebidas.add((Bebida) obj);
                qtdBebidas++;
                System.out.println("Bebida adicionada: " + ((Bebida) obj).getNome());
            }
        } else if (obj instanceof Entregador) {
            if(objExistente(obj)){
                System.out.println("Erro ao adiconar entregaddor! O  entregador já é funcionário da empresa!");
            } else{
                entregadores.add((Entregador) obj);
                qtdEntregadores++;
                System.out.println("Entregador adicionado: " + ((Entregador) obj).getNome());
            }
        } else {
            System.out.println("Não é possível adicionar esse tipo de objeto!");
        }
    }

    // Método para remover objetos do repositório
    public void remover(Object obj) {
        if (obj instanceof Pizza) {
            if (pizzas.remove(obj)) {
                qtdPizzas--;
                System.out.println("Pizza removida: " + ((Pizza) obj).getNome());
            } else {
                System.out.println("Pizza não encontrada!");
            }
        } else if (obj instanceof Bebida) {
            if (bebidas.remove(obj)) {
                qtdBebidas--;
                System.out.println("Bebida removida: " + ((Bebida) obj).getNome());
            } else {
                System.out.println("Bebida não encontrada!");
            }
        } else if (obj instanceof Entregador) {
            if (entregadores.remove(obj)) {
                qtdEntregadores--;
                System.out.println("Entregador removido: " + ((Entregador) obj).getNome());
            } else {
                System.out.println("Entregador não encontrado!");
            }
        } else {
            System.out.println("Não é possível remover esse tipo de objeto!");
        }
    }

    // Método para atualizar objetos do repositório
    public void atualizar(Object objAntigo, Object objNovo) {
        if (objAntigo instanceof Pizza && objNovo instanceof Pizza) {
            int index = pizzas.indexOf(objAntigo);
            if (index != -1) {
                pizzas.set(index, (Pizza) objNovo);
                System.out.println("Pizza atualizada: " + ((Pizza) objNovo).getNome());
            } else {
                System.out.println("Pizza não encontrada para atualizar!");
            }
        } else if (objAntigo instanceof Bebida && objNovo instanceof Bebida) {
            int index = bebidas.indexOf(objAntigo);
            if (index != -1) {
                bebidas.set(index, (Bebida) objNovo);
                System.out.println("Bebida atualizada: " + ((Bebida) objNovo).getNome());
            } else {
                System.out.println("Bebida não encontrada para atualizar!");
            }
        } else if (objAntigo instanceof Entregador && objNovo instanceof Entregador) {
            int index = entregadores.indexOf(objAntigo);
            if (index != -1) {
                entregadores.set(index, (Entregador) objNovo);
                System.out.println("Entregador atualizado: " + ((Entregador) objNovo).getNome());
            } else {
                System.out.println("Entregador não encontrado para atualizar!");
            }
        } else {
            System.out.println("Não é possível atualizar esse tipo de objeto!");
        }
    }

    private boolean objExistente(Object obj) {
        if(obj instanceof Pizza) {
            for(Pizza p: pizzas){
                if(p.getNome().equals(((Pizza) obj).getNome())) {
                    return true;
                }
            }
        } else if(obj instanceof Bebida){
            for(Bebida b: bebidas){
                if(b.getNome().equals(((Bebida) obj).getNome())){
                    return true;
                }
            }
        } else{
            for(Entregador e: entregadores){
                if(e.getNome().equals(((Entregador) obj).getNome())){
                    return true;
                }
            }
        }
        return false;
    }
}
