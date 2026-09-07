import java.time.LocalDate;

public class Emprestimo {
    int id;
    Livro livro;
    String nomeCliente;
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;

    public Emprestimo(int id, Livro livro, String nomeCliente, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.id = id;
        this.livro = livro;
        this.nomeCliente = nomeCliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

}
