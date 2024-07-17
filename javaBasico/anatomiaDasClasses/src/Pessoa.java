public class Pessoa{
    String nome;
    int idade;
    String cidadania;
    String especie;
    String raca;

    // Construtor dos objetos
    public Pessoa(String nome, int idade, String cidadania, String especie, String raca){
        this.nome= nome;
        this.idade= idade;
        this.cidadania= cidadania;
        this.especie= especie;
        this.raca= raca;
    }

    public void cumprimentar(){
        System.out.println("Oi, meu nome é "+ nome +" eu tenho "+ idade +" anos de idade, sou um "+ especie +" da raça "+ raca +" E sou "+ cidadania);

    }

    public void envelhecer(){
        idade++;
        System.out.println("Oi, sou eu de novo o "+ nome +" e agora tenho "+ idade +" anos de idade");

    }


    
}
