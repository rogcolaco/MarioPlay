public class Fogo implements  Estado{

    private Mario mario;
    private Tamanho tamanho;

    public Fogo(Mario m){
        mario = m;
    }

    @Override
    public Mario pegaCogumelo() {
        mario.addPontos();
        return mario;
    }

    @Override
    public Mario pegaFlor() {
        mario.addPontos();
        return mario;
    }

    @Override
    public Mario pegaPena() {
        tamanho = tamanho.CAPA;
        mario.setTamanho(tamanho);
        return mario;
    }

    @Override
    public Mario sofreDano() {
        tamanho = tamanho.GRANDE;
        mario.setTamanho(tamanho);
        return mario;
    }
}
