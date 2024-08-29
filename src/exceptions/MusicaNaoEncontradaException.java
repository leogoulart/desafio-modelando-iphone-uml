package exceptions;

public class MusicaNaoEncontradaException extends Exception{
    public MusicaNaoEncontradaException(){
        super("A models.Musica nao foi encontrada nos arquivos do aparelho");
    }
}
