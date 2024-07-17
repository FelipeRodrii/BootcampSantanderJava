package Ex7;

public class Jogador {

    protected void jogarDado(){
        Dado dado = new Dado();

        System.out.println("JOGANDO DADO... ");

        int sorteado= dado.jogaDado();
        
        System.out.println("NUMERO SORTEADO ->  "+ sorteado);

    }
    public static void main(String[] args) {
        Jogador jogador = new Jogador();

        jogador.jogarDado();
        
    }
    
}
