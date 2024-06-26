package musicas;

public class Ipod implements AparelhoMusical{

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Musica selecionada: %s", musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }
    
}
