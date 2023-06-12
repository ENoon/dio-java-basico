public class Banco {
    public static void main(String[] args) {

        Cliente c[] = new Cliente[3];

        c[0] = new Cliente("Felipe", "81811588874", "77448-1", 98118, "Conta Corrente");
        c[1] = new Cliente("Gisela", "54515654751", "74210-8", 66666, "Conta Corrente");
        c[2] = new Cliente("Isabela", "76541389547", "15107-8", 47151, "Conta Poupança");

        c[0].depositar(10000);
        c[0].transferir(c[1], 1000);
        c[1].sacar(950);
        c[1].transferir(c[2], 50);
        c[0].extrato();
        c[1].extrato();
        c[2].extrato();
    }
}
