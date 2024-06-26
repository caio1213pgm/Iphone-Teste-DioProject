package navegador;

public class Google implements Internet{

    @Override
    public void adcionarAba() {
        System.out.println("Adcionando nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void exbirPagina(String url) {
        System.out.printf("Exibindo página: $s", url);
    }

}
