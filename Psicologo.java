public class Psicologo {

    private String nome;

    /**
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome set nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    private Humor humor;

    /**
     * @return humor
     */
    public Humor getHumor() {
        return this.humor;
    }

    /**
     * @param humor set humor
     */
    public void setSentimento(Humor humor) {
        this.humor = humor;
    }

    public Psicologo (String nome, Humor humor){
            this.setNome(nome);
            this.setSentimento(humor);
        }

    public void DizerOlaPara(Psicologo psicologo) {
        System.out.println(this.getNome() + ": Olá " + psicologo.getNome() + "!");
    }

    public void PerguntarComoEsta(Psicologo pessoa) {
        System.out.println(this.getNome() + ": Como você está?");
    }

    public void DizerSentimento() {
        System.out.println(this.getNome() + ": Eu estou " + this.getHumor().getDescricao());
    }

    public void ContinuarConversa(){
        System.out.println(this.getNome() + " Vamos melhorar isso !");

    }
}