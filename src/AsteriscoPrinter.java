public class AsteriscoPrinter {
    // A classe 'AsteriscoPrinter' é responsável por imprimir uma linha de asteriscos
    // O método 'imprimirAsteriscos' é utilizado para realizar a impressão de asteriscos de acordo com a quantidade fornecida.

    // Método para imprimir os asteriscos
    public void imprimirAsteriscos(int quantidade) {
        // Usando um laço for para imprimir os asteriscos
        for (int i = 0; i < quantidade; i++) {
            // A cada iteração do laço, um asterisco é impresso sem pular a linha
            System.out.print("*");
        }
        // Após imprimir todos os asteriscos, imprimimos uma nova linha para finalizar a linha de asteriscos
        System.out.println();
    }
}
