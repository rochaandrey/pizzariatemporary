package gerente.system;

import java.util.Scanner;

//por motivos desconhecidos, alguns atributos como o SABOR não estão conseguindo receber scanner.nextLine();

public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*byte escolha;
        InterfaceGerente.menu();
        escolha = scanner.nextByte();
        switch (escolha){
            case 1:
                InterfaceGerente.clear();
                addPizza();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            case 2:
                InterfaceGerente.clear();
                removePizza();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            case 3:
                InterfaceGerente.clear();
                atualizarPizza();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
            case 4:
                InterfaceGerente.clear();
                addBebida();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            case 5:
                InterfaceGerente.clear();
                removeBebida();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            case 6:
                InterfaceGerente.clear();
                atualizarBebida();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            default:
                break;
        }
*/
        addPizza();
        addPizza();
    }


    //falta adicionar uma função para ver se a pizza com o nome criado já existe no array, se sim, nao adiciona

    public static void addPizza(){
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

    //creio eu que consegui consertar
    public static void removePizza(){
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

    //ta com erro
    public static void atualizarPizza(){
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
        byte indexbebida;
        Pizza pizza = new Pizza();

        Automatic.mostrarbebidas();
        System.out.println("QUAL O ID (número) DA BEBIDA QUE DESEJA REMOVER? ");
        System.out.println("id: ");
        indexbebida = scanner.nextByte();

        if(Automatic.listabebidas.get(indexbebida-1) != null){
            System.out.println("removendo a bebida: "+Automatic.listabebidas.get(indexbebida-1));
        }else{
            return;
        }
    }

    // nao faço a minima ideia do porq nao funciona
    public static void atualizarBebida(){
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

}


