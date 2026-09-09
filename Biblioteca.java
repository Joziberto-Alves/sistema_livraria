import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
        private List<Livro> livros = new ArrayList<>();
        private List<Autor> autores = new ArrayList<>();
        private List<Emprestimo> emprestimos = new ArrayList<>();

        public Biblioteca(List<Livro> livros, List<Autor> autores, List<Emprestimo> emprestimos) {
                this.livros = livros;
                this.autores = autores;
                this.emprestimos = emprestimos;
        }

        public List<Livro> getLivros() {
                return livros;
        }

        public void addLivros(Livro livro){
                this.livros.add(livro);
        }

        public void setLivros(List<Livro> livros) {
                this.livros = livros;
        }

        public List<Autor> getAutores() {
                return autores;
        }

        public void setAutores(List<Autor> autores) {
                this.autores = autores;
        }

        public List<Emprestimo> getEmprestimos() {
                return emprestimos;
        }

        public void setEmprestimos(List<Emprestimo> emprestimos) {
                this.emprestimos = emprestimos;
        }

        public Livro geLivrobyId(String id)throws NullPointerException{
                for (Livro livro : getLivros()) {
                        if (livro.getId().equals(id)){
                                return livro;
                        }
                }
                return null;
        }

        public static Biblioteca createBiblioteca() {
                Autor autor1 = new Autor(1, "Machado de Assis", LocalDate.of(1839, 6, 21));
                Autor autor2 = new Autor(2, "Clarice Lispector", LocalDate.of(1920, 12, 10));
                Autor autor3 = new Autor(3, "Fernando Pessoa", LocalDate.of(1888, 6, 13));
                Autor autor4 = new Autor(4, "Jorge Amado", LocalDate.of(1912, 8, 10));
                Autor autor5 = new Autor(5, "Virginia Woolf", LocalDate.of(1882, 1, 25));

                // Variáveis de data para usar nas instâncias (simulando a data de hoje)
                LocalDate cadastrodata = LocalDate.now();
                LocalDate dataatualização = LocalDate.now();

                // Livros de Machado de Assis (autor1)
                Livro livro1 = new Livro("L01", "Memórias Póstumas de Brás Cubas", autor1, false, cadastrodata,
                                dataatualização);
                Livro livro2 = new Livro("L02", "Dom Casmurro", autor1, true, cadastrodata, dataatualização);
                Livro livro3 = new Livro("L03", "Quincas Borba", autor1, true, cadastrodata, dataatualização);

                // Livros de Clarice Lispector (autor2)
                Livro livro4 = new Livro("L04", "A Hora da Estrela", autor2, true, cadastrodata, dataatualização);
                Livro livro5 = new Livro("L05", "Perto do Coração Selvagem", autor2, true, cadastrodata, dataatualização);
                Livro livro6 = new Livro("L06", "Laços de Família", autor2, true, cadastrodata, dataatualização);

                // Livros de Fernando Pessoa (autor3)
                Livro livro7 = new Livro("L07", "Livro do Desassossego", autor3, true, cadastrodata, dataatualização);
                Livro livro8 = new Livro("L08", "Mensagem", autor3, true, cadastrodata, dataatualização);

                // Livros de Jorge Amado (autor4)
                Livro livro9 = new Livro("L09", "Capitães da Areia", autor4, true, cadastrodata, dataatualização);
                Livro livro10 = new Livro("L10", "Gabriela, Cravo e Canela", autor4, true, cadastrodata, dataatualização);
                Livro livro11 = new Livro("L11", "Dona Flor e Seus Dois Maridos", autor4, true, cadastrodata,
                                dataatualização);

                // Livros de Virginia Woolf (autor5)
                Livro livro12 = new Livro("L12", "Mrs. Dalloway", autor5, true, cadastrodata, dataatualização);
                Livro livro13 = new Livro("L13", "Ao Farol", autor5, true, cadastrodata, dataatualização);

                List<Autor> autores = new ArrayList<>();

                autores.add(autor1);
                autores.add(autor2);
                autores.add(autor3);
                autores.add(autor4);
                autores.add(autor5);

                List<Livro> livros = new ArrayList<>();

                livros.add(livro1);
                livros.add(livro2);
                livros.add(livro3);
                livros.add(livro4);
                livros.add(livro5);
                livros.add(livro6);
                livros.add(livro7);
                livros.add(livro8);
                livros.add(livro9);
                livros.add(livro10);
                livros.add(livro11);
                livros.add(livro12);
                livros.add(livro13);

                // Empréstimos realizados em datas específicas do ano de 2026
                Emprestimo emprestimo1 = new Emprestimo(1, livro13, "Armando Algo", LocalDate.of(2026, 3, 10),
                                LocalDate.of(2026, 3, 10));
                Emprestimo emprestimo2 = new Emprestimo(2, livro1, "Armando Algo", LocalDate.of(2026, 4, 15),
                                LocalDate.of(2026, 4, 16));
                Emprestimo emprestimo3 = new Emprestimo(3, livro4, "Armando Algo", LocalDate.of(2026, 5, 20),
                                LocalDate.of(2026, 5, 20));

                // Empréstimos para outros leitores
                Emprestimo emprestimo4 = new Emprestimo(4, livro2, "Mariana Souza", LocalDate.of(2026, 6, 01),
                                LocalDate.of(2026, 6, 02));
                Emprestimo emprestimo5 = new Emprestimo(5, livro9, "Carlos Eduardo", LocalDate.of(2026, 7, 14),
                                LocalDate.of(2026, 7, 14));
                Emprestimo emprestimo6 = new Emprestimo(6, livro10, "Beatriz Costa", LocalDate.of(2026, 8, 25),
                                LocalDate.of(2026, 8, 26));

                List<Emprestimo> emprestimos = new ArrayList<>();
                emprestimos.add(emprestimo1);
                emprestimos.add(emprestimo2);
                emprestimos.add(emprestimo3);
                emprestimos.add(emprestimo4);
                emprestimos.add(emprestimo5);
                emprestimos.add(emprestimo6);

                Biblioteca bibliotecaAlves = new Biblioteca(livros, autores, emprestimos);
                return bibliotecaAlves;
        }

}
