package celular;

import chamadas.AparelhoTelefonico;
import musicas.AparelhoMusical;
import navegador.Internet;

public class Iphone implements AparelhoTelefonico, AparelhoMusical, Internet{

    //Métodos da interface AparelhoTelefonico
    @Override
    public void atender() {
        System.out.println("Atentendo pelo Iphone");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz pelo Iphone");
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("ligando para o número: %s pelo Iphone\n", numero);
    }

    //Métodos da interface AparelhoMusical
    @Override
    public void pausar() {
        System.out.println("Pausando música pelo Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Selecionando música: %s pelo Iphone\n", musica);  
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música pelo Iphone");
    }

    //Métodos da interface Internet
    @Override
    public void adcionarAba() {
        System.out.println("Adcionando aba no navegador pelo Iphone"); 
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página do navegador pelo Iphone");
    }

    @Override
    public void exbirPagina(String url) {
        System.out.printf("Exibindo página: %s pelo Iphone\n", url); 
    }
    
}