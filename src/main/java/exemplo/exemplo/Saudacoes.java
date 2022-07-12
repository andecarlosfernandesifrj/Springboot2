package exemplo.exemplo;
public class Saudacoes {
    private long id;
    private String conteudo;
    public Saudacoes(long id, String conteudo)
    {
        this.id = id;
        this.conteudo=conteudo;
    }
    public long getId()
    {
        return this.id;
    }
    public String getConteudo()
    {
        return this.conteudo;
    }
}
