package exercicioAnimal;

public class Cachorro extends Animal  {

    @Override
    public void comer() {
        System.out.println("cachorro está comendo");
    }
    public void emitirSom() {
        System.out.println("emitindo som");
        //o peixe boi não emite som
    }
    public void pular() {
        System.out.println("Pulando");
        //o peixe boi não pula
    }

}
