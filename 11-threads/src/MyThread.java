
public class MyThread extends Thread{
	
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

	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
	}
}
