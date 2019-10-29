package Singleton;

/**
 * ¶öººÊ½
 * @author Administrator
 *
 */
public class HungrySingleton {
	private static HungrySingleton hs = new HungrySingleton();

	private HungrySingleton() {

	}

	public static HungrySingleton getInstance() {
		return hs;
	}
}
