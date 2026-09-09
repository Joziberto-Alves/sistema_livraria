import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = Biblioteca.createBiblioteca();
        Scanner scanner = new Scanner(System.in, "UTF-8");
        menu(scanner, biblioteca);

        scanner.close();
    }

    public static String input(Scanner scanner) {
        String response = scanner.next();
        return response;
    }

    public static void menu(Scanner scanner, Biblioteca biblioteca) {
        boolean continuar = true;
        System.out.println("Bem vindo(a) à Biblioteca Alves");
        System.out.println("Você gostaria de ver os livros disponíveis? (Digite sim ou não)");
        while (continuar) {
            try {
                String response = input(scanner);
                if (response.toUpperCase() == "NÃO") {
                    response = "NAO";
                }
                switch (response.toUpperCase()) {
                    case "SIM":
                        listarLivros(biblioteca);
                        menuEmprestimo(scanner, biblioteca);
                        continuar = !continuar;
                        break;
                    case "NAO":
                        continuar = !continuar;
                        System.out.println("Obrigado por acessar a biblioteca Alves!");
                        break;
                    case "NÃO":
                        continuar = !continuar;
                        System.out.println("Obrigado por acessar a biblioteca Alves!");
                        break;
                    default:
                        System.out.println("Opção inválida, tente novemente.");
                        break;
                }
            } catch (Exception e) {
                continuar = !continuar;
                e.printStackTrace();
            }

        }

    }

    public static void menuEmprestimo(Scanner scanner, Biblioteca biblioteca) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Você deseja fazer o emprestimo de algum livro?");
            String response = scanner.next();
            switch (response.toUpperCase()) {
                case "SIM":
                    emprestimo(biblioteca, scanner);
                    continuar = !continuar;
                    break;
                case "NAO", "NÃO":
                    continuar = !continuar;
                    System.out.println("Obrigado por acessar a biblioteca Alves!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novemente.");
                    break;
            }

        }
    }

    public static void listarLivros(Biblioteca biblioteca) {
        List<Livro> livros = biblioteca.getLivros();
        for (Livro livro : livros) {
            if (!livro.isDisponivel()) {
                continue;
            }
            System.out.printf("Livro: %s - Autor: %s - id: %s%n", livro.getTitulo(), livro.getAutor().getNome(),livro.getId());
        }
    }

        public static void emprestimo(Biblioteca biblioteca, Scanner scanner){
            boolean continuar = true;
            while (continuar) {
                try {
                    System.out.println("Insira o id do livro que você gostaria de fazer o emprestimo");
                    String id = scanner.next();
                    Livro livro = biblioteca.geLivrobyId(id);
                    
                    System.out.printf("Para pegar o Livro %s emprestado digite o seu nome:%n",livro.getTitulo());
                    String nome = input(scanner);
                    livro.emprestarLivro();

                    System.out.printf("Emprestimo feito com sucesso %s, devolva dentro de 2 semanas.%n",nome);
                    continuar = !continuar;
                } catch (NullPointerException e) {
                    System.out.println("Parece que não temos esse livro, tente novamente.");
                }
            }
        }

}
