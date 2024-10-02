public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(1000);
        cc.imprimirExtrato();

        Conta vv = new ContaCorrente();
        vv.depositar(10);
        vv.imprimirExtrato();

        Conta aa = new ContaPoupanca();
        aa.depositar(50);
        aa.imprimirExtrato();
    }
}
