public abstract class Conta {
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = 1;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor de saque deve ser positivo.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente.");
            return;
        }
        saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor de deposito deve ser positivo.");
            return;
        }
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= 0) {
            System.out.println("Erro: valor de transferencia deve ser positivo.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente para transferencia.");
            return;
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato() {
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.printf("Saldo: R$%.2f%n", saldo);
    }
}
