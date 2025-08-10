public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva");
        Cliente cliente2 = new Cliente("Maria Souza");

        // Criando contas
        Conta cc1 = new ContaCorrente(cliente1);
        Conta poup1 = new ContaPoupanca(cliente1);

        Conta cc2 = new ContaCorrente(cliente2);

        // Operações
        cc1.depositar(1000.00);
        cc1.transferir(250.00, poup1);

        cc2.depositar(500.00);
        cc2.sacar(100.00);

        // Banco
        Banco banco = new Banco("Banco Digital DIO");
        banco.adicionarConta(cc1);
        banco.adicionarConta(poup1);
        banco.adicionarConta(cc2);

        // Impressão de extratos
        banco.imprimirContas();
    }
}
