package Ex2;

public class Livro {

    protected String imprimirInformacoes(String titulo, String autor, int numeroPaginas){
        String fraseApresentacao = "Titulo: "+titulo+"Autor: "+autor+"Páginas: "+numeroPaginas;
        
        return fraseApresentacao;
    }
}
