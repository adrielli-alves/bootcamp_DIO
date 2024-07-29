package design_patters.java_puro;

import design_patters.java_puro.facade.Facade;
import design_patters.java_puro.singleton.SingletonEager;
import design_patters.java_puro.singleton.SingletonLazy;
import design_patters.java_puro.singleton.SingletonLazyHolder;
import design_patters.java_puro.strategy.Comportamento;
import design_patters.java_puro.strategy.ComportamentoAgressivo;
import design_patters.java_puro.strategy.ComportamentoDefensivo;
import design_patters.java_puro.strategy.ComportamentoNormal;
import design_patters.java_puro.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
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
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
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
		facade.migrarCliente("Venilton", "14801788");
	}

}
