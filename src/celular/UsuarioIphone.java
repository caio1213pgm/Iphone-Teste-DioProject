package celular;

public class UsuarioIphone {
    public static void main(String[] args) {
        Iphone celularIphone = new Iphone();

        System.out.println("Musica");
        //musica
        celularIphone.selecionarMusica("Faint - Link Park");
        celularIphone.tocar();
        celularIphone.pausar();

        System.out.println("\nTelefone");
        //chamadas
        celularIphone.atender();
        celularIphone.ligar("81990547729");
        celularIphone.iniciarCorrerioVoz();

        System.out.println("\nInternet");
        //navegar internet
        celularIphone.adcionarAba();
        celularIphone.atualizarPagina();
        celularIphone.exbirPagina("Instagram.com");
    }
}
