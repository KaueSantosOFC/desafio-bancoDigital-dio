public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco();

        Cliente cliente01 = new Cliente("Kaue");
        Cliente cliente02 = new Cliente("Duda");
        Cliente cliente03 = new Cliente("Gabriel");
        Cliente cliente04 = new Cliente("Erik");

        Conta conta1 = new ContaCorrente(cliente01, santander);
        Conta conta2 = new ContaPoupanca(cliente02, santander);
        Conta conta3 = new ContaCorrente(cliente03, santander);
        Conta conta4 = new ContaCorrente(cliente04, santander);

        conta1.depositar(250);
        conta2.depositar(50);
        conta3.depositar(10);
        conta4.depositar(30);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
        conta3.imprimirExtrato();
        conta4.imprimirExtrato();

        conta1.transferir(300, conta2);
        conta1.transferir(50, conta2);
        conta3.transferir(10, conta4);
        conta4.transferir(30, conta1);

        conta2.imprimirExtrato();
        
        santander.exibirLista();
    }
}
