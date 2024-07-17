import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("A Guerra dos Tronos", "George R. R. Martin", 1996));
        livros.add(new Livro("O Hobbit", "J.R.R. Tolkien", 1937));
        livros.add(new Livro("1984", "George Orwell", 1949));

        System.out.println("Lista de Livros (antes da ordenação):");
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        // Ordenando por título usando Comparable
        Collections.sort(livros);

        System.out.println("\nLista de Livros (após a ordenação por título):");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
