package models;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private Musica musicaAtual = new Musica("Over Horizon");

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica " + musicaAtual.getNome());
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica " + musicaAtual.getNome());
    }

    @Override
    public void selecionarMusica(Musica musica) {
        musicaAtual = musica;
        System.out.println("Selecionando Muscia: " + musicaAtual.getNome() + "\nDuração: " + String.format("%.2f", musicaAtual.getDuracao()) + " minutos");
    }
}
