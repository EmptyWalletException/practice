package Test1;

/**
 * 实现四个简单的线程,交替进行加减运算
 * @author Administrator
 *
 */
public class TestThread {
	private int j;
	
	

	public TestThread() {
		super();
	}

	private synchronized void inc() {
		j++;
		System.out.println(Thread.currentThread().getName() + "-inc:" + j);
	}

	private synchronized void dec() {
		j--;
		System.out.println(Thread.currentThread().getName() + "-dec:" + j);
	}

	class Inc implements Runnable {
		@Override
		public void run() {
			inc();
		}
	}

	class Dec implements Runnable {
		@Override
		public void run() {
			dec();
		}
	}

	public static void main(String args[]) {
		TestThread testThread = new TestThread();
		Inc inc = testThread.new Inc();
		Dec dec = testThread.new Dec();

		for (int i = 0; i < 2; i++) {
			Thread t1 = new Thread(inc);
			t1.start();

			Thread t2 = new Thread(dec);
			t2.start();
		}

	}

	public String testSwitch(String str) {
		switch (str) {
		case "10":
			return "1";
		}
		return "0";
	}

}
