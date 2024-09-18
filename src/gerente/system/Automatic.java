package gerente.system;

import java.util.ArrayList;

public class Automatic {
    static ArrayList<Pizza> listapizzas = new ArrayList<>();
    static ArrayList<Bebida> listabebidas = new ArrayList<>();
    static ArrayList<Entregador> listaentregadores = new ArrayList<>();

    public static void mostrarpizzas(){
        System.out.println("--------------------------");
        System.out.println("######      PIZZAS      ######");
        System.out.println("--------------------------");
        for(Pizza pizza : listapizzas){
            System.out.println(listapizzas.indexOf(pizza)+1+" - "+pizza.getSabor()+": "+pizza.getDescricao()+" - R$"+pizza.getPreco());
        }
        System.out.println("--------------------------");
    }

    public static void mostrarbebidas(){
        System.out.println("--------------------------");
        System.out.println("######      BEBIDAS      ######");
        System.out.println("--------------------------");
        for(Bebida bebida : listabebidas) {
            System.out.println(listabebidas.indexOf(bebida)+1+" - "+bebida.getNome()+" - R$"+bebida.getPreco());
        }
        System.out.println("--------------------------");
    }

    public static void mostrarentregadores(){
        System.out.println("--------------------------");
        System.out.println("######      ENTREGADORES      ######");
        System.out.println("--------------------------");
        for(Entregador entregador : listaentregadores){
            System.out.println("Nome: "+entregador.getNome()+" | "+ entregador.getId()+" |"+ entregador.getSalario());
        }
        System.out.println("--------------------------");

    }


}
