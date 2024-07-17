package dio.bootcamp.java.one.digitalInnovation.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author FelipeRodrii
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
