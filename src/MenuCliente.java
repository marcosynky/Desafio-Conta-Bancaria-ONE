import java.util.Scanner;

public class MenuCliente {

    // Método para exibir os dados do cliente e o menu de operações
    public void exibir(String nome, String conta, double saldoInicial) {
        AsteriscoPrinter asterisco = new AsteriscoPrinter();  // Instanciando a classe AsteriscoPrinter

        // Imprime 30 asteriscos antes de exibir os dados
        asterisco.imprimirAsteriscos(30);

        // Exibe os dados do cliente
        System.out.println("Dados do cliente:");
        System.out.println("\nNome do cliente : " + nome);   // Exibe o nome do cliente
        System.out.println("Tipo da Conta : " + conta);       // Exibe o tipo de conta


        // Imprime 30 asteriscos após exibir os dados
        asterisco.imprimirAsteriscos(30);

        // Exibe o menu de operações
        System.out.println("\nOperações");
        System.out.println("\n 1- Consultar saldos ");
        System.out.println(" 2- Receber valor ");
        System.out.println(" 3- Transferir valor ");
        System.out.println(" 4- Sair ");

        // Instancia um objeto da classe Operacoes
        Operacoes operacoes;
        operacoes = new Operacoes(saldoInicial);
        exibirOperacoes(operacoes);
    }

    // Método para exibir as operações e permitir que o cliente faça escolhas
    public void exibirOperacoes(Operacoes operacoes) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que escolha uma operação
        System.out.println("\nEscolha uma operação:");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                // Exibe o saldo atual
                System.out.println("Saldo atual: R$ " + operacoes.consultarSaldo());
                break;
            case 2:
                // Solicita ao cliente o valor a ser depositado
                System.out.println("Digite o valor a ser depositado: ");
                double valorDepositar = scanner.nextDouble();
                operacoes.depositar(valorDepositar);  // Realiza o depósito
                System.out.println("Novo saldo: R$ " + operacoes.consultarSaldo());
                break;
            case 3:
                // Solicita ao cliente o valor a ser transferido
                System.out.println("Digite o valor a ser transferido: ");
                double valorTransferir = scanner.nextDouble();
                operacoes.sacar(valorTransferir);  // Realiza o saque (transferência)
                System.out.println("Novo saldo após transferência: R$ " + operacoes.consultarSaldo());
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
