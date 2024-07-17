package dio.bootcamp.java;

import dio.bootcamp.java.one.digitalInnovation.gof.facade.Facade;
import dio.bootcamp.java.one.digitalInnovation.gof.singleton.*;
import dio.bootcamp.java.one.digitalInnovation.gof.strategy.*;


public class Main {

    public static void main(String[] args){
        // Testes relacionados ao Design Pattern Singleton
        //Singleton
        SingletonLazy lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarClient("Venilton", "14801788");



    }
}