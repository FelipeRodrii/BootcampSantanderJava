import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Getters, setters, outros métodos, etc.

    @Override
    public int compareTo(Livro outroLivro) {
        return this.titulo.compareTo(outroLivro.titulo);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
