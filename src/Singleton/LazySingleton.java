package Singleton;

/**
 * ¿¡∫∫ Ω
 * @author Administrator
 *
 */
public class LazySingleton {
	private static LazySingleton ls ;
	
	private LazySingleton() {
		
	}
	
	public static synchronized LazySingleton getInstance() {
		if(null == ls) {
			ls = new LazySingleton();
		}
		return ls;
	}
}
