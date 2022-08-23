
//JAVA 5 java.util.concurrent.ExecutorService
public class ExampleRunnable  implements Runnable{
	private final String name;
	
	public ExampleRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for ( int i = 0 ; i < 10; i++ ) {
			System.out.println(name + ":" +i);
		}
	}

}
