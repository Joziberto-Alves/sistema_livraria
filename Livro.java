import java.time.LocalDate;

public class Livro {
    int id;
    String titulo;
    Autor autor;
    boolean disponivel;
    LocalDate dataCadastro;
    LocalDate dataAtualizacao;

    public Livro(int id, String titulo, Autor autor, boolean disponivel, LocalDate dataCadastro, LocalDate dataAtualizacao){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }
}
