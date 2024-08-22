package loja;
import aparelho.iPhone;

public class Cliente {
    public static void main(String[] args) {

        iPhone iphone = new iPhone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Rock");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
