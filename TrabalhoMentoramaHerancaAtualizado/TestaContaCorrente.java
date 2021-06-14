public class TestaContaCorrente {
    public static void main(String[] args) {
        Conta contas[] = new Conta[1];

        ContaCorrente cc = new ContaCorrente(1, 1, "Banco 1 ", 100, 1000);



        System.out.println(cc);
        cc.depositar(50);
        System.out.println(cc);
        cc.sacar(800);
        System.out.println(cc);
        cc.sacar(350);
        System.out.println(cc);
        cc.sacar(350);
        System.out.println("O saldo atual é: " + cc.getSaldo());


    }
}
