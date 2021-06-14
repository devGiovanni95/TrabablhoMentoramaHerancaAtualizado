public class TestaContaPoupanca {
    public static void main(String[] args) {
        Conta contas[] = new Conta[3];

        ContaPoupanca cp = new ContaPoupanca(1, 1, "Banco 1 ", 100, 11);


        System.out.println(cp);
        cp.depositar(50);
        System.out.println(cp);
        cp.depositar(400);
        System.out.println(cp);
        cp.sacar(500);
        System.out.println(cp);
        System.out.println("O saldo atual é: " + cp.getSaldo());

    }
}
