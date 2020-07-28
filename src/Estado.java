public interface Estado {

    enum Tamanho {PEQUENO,GRANDE,CAPA,FOGO,MORTO};

    Mario pegaCogumelo();
    Mario pegaFlor();
    Mario pegaPena();
    Mario sofreDano();
}
