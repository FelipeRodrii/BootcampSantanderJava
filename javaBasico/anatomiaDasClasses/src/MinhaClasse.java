public class MinhaClasse { // Nome da Classe seguindo um padrão de nomeação de Classe
    public static void main(String[] args) throws Exception {
        System.out.println("Explorando um pouco sobre a Anatomia do Javinha \n");

        int ano = 2023; 
        final String NOME = "Felipe";
        final String SOBRENOME= "Rodrigues";
        int idade= 24;

        System.out.println("Olá e Hello World, meu nome é "+ NOME + SOBRENOME +" Eu tenho "+ idade +" e o ano atual é "+ ano+".\n\n" );

        Pessoa pessoa1 = new Pessoa(NOME, idade, "Brasileiro", "Humano", "Negro/Pardo");

        System.out.println("------APRESENTAÇÃO PELO OBJETO------");
        pessoa1.cumprimentar();
        System.out.println("Após um ano");
        pessoa1.envelhecer();
        pessoa1.cidadania = "Uruguio"; // Forma de Declarar as variáveis também se não quisermos especificar a varia´vel no construtor
        pessoa1.cumprimentar();

    }
}
