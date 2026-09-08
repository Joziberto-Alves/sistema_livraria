import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = Biblioteca.createBiblioteca();
        Scanner scanner = new Scanner(System.in);
        menu(scanner, biblioteca);
        menuEmprestimo(scanner);
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
                switch (response.toUpperCase()) {
                    case "SIM":
                        listarLivros(biblioteca);
                        continuar = !continuar;
                        break;
                    case "NAO", "NÃO":
                        continuar = !continuar;
                        System.out.print("Obrigado por acessar a biblioteca Alves!");
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

    public static void menuEmprestimo(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Você deseja fazer o emprestimo de algum livro?");
            String response = scanner.next();
            switch (response.toUpperCase()) {
                case "SIM":

                    break;
                case "NAO", "NÃO":

                    break;
                default:
                    System.out.println();
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
            System.err.printf("Livro: %s - Autor: %s - id: %s%n", livro.getTitulo(), livro.getAutor().getNome(),livro.getId());
        }

    }
}
