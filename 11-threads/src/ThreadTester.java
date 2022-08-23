
public class ThreadTester {

	public static void main(String[] args) {
		HelloRunner target = new HelloRunner();
		Thread t1 = new Thread(target);
		t1.start();
		
		Thread t2 = new Thread(target);
		t2.start();
	}

}

class HelloRunner implements Runnable {
	private int i;

	@Override
	public void run() {
		i = 0;
		while ( true ) {
			System.out.println("Hello " + i++);
			if ( i == 5) {
				break;
			}
		}
	}
}
