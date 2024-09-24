package gerente.system.teste;

import gerente.system.modelo.Bebida;
import gerente.system.modelo.Entregador;
import gerente.system.modelo.MenuAndClear;
import gerente.system.modelo.Pizza;

import java.util.Random;
import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        baseconfig();
        byte escolha;
        do {
            MenuAndClear.menu();
            escolha = scanner.nextByte();
            scanner.nextLine();
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
                    break;
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
                    demitirEntregador();
                    scanner.nextLine();
                    MenuAndClear.clear();
                    break;
                case 9:
                    MenuAndClear.clear();
                    atualizarEntregador();
                    scanner.nextLine();
                    MenuAndClear.clear();
                    break;
                case 10:
                    MenuAndClear.clear();
                    verpedidos();
                    scanner.nextLine();
                    MenuAndClear.clear();
                    break;
                case 11:
                    MenuAndClear.clear();
                    System.exit(0);
                    break;
                default:
                    MenuAndClear.clear();
                    break;
            }
        } while (escolha < 20);
    }

    public static void addPizza(){
        Pizza pizza = new Pizza();

        System.out.println("------------------------");
        System.out.println("QUAL O SABOR DA PIZZA? : ");
        pizza.setSabor(scanner.nextLine());

        System.out.println("------------------------");
        System.out.println("QUAIS OS INGREDIENTES DA PIZZA? : ");
        pizza.setDescricao(scanner.nextLine());

        System.out.println("------------------------");
        System.out.println("QUAL O PREÇO DA PIZZA? ");
        pizza.setPreco(scanner.nextDouble());
        scanner.nextLine();

        if(!Automatic.listapizzas.contains(pizza)){
            Automatic.listapizzas.add(pizza);
            System.out.println("pizza adicionada! "+ pizza);
        }else{
            System.out.println("essa pizza já existe!");
        }

    }

    public static void removePizza(){
        String sabor;

        Automatic.mostrarpizzas();
        System.out.println("REMOVENDO PIZZA...");
        System.out.println("sabor: ");
        sabor = scanner.nextLine();
        Pizza pizza = new Pizza(sabor.toUpperCase());

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

        Automatic.mostrarpizzas();
        System.out.println("QUAL PIZZA GOSTARIA DE ATUALIZAR? ");
        System.out.println("sabor: ");
        sabor = scanner.nextLine();

        Pizza pizza = new Pizza(sabor);
        for(Pizza obj : Automatic.listapizzas ){
            if(obj.equals(pizza)){
                System.out.println("----------------------");
                System.out.println("Alterando pizza! "+obj);
                System.out.println("sabor :");
                obj.setSabor(scanner.nextLine());

                System.out.println("descrição: ");
                obj.setDescricao(scanner.nextLine());

                System.out.println("preço: ");
                obj.setPreco(scanner.nextDouble());
                scanner.nextLine();

                System.out.println("----------------");
                System.out.println("pizza atualizada! "+obj);
                Automatic.mostrarpizzas();
                break;
            }
        }
    }

    public static void addBebida(){
        Bebida bebida = new Bebida();

        System.out.println("ADICIONANDO BEBIDA...");
        System.out.println("nome: ");
        bebida.setNome(scanner.nextLine());

        System.out.println("preco: ");
        bebida.setPreco(scanner.nextDouble());
        scanner.nextLine();

        if(!Automatic.listabebidas.contains(bebida)){
            Automatic.listabebidas.add(bebida);
            System.out.println("Bebida adicionada: "+bebida);
        }else{
            System.out.println("a bebida já existe!");
        }
    }

    public static void removeBebida(){
        String nome;

        Automatic.mostrarbebidas();
        System.out.println("REMOVENDO BEBIDA...");
        System.out.println("nome: ");
        nome = scanner.nextLine();

        Bebida bebida = new Bebida(nome);
        if(Automatic.listabebidas.contains(bebida)){
            for(Bebida random : Automatic.listabebidas){
                if(random.equals(bebida)){
                    Automatic.listabebidas.remove(random);
                    System.out.println(random.getNome()+" REMOVIDO");
                    break;
                }
            }
        }
    }

    public static void atualizarBebida(){
        String nome;

        Automatic.mostrarbebidas();
        System.out.println("QUAL BEBIDA GOSTARIA DE ATUALIZAR? ");
        System.out.println("nome: ");
        nome = scanner.nextLine();

        Bebida bebida = new Bebida(nome);
        for(Bebida obj : Automatic.listabebidas ){
            if(bebida.equals(obj)){
                System.out.println("----------------------");
                System.out.println("Alterando bebida! "+obj);
                System.out.println("nome :");
                obj.setNome(scanner.nextLine());
                System.out.println("preço: ");
                obj.setPreco(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("----------------");
                System.out.println("bebida atualizada! "+obj);
            }
        }
    }

    public static void contratarEntregador(){
        Entregador entregador = new Entregador();

        System.out.println("Novo entregador: ");
        System.out.println("nome: ");
        entregador.setNome(scanner.nextLine());

        System.out.println("salario: ");
        entregador.setSalario(scanner.nextDouble());
        scanner.nextLine();

        Automatic.listaentregadores.add(entregador);
        entregador.setId(Automatic.listaentregadores.indexOf(entregador)+100);
        System.out.println("CONTRATADO! "+entregador);

    }

    public static void atualizarEntregador(){
        int id;

        Automatic.mostrarentregadores();
        System.out.println("ATUALIZANDO DADOS...");
        System.out.println("qual o id do entregador? ");
        System.out.println("id: ");
        id = scanner.nextInt();
        scanner.nextLine();

        Entregador entregador = new Entregador(id);
        for(Entregador random : Automatic.listaentregadores){
            if(random.equals(entregador)){
                System.out.println("novo nome: ");
                random.setNome(scanner.nextLine());

                System.out.println("salario: ");
                random.setSalario(scanner.nextDouble());

                System.out.println("informações atualizadas! ");
                Automatic.mostrarentregadores();
                scanner.nextLine();
            }
        }
    }

    public static void demitirEntregador(){
        byte id;
        Automatic.mostrarentregadores();
        System.out.println("DEMITIR ENTREGADOR...");
        System.out.println("id: ");
        id = scanner.nextByte();
        scanner.nextLine();
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
        Random random = new Random();
        Pizza pizza;
        Bebida bebida;
        String nomepizza;
        String nomebebida;
        double valor;

        pizza = Automatic.listapizzas.get(random.nextInt(0,Automatic.listapizzas.size()));
        nomepizza = pizza.getSabor();
        bebida = Automatic.listabebidas.get(random.nextInt(0,Automatic.listabebidas.size()));
        nomebebida = bebida.getNome();
        valor = pizza.getPreco() + bebida.getPreco();

        Automatic.listadepedidos.add(nomepizza+" + "+nomebebida+" - VALOR: "+valor);
        Automatic.mostrarpedidos();
    }

    public static void baseconfig(){
        Pizza pizza1 = new Pizza("marguerita","oregano, queijo, tomate", 32);
        Pizza pizza2 = new Pizza("calabresa","oregano, queijo, calabresa", 32);
        Pizza pizza3 = new Pizza("frango","oregano, queijo, frango", 32);

        Bebida bebida1 = new Bebida("Coca-cola Lata", 6);
        Bebida bebida2 = new Bebida("Fanta Lata", 6);

        Entregador entregador1 = new Entregador("José", 1500);
        Entregador entregador2 = new Entregador("Raimundo", 1500);

        Automatic.listabebidas.add(bebida1);
        Automatic.listabebidas.add(bebida2);
        Automatic.listapizzas.add(pizza1);
        Automatic.listapizzas.add(pizza2);
        Automatic.listapizzas.add(pizza3);
        Automatic.listaentregadores.add(entregador1);
        Automatic.listaentregadores.add(entregador2);

        entregador1.setId(Automatic.listaentregadores.indexOf(entregador1)+100);
        entregador2.setId(Automatic.listaentregadores.indexOf(entregador2)+100);
    }
}


