package one.digitalinnovation.gof2;

import one.digitalinnovation.gof2.facade.Facade;
import one.digitalinnovation.gof2.singleton.SingletonEager;
import one.digitalinnovation.gof2.singleton.SingletonLazy;
import one.digitalinnovation.gof2.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof2.strategy.Comportamento;
import one.digitalinnovation.gof2.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof2.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof2.strategy.ComportamentoNormal;
import one.digitalinnovation.gof2.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Testes relacionados ao Design Pattern Singleton:
		
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
		facade.migrarCliente("Mauricio", "18405000");

	}

}
