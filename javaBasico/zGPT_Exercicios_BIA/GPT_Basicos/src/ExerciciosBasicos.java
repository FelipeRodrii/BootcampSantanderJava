import java.util.Scanner;
import java.text.DecimalFormat;
public class ExerciciosBasicos {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(("#,##0.00"));
        
        System.out.println("1. Soma de Números:\n");
        int ex1num1 = terminal.nextInt();
        int ex1num2 = terminal.nextInt();
        System.out.println("A soma dos dois numeros é: "+ (ex1num1+ex1num2));

        System.out.println("\n2. Média de Três Números:");
        int ex2num1= terminal.nextInt();
        int ex2num2= terminal.nextInt();
        int ex2num3= terminal.nextInt();
        System.out.println("A média entre os numeros eh: "+ ((ex2num1+ex2num2+ex2num3)/3));

        System.out.println("\n3. Verificador de Números Pares:");
        int ex3num1= terminal.nextInt();
        String resultado = (ex3num1%2 == 0)? "Numero é par" : "Numero é ímpar";
        System.out.println(resultado);

        System.out.println("\n4. Conversor de Temperatura:");
        double temperatutaCelsiun= terminal.nextFloat();
        double temperaturaFahrenheit = 1.8 * temperatutaCelsiun + 32;
        System.out.println("A temperetura de C°"+temperatutaCelsiun+" em fahrenheint é F°"+df.format(temperaturaFahrenheit));

        System.out.println("\n5. Fatorial:");
        int fatorar= terminal.nextInt();
        int fatorial= fatorar;
        for(int i= fatorial-1; i >0; i--){
            fatorial *= i;
        }
        System.out.println("O fatorial de "+fatorar+" é "+ fatorial);
        terminal.close();


    }
}
