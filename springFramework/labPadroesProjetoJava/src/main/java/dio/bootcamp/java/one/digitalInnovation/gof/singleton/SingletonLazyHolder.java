package dio.bootcamp.java.one.digitalInnovation.gof.singleton;

/**
 * Singleton "prguiçoso"
 *
 * @author FelipeRodrii
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
}
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
