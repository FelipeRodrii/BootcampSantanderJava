import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Bom dia/tarde/noite, ficamos felizes que queira abrir uma conta, conosco : )\n");

        System.out.println("Vamos começar solicitando algumas informações\n\n");

        System.out.println("Informe seu NOME: ");
        nomeCliente= scan.nextLine();
        System.out.println("\n");

        System.out.println("Informe sua AGENCIA: ");
        agencia= scan.nextLine();
        System.out.println("\n");

        System.out.println("Informe seu NÚMERO DE CONTA: ");
        numeroConta= scan.nextLine();
        System.out.println("\n");

        System.out.println("Informe seu SALDO INICIAL: ");
        saldo= scan.nextFloat();
        System.out.println("\n");

        ContaTerminal conta1= new ContaTerminal(numeroConta, agencia, nomeCliente, saldo);

        conta1.ApresentaDados();

        scan.close();




        
        





    }
}
