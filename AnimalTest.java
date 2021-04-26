
/**
 * Classe de teste da classe Animal
 */
class AnimalTest {

  /** Propriedade do Animal para realização de testes */
  public Animal animal;

  /**
   * Método que calcula quanto o animal vai engordar de acordo com os parâmetros
   * @param especie A especie que deve ser tratada.
   * @param quantidadeKgEngordar Quantidade de quilos de comida que deve ser administrada ao animal.
   * @return Retorna a propriedade da classe com o peso atualizado
   */
  public Animal engordar(int especie, double quantidadeKgEngordar) {
    // executando método da classe Animal
    double cresceKg = this.animal.engordar(especie, quantidadeKgEngordar);
    // atualizando o peso atual do animal
    this.animal.setPesoAtual(animal.getPesoAtual() + cresceKg);
    return this.animal;
  }

  /**
   * Método que calcula os dias para o abate do animal
   * @param especie A espécie do animal.
   * @param pesoAtual O peso atual do animal.
   * @param pesoFinal O peso final de abate do animal.
   * @return A propriedade animal com o peso final atualizado.
   */
  public Animal diasParaAbate(int especie, double pesoAtual, double pesoFinal) {
    // executando o método da classe Animal
    int dias = this.animal.diasParaAbate(especie, pesoAtual, pesoFinal);
    // atualizando o peso final do animal
    this.animal.setPesoFinal(pesoFinal);
    return this.animal;
  }

  public void ImprimirResposta() {
    System.out.println(this.animal.getEspecie());
    System.out.printf("O animal está com o peso de %.2f Kg e pretende estar com %.2f para o abate \r\n",
      this.animal.getPesoAtual(), this.animal.getPesoFinal());
    System.out.println("----");
  }

}