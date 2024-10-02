public abstract class Conta{

    private static final int AGENCIA_PADRAO= 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void depositar(double valor){
            this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor >= this.getSaldo()) {
            this.saldo -= valor;
        }else System.out.println("Saldo indisponivel");
    }

    public void transferir(double valor,Conta contaDestino){
        if (valor >= this.getSaldo()) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
        }
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

    protected void imprimirExtrato(){
        System.out.println("=====Extrato Conta=====");
        System.out.println("Agencia: " +  this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " +this.saldo );
    }
}
