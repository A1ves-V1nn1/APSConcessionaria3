package projetoaps;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoAPS {
    public static ArrayList<Cliente> lista = new ArrayList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha uma das opções:\n1) Cadastrar Cliente\n2) Apagar Cliente\n3) Mostrar clientes\n4) Sair");
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
}
   
