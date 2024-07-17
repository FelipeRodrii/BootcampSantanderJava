package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarJogadoresPorIdade {
    public static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Alice", 25));
        jogadores.add(new Jogador("Bob", 30));
        jogadores.add(new Jogador("Charlie", 22));

        System.out.println("Lista de jogadores antes de ordenar:");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }

        // Usando o Comparator para ordenar por idade
        Collections.sort(jogadores, new CompararPorIdade());

        System.out.println("\nLista de jogadores após ordenar por idade:");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }
}