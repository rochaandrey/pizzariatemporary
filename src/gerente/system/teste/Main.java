package gerente.system.teste;

import gerente.system.modelo.Bebida;
import gerente.system.modelo.Entregador;
import gerente.system.modelo.MenuAndClear;
import gerente.system.modelo.Pizza;

import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        baseconfig();
        byte escolha;
        do {
            MenuAndClear.menu();
            escolha = scanner.nextByte();
            scanner.nextLine();  // se der algum erro remove isso em todos os cases
            switch (escolha) {
                case 1:
                    MenuAndClear.clear();
                    addPizza();
                    scanner.nextLine();
                    MenuAndClear.clear();
                    break;
                case 2:
                    MenuAndClear.clear();
                    removePizza();
                    scanner.nextLine();
                    MenuAndClear.clear();
                    break;
                case 3:
                    MenuAndClear.clear();
                    atualizarPizza();
                    scanner.nextLine();
                    MenuAndClear.clear();
                case 4:
                    MenuAndClear.clear();
                    addBebida();
                    scanner.nextLine();
                    MenuAndClear.clear();
                    break;
                case 5:
                    MenuAndClear.clear();
                    removeBebida();
                    scanner.nextLine();
                    MenuAndClear.clear();
                    break;
                case 6:
                    MenuAndClear.clear();
                    atualizarBebida();
                    scanner.nextLine();
                    MenuAndClear.clear();
                    break;
                case 7:
                    MenuAndClear.clear();
                    contratarEntregador();
                    scanner.nextLine();
                    MenuAndClear.clear();
                    break;
                case 8:
                    MenuAndClear.clear();
                    pagarEntregador();
                    scanner.nextLine();
                    MenuAndClear.clear();
                    break;
                case 9:
                    MenuAndClear.clear();
                    demitirEntregador();
                    scanner.nextLine();
                    MenuAndClear.clear();
                    break;
                case 10:
                    MenuAndClear.clear();
                    verpedidos();
                    scanner.nextLine();
                    MenuAndClear.clear();
                default:
                    System.exit(0);
                    break;
            }
        } while (escolha != 11);
    }

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

        if(!Automatic.listapizzas.contains(pizza)){
            Automatic.listapizzas.add(pizza);
            System.out.println("pizza adicionada! "+ pizza);
        }

    }

    public static void removePizza(){
        String sabor;

        Automatic.mostrarbebidas();
        System.out.println("REMOVENDO PIZZA...");
        System.out.println("sabor: ");
        sabor = scanner.nextLine();
        scanner.nextLine(); // se der erro tira isso
        Pizza pizza = new Pizza(sabor);

        if(Automatic.listapizzas.contains(pizza)){
            for(Pizza random : Automatic.listapizzas){
                if(pizza.equals(random)){
                    Automatic.listapizzas.remove(random);
                    System.out.println(random.getSabor()+" REMOVIDO");
                    break;
                }
            }
        }
    }

    public static void atualizarPizza(){
        String sabor;
        String descricao;
        double preco;

        Automatic.mostrarpizzas();
        System.out.println("QUAL PIZZA GOSTARIA DE ATUALIZAR? ");
        System.out.println("sabor: ");
        sabor = scanner.nextLine();

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

        if(!Automatic.listabebidas.contains(bebida)){
            Automatic.listabebidas.add(bebida);
            System.out.println("Bebida adicionada: "+bebida);
        }
    }

    public static void removeBebida(){
        String nome;

        Automatic.mostrarbebidas();
        System.out.println("REMOVENDO BEBIDA...");
        System.out.println("nome: ");
        nome = scanner.nextLine();
        scanner.nextLine(); // se der erro tira isso
        Bebida bebida = new Bebida(nome);

        if(Automatic.listabebidas.contains(bebida)){
            for(Bebida random : Automatic.listabebidas){
                if(bebida.equals(random)){
                    Automatic.listabebidas.remove(random);
                    System.out.println(random.getNome()+" REMOVIDO");
                    break;
                }
            }
        }
    }

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

    public static void contratarEntregador(){
        String nome;
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

        //aqui nao precisa de contain, já que podem ter entregadores de mesmo nome mas com id's diferetes

        Automatic.listaentregadores.add(entregador);
        entregador.setId(Automatic.listaentregadores.indexOf(entregador)+100);
        System.out.println("CONTRATADO! "+entregador);

    }

    public static void pagarEntregador(){
        byte id;

        Automatic.mostrarentregadores();
        System.out.println("QUAL O ENTREGADOR DESEJA PAGAR? ");
        System.out.println("id: ");
        id = scanner.nextByte();
        Entregador entregador = new Entregador(id);
        scanner.nextLine();  //se tiver dando erro, acho que tirar isso resolve
        if (Automatic.listaentregadores.contains(entregador)) {
            for( Entregador random : Automatic.listaentregadores){
                if(entregador.equals(random)){
                    System.out.println("entregador pago!");
                }
            }
        }
    }

    public static void demitirEntregador(){
        byte id;
        Automatic.mostrarentregadores();
        System.out.println("DEMITIR ENTREGADOR...");
        System.out.println("id: ");
        id = scanner.nextByte();
        scanner.nextLine(); // se der erro tira isso
        Entregador entregador = new Entregador(id);

        if(Automatic.listaentregadores.contains(entregador)){
            for(Entregador random : Automatic.listaentregadores){
                if(entregador.equals(random)){
                    Automatic.listaentregadores.remove(random);
                    System.out.println(random.getNome()+" DEMITIDO!");
                    break;
                }
            }
        }
    }

    public static void verpedidos(){

    }

    public static void baseconfig(){
        Pizza pizza1 = new Pizza("marguerita","oregano, queijo, tomate", 32);
        Pizza pizza2 = new Pizza("calabresa","oregano, queijo, calabresa", 32);
        Pizza pizza3 = new Pizza("frango","oregano, queijo, frango", 32);

        Bebida bebida1 = new Bebida("Coca-cola Lata", 6);
        Bebida bebida2 = new Bebida("Fanta Lata", 6);

        Entregador entregador1 = new Entregador("José", 1500);
        Entregador entregador2 = new Entregador("Raimundo", 1500);
    }
}


