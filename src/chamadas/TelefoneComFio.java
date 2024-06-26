package chamadas;

public class TelefoneComFio implements AparelhoTelefonico{

    public void atender() {
        System.out.println("Atentendo");    
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correiro de voz");
    }

    public void ligar(String numero) {
        System.out.printf("Ligando para %s", numero);
    }
        
    
}
