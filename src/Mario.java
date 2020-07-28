public class Mario {

    private Integer pontos = 0;
    private Estado.Tamanho tamanho = Estado.Tamanho.PEQUENO;


    public Estado pegaCogumelo(Mario mario){
        if (this.getTamanho().equals(Estado.Tamanho.PEQUENO)){
            Pequeno pequeno = new Pequeno(this);
            return pequeno;
        } else if (this.getTamanho().equals(Estado.Tamanho.GRANDE)){
            Grande grande = new Grande (this);
            return grande;
        }else if (this.getTamanho().equals(Estado.Tamanho.FOGO)) {
            Fogo fogo = new Fogo(this);
            return fogo;
        } else {
            Capa capa = new Capa(this);
            return capa;
        }
    }


    public Estado pegaFlor(Mario mario){
        if (this.getTamanho().equals(Estado.Tamanho.PEQUENO)){
            Pequeno pequeno = new Pequeno(this);
            return pequeno;
        } else if (this.getTamanho().equals(Estado.Tamanho.GRANDE)){
            Grande grande = new Grande (this);
            return grande;
        }else if (this.getTamanho().equals(Estado.Tamanho.FOGO)) {
            Fogo fogo = new Fogo(this);
            return fogo;
        } else {
            Capa capa = new Capa(this);
            return capa;
        }
    }
    public Estado pegaPena(Mario mario){
        if (this.getTamanho().equals(Estado.Tamanho.PEQUENO)){
            Pequeno pequeno = new Pequeno(this);
            return pequeno;
        } else if (this.getTamanho().equals(Estado.Tamanho.GRANDE)){
            Grande grande = new Grande (this);
            return grande;
        }else if (this.getTamanho().equals(Estado.Tamanho.FOGO)) {
            Fogo fogo = new Fogo(this);
            return fogo;
        } else {
            Capa capa = new Capa(this);
            return capa;
        }
    }
    public Estado sofreDano(Mario mario){
        if (this.getTamanho().equals(Estado.Tamanho.PEQUENO)){
            Pequeno pequeno = new Pequeno(this);
            return pequeno;
        } else if (this.getTamanho().equals(Estado.Tamanho.GRANDE)){
            Grande grande = new Grande (this);
            return grande;
        }else if (this.getTamanho().equals(Estado.Tamanho.FOGO)) {
            Fogo fogo = new Fogo(this);
            return fogo;
        } else {
            Capa capa = new Capa(this);
            return capa;
        }
    }

    public Mario(Integer pontos, Estado.Tamanho tamanho) {
        this.pontos = pontos;
        this.tamanho = tamanho;
    }

    public Mario() {
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Estado.Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Estado.Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public void addPontos(){
        this.pontos=pontos+1000;
    }

    @Override
    public String toString() {
        String rs = "tamanho  :  " + this.getTamanho() + "   |||||  Pontos  :  " + this.getPontos();
        return rs;
    }
}
