
/**
 * Classe que representa o animal e suas características
 */
class Animal {

  /** espécie do animal */
  public String especie;

  /** peso atual do animal */
  private double pesoAtual;

  /** peso final do animal */
  private double pesoFinal;

  /**
   * Método de recuperação da propriedade espécie
   */
  public String getEspecie() {
    return this.especie;
  }

  /**
   * Método de atribuição da propriedade espécie
   */
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  /**
   * Método de recuperação da propriedade de peso atual
   */
  public double getPesoAtual() {
    return this.pesoAtual;
  }

  /**
   * Método de atribuição da propriedade do peso atual
   */
  public void setPesoAtual(double pesoAtual) {
    this.pesoAtual = pesoAtual;
  }

  /**
   * Método de recuperação da propriedade do peso final
   */
  public double getPesoFinal() {
    return this.pesoFinal;
  }

  /**
   * Método de atribuição da propriedade do peso final
   */
  public void setPesoFinal(double pesoFinal) {
    this.pesoFinal = pesoFinal;
  }

  /**
   * Função comentada devido já existir função com esse mesmo nome.
   * Em java não é possível ter duas funções com a mesma assinatura diferenciando
   * apenas no tipo de retorno
  public void engordar(int especie, double quantidadeKgEngordar) {
    int x = 0;
  }
  */

  public double engordar(int especie, double quantidadeKgEngordar) {
    double cresceKg = 0;
    switch (especie) {
      case 1:
        cresceKg = quantidadeKgEngordar/2.9;
        break;
      case 2:
        cresceKg = quantidadeKgEngordar/1.8;
        break;
      case 3:
        cresceKg = quantidadeKgEngordar/1.5;
        break;
      default:
        System.out.println("Espécie não aceita");
        break;
    }
    return cresceKg;
  }

  public int diasParaAbate(int especie, double pesoAtual, double pesoFinal) {
    double precisaCrescer = pesoFinal - pesoAtual;
    switch (especie) {
      case 1:
        cresceKg = quantidadeKgEngordar/2.9;
        break;
      case 2:
        cresceKg = quantidadeKgEngordar/1.8;
        break;
      case 3:
        cresceKg = quantidadeKgEngordar/1.5;
        break;
      default:
        System.out.println("Espécie não aceita");
        break;
    }
  }

}