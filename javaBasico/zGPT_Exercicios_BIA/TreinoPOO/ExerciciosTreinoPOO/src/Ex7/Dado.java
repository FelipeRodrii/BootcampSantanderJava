package Ex7;
import java.util.Random;

public class Dado {
    Random rand = new Random();

    protected int jogaDado(){
        int dado = rand.nextInt(8);

        return dado;
    }
}
