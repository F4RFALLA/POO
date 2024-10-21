package exercicioAnimal;

public class Zoologico {
    public static void main(String[] args) {
        Cachorro sitzu = new Cachorro();
        sitzu.setCor('a');
        System.out.println(sitzu.getCor());
        sitzu.comer();
        sitzu.pular();
        
        Gato gato = new Gato();
        gato.setCor('B');
        System.out.println(gato.getCor());
        gato.setComidaPreferida("petisco");
        System.out.println(gato.getComidaPreferida());
        gato.comer();
        gato.pular();

        PeixeBoi boi = new PeixeBoi();
        boi.nadar();
        boi.comer();
        boi.setCor('c');
        System.out.println(boi.getCor());
        boi.setComidaPreferida("peixe");
        System.out.println(boi.getComidaPreferida());
        boi.setTamanho(50);
        System.out.println(boi.getTamanho());



    }
}
