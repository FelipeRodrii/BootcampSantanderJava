package dio.bootcamp.java.one.digitalInnovation.gof.singleton;

/**
 * Singleton "prguiçoso"
 *
 * @author FelipeRodrii
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
    /* Lembrando, O super serve para chamarmos o construtor da classe mãe, ou seja, o contrutor da classe ao qual essa
    * classe herda parâmetros e métodos. Neste caso nenhuma, porém, toda classe que não é filha direta de outra(Definido
    * pelo de) é filha da classe java Object, por isso o super neste caso. Porém, a ausência dele não faria diferença, pois
    * a instância para Object é chamada automaticamente pelo java.
    * */
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
