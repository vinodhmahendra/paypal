import java.util.concurrent.Callable;

public class ExampleCallable implements Callable<String>{

	private  final int len ;
	private  final String name ;
	private int sum;
	
	public ExampleCallable(String name, int len) {
		this.name = name;
		this.len = len;
	}

	@Override
	public String call() throws Exception {
		for ( int i = 0 ; i < len ; i++) {
			System.out.println(name + ":" +i);
			sum += i;
		}
		return "sum: " + sum;
	}

}
