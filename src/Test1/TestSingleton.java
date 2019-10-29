package Test1;

public class TestSingleton {
	private TestSingleton() {
	}

	private static TestSingleton instance = new TestSingleton();

	public static TestSingleton getInstance() {
		return instance;
	}
}

class Singleton {
	private static Singleton instance = null;

	public static synchronized Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}