
public class Cliente extends Conta {

  public Cliente(String nome, String cpf, String agencia, int numeroConta, String tipo) {
    this.nome = nome;
    this.cpf = cpf;
    this.setAgencia(agencia);
    this.setNumeroConta(numeroConta);
    this.setTipo(tipo);
    this.setSaldo(0);
  }

  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  private String cpf;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public void extrato() {
    System.out.println("------------EXTRATO------------");
    System.out.println("Nome: " + this.getNome());
    System.out.println("Tipo da conta: " + getTipo());
    System.out.println("Agência: " + this.getAgencia());
    System.out.println("Numero da conta: " + this.getNumeroConta());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("-------------------------------");
  }

  @Override
  public void sacar(double valor) {
    if (this.getSaldo() >= valor) {
      this.setSaldo(this.getSaldo() - valor);
    } else {
      System.out.println("Saldo insuficiente");
    }
  }

  @Override
  public void depositar(double valor) {
    this.setSaldo(this.getSaldo() + valor);
  }

  @Override
  public void transferir(Conta contaDestino, double valor) {
    if (this.getSaldo() >= valor) {
      this.sacar(valor);
      contaDestino.depositar(valor);
    } else {
      System.out.println("saldo insuficiente");
    }
  }
}