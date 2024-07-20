package desafios.banco;

public abstract class Conta {

    // atribuição das variáveis
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    // atribuição de agencia (sempre 1) e variável para incrementar o número das
    // contas
    protected static int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    // construtor
    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = new Cliente();
    }

    // operações básicas
    public void sacar(double valor) {
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.saldo += valor;
    }

    // getters
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    // impressão das informações
    protected void imprimirSaldo() {
        System.out.println("### Dados do Titular ###");
        System.out.println(String.format("Nome: %s", this.cliente.getNome()));
        System.out.println(String.format("Idade: %d", this.cliente.getIdade()));
        System.out.println(String.format("Sexo: %s", this.cliente.getSexo()));
        
        System.out.println("### Dados da Conta ###");
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println();
    }
}
