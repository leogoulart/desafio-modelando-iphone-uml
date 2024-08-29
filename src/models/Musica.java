package models;

import java.util.concurrent.ThreadLocalRandom;

public class Musica {
    private String url;
    private String nome;
    private final double duracao;

    public Musica(String nome) {
        this.nome = nome;
        this.url = "musicas/" + nome.trim().replace(" ", "").toLowerCase();
        this.duracao = ThreadLocalRandom.current().nextDouble(2, 5);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getDuracao() {
        return duracao;
    }
}
