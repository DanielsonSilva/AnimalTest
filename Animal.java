import java.lang.*;

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

  /**
   * Método que calcula quanto o animal vai engordar de acordo com os parâmetros
   * @param especie A especie que deve ser tratada.
   * @param quantidadeKgEngordar Quantidade de quilos de comida que deve ser administrada ao animal.
   * @return Retorna o que seria o peso final do animal após a alimentação com a quantidade de comida entregue.
   */
  public double engordar(int especie, double quantidadeKgEngordar) {
    // iniciando a variável
    double cresceKg = 0;
    // de acordo com a espécie o cálculo será diferente
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
      // Caso for inserido uma espécie não aceita, emite mensagem e retorno 0
      default:
        System.out.println("Espécie não aceita");
        return 0.;
    }
    // retorna o quanto o animal cresceu em peso
    return cresceKg;
  }

  /**
   * Método que calcula os dias para o abate do animal
   * @param especie A espécie do animal.
   * @param pesoAtual O peso atual do animal.
   * @param pesoFinal O peso final de abate do animal.
   * @return Quantidade de dias para que o animal chegue no peso final através da engorda para ser abatido.
   */
  public int diasParaAbate(int especie, double pesoAtual, double pesoFinal) {
    // Não faz sentido o peso final ser menor que o peso atual
    if (pesoFinal < pesoAtual) {
      System.out.println("O animal não pode emagrecer para o abate");
      return 0;
    }
    // Quantidade de quilos que o animal precisa crescer
    double precisaCrescer = pesoFinal - pesoAtual;
    // Como a conversão alimentar permite crescer até 1 quilo por dia (máximo), o resultado será
    //a diferença entre os pesos final e inicial. Como um dia parcial deve contar como
    //um dia completo, então o resultado será o próximo inteiro.
    double tempo = Math.ceil(precisaCrescer);
    return (int) tempo;
  }

}