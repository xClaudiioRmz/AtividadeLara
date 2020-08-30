public class Paciente extends Psicologo{
    public Paciente(String nome, Humor humor) {
        super(nome, humor);
    }
    
    @Override
    public void DizerOlaPara(Psicologo psicologo){
        System.out.println(this.getNome()+ " Olá Dr."+ psicologo.getNome()+".");
    }
    
}