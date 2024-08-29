import exceptions.MusicaNaoEncontradaException;
import models.Iphone;
import models.Musica;

public class Iphone38ProMax {

    static Musica[] playlist = {
            new Musica("Chop Suey"),
            new Musica("Psychosocial"),
            new Musica("Lost In Hollywood"),
            new Musica("We Love You"),
    };

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Reprodutor musical
        iphone.tocar();
        iphone.pausar();

        String musicaEscolhida = "We Love You";
        try {
            iphone.selecionarMusica(buscarMusica(musicaEscolhida));
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
        iphone.tocar();
        iphone.pausar();

        //Aparelho Telefonico
        iphone.ligar("14557002");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Navegador de Internet
        iphone.exibirPagina("www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

    public static Musica buscarMusica(String caminhoMusica) throws MusicaNaoEncontradaException{

        caminhoMusica = "musicas/" + caminhoMusica.trim().replace(" ", "").toLowerCase();
        for(Musica musica : playlist)
        {

            if(musica.getUrl().equals(caminhoMusica))
                return musica;
        }
        throw new MusicaNaoEncontradaException();
    }
}
