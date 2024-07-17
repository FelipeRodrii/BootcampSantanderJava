package Comparator;
import java.util.Comparator;

class Jogador {
    private String nome;
    private int idade;

    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

class CompararPorIdade implements Comparator<Jogador> {
    @Override
    public int compare(Jogador jogador1, Jogador jogador2) {
        return jogador1.getIdade() - jogador2.getIdade();
    }
}
