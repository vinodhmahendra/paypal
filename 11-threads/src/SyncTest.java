
public class SyncTest {

	public static void main(String[] args) {
		SyncStack stack = new SyncStack();
		
		Producer p = new Producer(stack);
		Consumer c = new Consumer(stack);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();

	}

}
