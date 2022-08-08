package one.digitalinnovation.gof2.singleton;

// Singleton "apressado" 

public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}

		public static SingletonEager getInstancia() {
			
			if (instancia == null) {
			}
			return instancia;

		}
}
