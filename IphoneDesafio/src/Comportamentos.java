
public class Comportamentos implements AcoesIphone {
  // reprodutor musical
  private boolean pausar;
  private boolean tocar;
  private String selecionarMusica;

  public boolean isPausar() {
    return pausar;
  }

  public void setPausar(boolean pausar) {
    this.pausar = pausar;
  }

  public boolean isTocar() {
    return tocar;
  }

  public void setTocar(boolean tocar) {
    this.tocar = tocar;
  }

  public String getSelecionarMusica() {
    return selecionarMusica;
  }

  public void setSelecionarMusica(String selecionarMusica) {
    this.selecionarMusica = selecionarMusica;
  }

  // aparelho telefônico
  private boolean ligar;
  private String atender;
  private String iniciarCorreioVoz;

  public String getIniciarCorreioVoz() {
    return iniciarCorreioVoz;
  }

  public void setIniciarCorreioVoz(String iniciarCorreioVoz) {
    this.iniciarCorreioVoz = iniciarCorreioVoz;
  }

  public String getAtender() {
    return atender;
  }

  public void setAtender(String atender) {
    this.atender = atender;
  }

  public boolean isLigar() {
    return ligar;
  }

  public void setLigar(Boolean ligar) {
    this.ligar = ligar;
  }

  // Navegador na internet
  private String exibirPagina;
  private String atualizarPagina;
  private String adicionarNovaAba;

  public String getAtualizarPagina() {
    return atualizarPagina;
  }

  public void setAtualizarPagina(String atualizarPagina) {
    this.atualizarPagina = atualizarPagina;
  }

  public String getAdicionarNovaAba() {
    return adicionarNovaAba;
  }

  public void setAdicionarNovaAba(String adicionarNovaAba) {
    this.adicionarNovaAba = adicionarNovaAba;
  }

  public String getExibirPagina() {
    return exibirPagina;
  }

  public void setExibirPagina(String exibirPagina) {
    this.exibirPagina = exibirPagina;
  }

  @Override
  public void tocar() {
    if (this.isLigar() && this.isPausar()) {
      this.setTocar(true);
      this.setPausar(false);
      System.out.println("Tocando...");
    } else if (this.isLigar() && this.isPausar() == false) {
      System.out.println("Já está tocando");
    } else {
      System.out.println("ligue o Iphone!");
    }
  }

  @Override
  public void pausar() {
    if (this.isLigar() && this.isPausar()) {
      System.out.println("Já esta pausado");
    } else if (this.isLigar() && this.isPausar() == false) {
      this.setPausar(true);
      this.setTocar(false);
      System.out.println("Pausando...");
    } else {
      System.out.println("ligue o Iphone!");
    }
  }

  @Override
  public void selecionarMusica() {
    if (this.isLigar()) {
      System.out.println("Selecionando musica");
    } else {
      System.out.println("ligue o Iphone para selecionar uma musica");
    }
  }

  @Override
  public void ligar() {
    if (this.isLigar() == false) {
      this.setLigar(true);
      System.out.println("Ligando Iphone");
    } else {
      System.out.println("Iphone já esta ligado!");
    }
  }

  @Override
  public void desligar() {
    if (this.isLigar() == false) {
      System.out.println("Iphone ja esta desligado");
    } else {
      this.setLigar(false);
      System.out.println("Desligando Iphone");
    }
  }

  @Override
  public void atender() {
    if (this.isLigar()) {
      System.out.println("Atendendo...");
    } else {
      System.out.println("Ligue o iphone!");
    }
  }

  @Override
  public void iniciarCorreioVoz() {
    if (this.isLigar()) {
      System.out.println("Iniciando correio de voz");
    } else {
      System.out.println("Ligue o iphone!");
    }
  }

  @Override
  public void exibirPagina() {
    if (this.isLigar()) {
      System.out.println("Exibindo pagina");
    } else {
      System.out.println("Ligue o iphone!");
    }
  }

  @Override
  public void adicionarNovaAba() {
    if (this.isLigar()) {
      System.out.println("Adicionando nova aba");
    } else {
      System.out.println("Ligue o iphone!");
    }
  }

  @Override
  public void atualizarPagina() {
    if (this.isLigar()) {
      System.out.println("Atualizando pagina");
    } else {
      System.out.println("Ligue o iphone!");
    }
  }

  public Comportamentos() {
    this.ligar = false;
    this.pausar = true;

  }
}