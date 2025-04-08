public class DadosCliente {
    public static void main(String[] args) {
        // Declaração e inicialização de variáveis com os dados do cliente
        String nome = "Joaquim";   // Nome do cliente
        String conta = "Corrente"; // Tipo de conta do cliente (por exemplo, Corrente ou Poupança)
        double saldoInicial = 1599.99;    // Saldo inicial da conta do cliente

        // Criação de um objeto 'exibir' da classe MenuCliente, responsável por exibir os dados do cliente
        MenuCliente exibir = new MenuCliente();  // Cria o objeto da classe MenuCliente

        // Chama o método 'exibir' da classe MenuCliente, passando os parâmetros 'nome', 'conta' e 'saldo'
        // Esse método vai mostrar os dados do cliente de forma formatada
        exibir.exibir(nome, conta, saldoInicial);  // Chama o método 'exibir' e passa as informações do cliente
    }
}
