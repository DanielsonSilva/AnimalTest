
/**
 * Classe que executa as outras classes
 */
class AnimalPublicMain {
  public static void main(String[] args) {
    // criando os animais
    Animal suino = new Animal();
    Animal frango = new Animal();
    Animal peixe = new Animal();

    // Definindo as propriedades dos animais
    suino.setEspecie("Suíno");
    suino.setPesoAtual(55.9);
    frango.setEspecie("Frango");
    frango.setPesoAtual(2.3);
    peixe.setEspecie("Peixe");
    peixe.setPesoAtual(1.1);

    // criando os objetos de teste para cada animal
    AnimalTest testeSuino = new AnimalTest();
    AnimalTest testeFrango = new AnimalTest();
    AnimalTest testePeixe = new AnimalTest();

    // atribuindo cada animal a sua respectiva classe de teste
    testeSuino.animal = suino;
    testeFrango.animal = frango;
    testePeixe.animal = peixe;

    // executando método de engordar
    testeSuino.animal = testeSuino.engordar(1, 10);
    testeFrango.animal = testeFrango.engordar(2, 4);
    testePeixe.animal = testePeixe.engordar(3, 2);

    // executando método de calculo de dias para abate
    testeSuino.animal = testeSuino.diasParaAbate(1, suino.getPesoAtual(), 70.32);
    testeFrango.animal = testeFrango.diasParaAbate(2, frango.getPesoAtual(), 7.04);
    testePeixe.animal = testePeixe.diasParaAbate(3, peixe.getPesoAtual(), 5.15);

    // imprimindo os três tipos de animais 
    testeSuino.ImprimirResposta();
    testeFrango.ImprimirResposta();
    testePeixe.ImprimirResposta();

  }
}