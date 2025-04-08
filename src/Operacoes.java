public class Operacoes {
    // Atributo da classe Operacoes, que armazena o saldo da conta
    private double saldo;

    // Construtor da classe Operacoes que inicializa o saldo com o valor fornecido
    public Operacoes(double saldoInicial) {
        this.saldo = saldoInicial;  // Inicializa o saldo com o valor passado para o construtor
    }

    // Método para consultar o saldo da conta
    public double consultarSaldo() {
        return saldo;  // Retorna o saldo atual da conta
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;  // Adiciona o valor ao saldo (realiza o depósito)
        } else {
            // Se o valor for menor ou igual a 0, imprime uma mensagem de erro
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar um valor da conta
    public void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;  // Deduz o valor do saldo (realiza o saque)
        } else {
            // Se o valor for maior que o saldo ou inválido, imprime uma mensagem de erro
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}
