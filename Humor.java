public enum Humor {

    /**
     *
     */
    FELIZ("feliz"),

    /**
     *
     */
    TRISTE("triste");
 
    private String descricao;
 
    Humor(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}