public class Capa implements  Estado{

    private Mario mario;
    private Tamanho tamanho;

    public Capa(Mario m){
        mario = m;
    }

    @Override
    public Mario pegaCogumelo() {
        mario.addPontos();
        return mario;
    }

    @Override
    public Mario pegaFlor() {
        tamanho = tamanho.FOGO;
        mario.setTamanho(tamanho);
        return mario;
    }

    @Override
    public Mario pegaPena() {
        mario.addPontos();
        return mario;
    }

    @Override
    public Mario sofreDano() {
        tamanho = tamanho.GRANDE;
        mario.setTamanho(tamanho);
        return mario;
    }
}
