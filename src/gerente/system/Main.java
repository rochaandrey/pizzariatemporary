package gerente.system;

import java.util.Scanner;

//talvez os 2 objetos criados nos métodos demitir e remover tenham que receber null, não sei se muda algo
public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        byte escolha;
        InterfaceGerente.menu();
        escolha = scanner.nextByte();
        switch (escolha){
            case 1:
                InterfaceGerente.clear();
                addPizza();
                scanner.nextLine();  // se der algum erro remove isso em todos os cases
                InterfaceGerente.clear(); // e ESSE DAQUI tambem
                InterfaceGerente.menu();
                break;
            case 2:
                InterfaceGerente.clear();
                removePizza();
                scanner.nextLine();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            case 3:
                InterfaceGerente.clear();
                atualizarPizza();
                scanner.nextLine();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
            case 4:
                InterfaceGerente.clear();
                addBebida();
                scanner.nextLine();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            case 5:
                InterfaceGerente.clear();
                removeBebida();
                scanner.nextLine();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            case 6:
                InterfaceGerente.clear();
                atualizarBebida();
                scanner.nextLine();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            case 7:
                InterfaceGerente.clear();
                contratarEntregador();
                scanner.nextLine();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            case 8:
                InterfaceGerente.clear();
                pagarEntregador();
                scanner.nextLine();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            case 9:
                InterfaceGerente.clear();
                demitirEntregador();
                scanner.nextLine();
                InterfaceGerente.clear();
                InterfaceGerente.menu();
                break;
            default:
                System.exit(0);
                break;
        }
    }

    //nao testei
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

    //nao testei
    public static void removePizza(){
        String sabor;

        Automatic.mostrarbebidas();
        System.out.println("REMOVENDO BEBIDA...");
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

    //tava com erro, mas nao testei se resolveu
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

    //testa ai se funciona
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

    //testa ai se funciona
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

    // nao testei
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

    //nao testei
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

    //nao testei
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

}


