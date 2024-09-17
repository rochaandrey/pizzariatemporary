package gerente.system;

import java.util.Scanner;

public class Main{
    private static String nome;
    private static String sabor;
    private static String descricao;
    private static double preco;
    private static double salario;
    private static int id;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    //ta funcionando, MAS TEM QUE ADICIONAR O VERIFICADOR PARA NÃO ADICIONAR UMA PIZZA CUJO SABOR JÁ EXISTE
    public static void addPizza(){
        Pizza pizza = new Pizza();
        System.out.println("------------------------");
        System.out.println("QUAL O SABOR DA PIZZA? : ");
        sabor = scanner.nextLine();
        pizza.setSabor(sabor);
        System.out.println("------------------------");
        System.out.println("QUAIS OS INGREDIENTES DA PIZZA? : ");
        descricao = scanner.nextLine();
        pizza.setDescricao(descricao);
        System.out.println("------------------------");
        System.out.println("QUAL O PREÇO DA PIZZA? ");
        preco = scanner.nextDouble();
        pizza.setPreco(preco);

        // se já existe essa pizza na lista, não é adicionado

        Automatic.listapizzas.add(pizza);
        System.out.println("pizza adicionada! "+ pizza);
    }
    //nao ta funcionando
    public static void removePizza(){
        Automatic.mostrarpizzas();
        System.out.println("QUAL SABOR DESEJA REMOVER? ");
        System.out.println("sabor: ");
        sabor = scanner.nextLine();

        //tem alguma coisa errada aq
        Pizza pizza = new Pizza(sabor);
        for(Pizza obj : Automatic.listapizzas ){
            if(pizza.equals(obj)) {
                Automatic.listapizzas.remove(obj);
                obj = null;
            }
        }
    }
    //nao funciona
    public static void atualizarPizza(){
        Automatic.mostrarpizzas();
        System.out.println("QUAL PIZZA GOSTARIA DE ATUALIZAR? ");
        System.out.println("sabor: ");
        sabor = scanner.nextLine();
        //o erro ta por aqui
        Pizza pizza = new Pizza(sabor);
        for(Pizza obj : Automatic.listapizzas ){
            if(pizza.equals(obj)){
                System.out.println("----------------------");
                System.out.println("Alterando pizza! "+obj);
                System.out.println("sabor :");
                sabor = scanner.nextLine();
                obj.setSabor(sabor);
                System.out.println("descrição: ");
                descricao = scanner.nextLine();
                obj.setDescricao(descricao);
                System.out.println("preço: ");
                preco = scanner.nextDouble();
                obj.setPreco(preco);
                System.out.println("----------------");
                System.out.println("pizza atualizada! "+obj);
            }
        }


    }

    //nao testei se funciona ainda
    public static void contratarEntregador(){
        Entregador entregador = new Entregador();
        System.out.println("Novo entregador: ");
        System.out.println("nome: ");
        nome = scanner.nextLine();
        entregador.setNome(nome);
        System.out.println("salario: ");
        salario = scanner.nextDouble();
        entregador.setSalario(salario);
        Automatic.listaentregadores.add(entregador);
        entregador.setId(Automatic.listaentregadores.indexOf(entregador)+100);
        System.out.println("CONTRATADO! "+entregador);

    }

}
