public abstract class Conta implements InterfaceConta{
    private int agencia;
    private int numero;
    private double saldo = 0d;
    private Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        banco.adicionarConta(this);
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("-----> Saldo insuficiente para resgate!");
        }
        else {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, InterfaceConta contaDestino) {
        if (valor > saldo) {
            System.out.println("######################################\n" +
                    "Saldo insuficiente para transferência!" +
                    "\n######################################");
        }
        else {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("######################################\n" +
                    "Transferência realizada com sucesso!" +
                    "\n######################################");
        }

    }

    private int getAgencia() {
        return agencia;
    }

    private int getNumero() {
        return numero;
    }

    private double getSaldo() {
        return saldo;
    }

    protected void dadosConta() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Numero: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente.getNome() +
                '}';
    }
}
