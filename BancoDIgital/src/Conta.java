
public class Conta implements Acoes {

  private String agencia;

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  private int numeroConta;

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  private double saldo;

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  private String tipo;

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public void sacar(double valor) {
  }

  @Override
  public void depositar(double valor) {
  }

  @Override
  public void transferir(Conta contaDestino, double valor) {
  }

  @Override
  public void extrato() {
  }
}