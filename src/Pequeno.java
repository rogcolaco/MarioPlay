public class Pequeno  implements  Estado{

    private Mario mario;
    private Tamanho tamanho;

    public Pequeno(Mario m){
        mario = m;
    }

    @Override
    public Mario pegaCogumelo() {
        tamanho = tamanho.GRANDE;
        mario.setTamanho(tamanho);
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
        tamanho = tamanho.MORTO;
        mario.setTamanho(tamanho);
        return mario;
    }
}
