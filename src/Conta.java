import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        String nome = "Eloisa Lobo";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        String menu = """
                **  Digite sua opção  **
                1 - Consultrar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        System.out.println("**********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n********************");

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();





            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if  (opcao == 2) {
                System.out.println("Digite o valor a ser transferido: ");
                saldo = saldo - leitura.nextDouble();
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser recebido: ");
                saldo = saldo + leitura.nextDouble();
            }

        }
    }
}


