public class TestaContaSalario {
    public static void main(String[] args) {
        Conta contas[] = new Conta[1];

        ContaSalario cs = new ContaSalario(1, 1, "Banco 1 ", 1000, 3);


        System.out.println(cs);
        cs.depositar(50);
        System.out.println(cs);
        cs.sacar(500);
        System.out.println(cs);
        cs.sacar(50);
        System.out.println(cs);
        cs.sacar(5);
        System.out.println(cs);
        cs.sacar(200);
    }
}
