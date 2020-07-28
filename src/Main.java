import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Mario mario = new Mario();
        Estado estado;
        Integer i;

        while (!mario.getTamanho().equals(Estado.Tamanho.MORTO)){
            Random gerador = new Random();
            i = gerador.nextInt(4);

            switch(i){
                case 0:
                    estado = mario.pegaCogumelo(mario);
                    mario = estado.pegaCogumelo();
                    System.out.println(mario);
                    break;

                case 1:
                    estado = mario.pegaFlor(mario);
                    mario =estado.pegaFlor();
                    System.out.println(mario);
                    break;

                case 2:
                    estado = mario.pegaPena(mario);
                    mario = estado.pegaPena();
                    System.out.println(mario);
                    break;
                case 3:
                    estado = mario.sofreDano(mario);
                    mario = estado.sofreDano();
                    System.out.println(mario);
                    break;
            }
        Thread.sleep(500);
        }
        System.out.println("GAME OVER");
    }
}
