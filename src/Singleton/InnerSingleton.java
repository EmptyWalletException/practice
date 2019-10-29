package Singleton;

/**
 * 静态内部类式
 * @author Administrator
 *
 */
public class InnerSingleton {
	private InnerSingleton() {
		
	}
	
	private static class SingletonHoler{
		private static InnerSingleton instance = new InnerSingleton();
	}
	
	public InnerSingleton getInstance() {
		return SingletonHoler.instance;
	}
}
