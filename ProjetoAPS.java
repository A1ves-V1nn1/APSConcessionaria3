package projetoaps;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoAPS {
    
    public static ArrayList<Cliente> lista = new ArrayList();
    public static ArrayList<veiculos> lista1 = new ArrayList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha uma das opções:\n1) Cadastrar Cliente\n2) Apagar Cliente\n3) Mostrar clientes\n4)Logar como funcionário\n5) Sair");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    CadastrarCliente();
                    break;
                case 2:
                    System.out.println("Digite a posição do cliente para apagar");
                    int numero = scanner.nextInt();
                    ApagarCliente(numero);
                    break;
                case 3:
                    MostrarClientes();
                    break;
                case 4:
                    Logarfuncionario();
                    return;
                case 5:
                    return;
                default:
                    System.out.println("Erro ao escolher a opção");
            }
        }
    }
    public static void CadastrarCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente");
        String nome = scanner.next();
        System.out.println("Digite a idade do cliente");
        int idade = scanner.nextInt();
        System.out.println("Digite o endereço do cliente");
        String endereco = scanner.next();
        System.out.println("Digite o email do cliente");
        String email = scanner.next();
        System.out.println("Digite o telefone do cliente");
        String telefone = scanner.next();
        Cliente cliente = new Cliente(nome,idade,endereco,email,telefone);
        lista.add(cliente);
    }

    public static void ApagarCliente(int numero){
lista.remove(numero);
    }
    public static void MostrarClientes(){
        int cont =0;
        System.out.println("\n\n\n");
        for (Cliente cliente:lista) {
            System.out.println(cont + " | " +cliente);
            cont++;
        }
        System.out.println("\n\n\n");
    }
    public static void Logarfuncionario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu código de funcionario: ");
        int codigo = scanner.nextInt();
        if (codigo == 12334){
            System.out.println("Bem vindo Vinícius!");
            while (true) {
                System.out.println("Escolha uma das opções:\n1) Cadastrar Veiculo\n2) Apagar Veiculo\n3) Mostrar Veiculos\n4)Sair");
                int op = scanner.nextInt();
                switch (op) {
                case 1:
                    CadastrarVeiculo();
                    break;
                case 2:
                    System.out.println("Digite a posição do veiculo para apagar");
                    int numero = scanner.nextInt();
                    ApagarVeiculo(numero);
                    break;
                case 3:
                    MostrarVeiculo();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Erro ao escolher a opção");
            }
        public static void CadastrarVeiculo(){
            Scanner scanne = new Scanner(System.in);
            System.out.println("Digite o valor do veiculo:");
            double valor=scanne.nextDouble();
            System.out.println("Digite o ano do veiculo");
            int ano = scanne.nextInt();
            System.out.println("Digite o modelo do veiculo");
            String modelo = scanne.next();
            System.out.println("Digite a marca do veiculo");
            String marca = scanne.next();
            veiculos veiculo = new veiculos(valor,ano,modelo,marca);
            lista1.add(veiculo);
            }
            
            public static void ApagarVeiculo(int numero){
            lista.remove(numero);
            }
            public static void MostrarVeiculo(){
                System.out.println("=== Cadastrados agora ===");
                int cont =0;
                System.out.println("\n\n\n");
                for (veiculos veiculo: lista1) {
                    System.out.println(cont + " | " + veiculo);
                    cont++;
                }
                System.out.println("\n\n\n");
                System.out.println("=== Lista de veiculos disponiveis === \n Modelo= Ford KA \n Valor= 53.000,00 \n Marca= Ford");
            }
        }
    }
}
}
