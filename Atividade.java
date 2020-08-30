public class Atividade {

    public static void main(String[] args) {
        Paciente clayton = new Paciente("Clayton", Humor.TRISTE);
        Psicologo martins = new Psicologo("Martins", Humor.FELIZ);
        martins.DizerOlaPara(clayton);
        clayton.DizerOlaPara(martins);
        martins.PerguntarComoEsta(clayton);
        clayton.DizerSentimento();
        martins.ContinuarConversa();
    }
    
}
