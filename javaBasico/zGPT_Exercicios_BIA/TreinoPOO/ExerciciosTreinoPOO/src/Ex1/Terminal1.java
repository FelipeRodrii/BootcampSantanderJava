package Ex1;

public class Terminal1 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();

        double areaCirculo = circulo.CalculaArea(8);
        double areaRetangulo = retangulo.CalculaArea(5, 8.6);

        System.out.println("A área do Circulo é: "+areaCirculo);
        System.out.println("A area do Retamgulo é: "+areaRetangulo);
    }
    
}
