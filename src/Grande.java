public class Grande implements  Estado{

    private Mario mario;
    private Tamanho tamanho;

    public Grande(Mario m){
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
        tamanho = tamanho.CAPA;
        mario.setTamanho(tamanho);
        return mario;
    }

    @Override
    public Mario sofreDano() {
        tamanho = tamanho.PEQUENO;
        mario.setTamanho(tamanho);
        return mario;
    }
}
