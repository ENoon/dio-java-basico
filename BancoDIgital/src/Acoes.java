public interface Acoes {

  public abstract void sacar(double valor);

  public abstract void depositar(double valor);

  public abstract void transferir(Conta contaDestino, double valor);

  public abstract void extrato();

}
