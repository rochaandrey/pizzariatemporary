package gerente.system;

import java.util.Scanner;


public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        byte escolha;
        menu();
        escolha = scanner.nextByte();
        switch (escolha){
            case 1:
                addPizza();
                menu();
                break;
            case 2:
                removePizza();
                menu();
                break;
            case 3:
                attPizza();
                menu();
            case 4:
                addBebida();
                menu();
                break;
            case 5:
                removeBebida();
                menu();
                break;
            case 6:
                atualizarBebida();
                menu();
                break;
            default:
                break;
        }
    }


    //falta adicionar uma função para ver se a pizza com o nome criado já existe no array, se sim, nao adiciona

    public static void addPizza(){
        clear();
        String sabor;
        String descricao;
        double preco;
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
        scanner.nextLine();
        pizza.setPreco(preco);

        Automatic.listapizzas.add(pizza);
        System.out.println("pizza adicionada! "+ pizza);
    }

    public static void removePizza(){
        clear();
        byte indexpizza;
        Pizza pizza = new Pizza();

        Automatic.mostrarpizzas();
        System.out.println("QUAL O ID (número) DA PIZZA QUE DESEJA REMOVER? ");
        System.out.println("id: ");
        indexpizza = scanner.nextByte();

        if(Automatic.listapizzas.get(indexpizza-1) != null){
            System.out.println("removendo a pizza: "+Automatic.listapizzas.get(indexpizza-1));
        }else{
            return;
        }
    }

    public static void attPizza(){
        clear();
        String sabor;
        String descricao;
        double preco;

        Automatic.mostrarpizzas();
        System.out.println("QUAL PIZZA GOSTARIA DE ATUALIZAR? ");
        System.out.println("sabor: ");
        sabor = scanner.nextLine();

        //o erro ta por aqui!
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
                scanner.nextLine();
                obj.setPreco(preco);

                System.out.println("----------------");
                System.out.println("pizza atualizada! "+obj);
            }
        }


    }

    //falta adicionar uma função para ver se a bebida com o nome criado já existe no array, se sim, nao adiciona
    public static void addBebida(){
        clear();
        String nome;
        double preco;
        Bebida bebida = new Bebida();

        System.out.println("ADICIONANDO BEBIDA...");
        System.out.println("nome: ");
        nome = scanner.nextLine();
        bebida.setNome(nome);
        System.out.println("preco: ");
        preco = scanner.nextDouble();
        scanner.nextLine();
        bebida.setPreco(preco);

        Automatic.listabebidas.add(bebida);
        System.out.println("Bebida adicionada: "+bebida);
    }

    //nao testei se funciona
    public static void removeBebida(){
        clear();
        byte indexbebida;
        Pizza pizza = new Pizza();

        Automatic.mostrarbebidas();
        System.out.println("QUAL O ID (número) DA BEBIDA QUE DESEJA REMOVER? ");
        System.out.println("id: ");
        indexbebida = scanner.nextByte();

        for(Bebida bebida : Automatic.listabebidas){
            if(Automatic.listabebidas.get(indexbebida-1) != null){
                System.out.println("removendo a bebida: "+Automatic.listabebidas.remove(Automatic.listabebidas.get(indexbebida-1)));
                return;
            }
        }
    }
// deve ta com erro ainda
    public static void atualizarBebida(){
        clear();
        String nome;
        double preco;

        Automatic.mostrarpizzas();
        System.out.println("QUAL BEBIDA GOSTARIA DE ATUALIZAR? ");
        System.out.println("nome: ");
        nome = scanner.nextLine();

        //o erro ta por aqui!
        Bebida bebida = new Bebida(nome);
        for(Bebida obj : Automatic.listabebidas ){
            if(bebida.equals(obj)){
                System.out.println("----------------------");
                System.out.println("Alterando bebida! "+obj);
                System.out.println("nome :");
                nome = scanner.nextLine();
                obj.setNome(nome);
                System.out.println("preço: ");
                preco = scanner.nextDouble();
                scanner.nextLine();
                obj.setPreco(preco);
                System.out.println("----------------");
                System.out.println("bebida atualizada! "+obj);
            }
        }


    }

    //nao testei se funciona ainda!
    public static void contratarEntregador(){
        clear();
        String nome;
        int id;
        double salario;
        Entregador entregador = new Entregador();

        System.out.println("Novo entregador: ");
        System.out.println("nome: ");
        nome = scanner.nextLine();
        entregador.setNome(nome);
        System.out.println("salario: ");
        salario = scanner.nextDouble();
        scanner.nextLine();
        entregador.setSalario(salario);

        Automatic.listaentregadores.add(entregador);
        entregador.setId(Automatic.listaentregadores.indexOf(entregador)+100);
        System.out.println("CONTRATADO! "+entregador);
    }

    public static void demitirEntregador(){
        clear();
        byte id;
        System.out.println("DEMITIR ENTREGADOR...");
        Automatic.mostrarentregadores();
        System.out.println("----------------");
        System.out.println("qual o ID do funcionário a ser demitido ?" );
        id = scanner.nextByte();
        Entregador entregador = new Entregador();
        entregador.setId(id);
        for(Entregador randomentregador : Automatic.listaentregadores){
            if(randomentregador.equals(entregador)){
                Automatic.listaentregadores.remove(entregador);
                entregador= null;
                break;
            }
        }


    }

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
    static void clear() {
        //imprime linhas em branco
        int contador = 0;
        while (contador < 20) {
            System.out.println();
            contador++;
        }
    }

}


