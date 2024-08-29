package interfaces;

import models.Musica;

public interface ReprodutorMusical {
    public void tocar();
    public void pausar();
    public void selecionarMusica(Musica musica);
}
