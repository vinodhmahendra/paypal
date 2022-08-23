package paypal.client;

public class UseRunnable {
	
	public static void main(String[] args) {
		
		Runnable r1 = ()-> {
			try {
				Thread.sleep(3000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("child thread 1");
		};
		
		Runnable r2 =()-> System.out.println("child thread 2");
		
		new Thread(r1).start();
		new Thread(r2).start();
	}

}
