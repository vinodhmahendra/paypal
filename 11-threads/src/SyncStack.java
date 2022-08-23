import java.util.ArrayList;
import java.util.List;

//shared resource
public class SyncStack {

	private List<Character> buffer = new ArrayList<>(400);
	
	public synchronized char pop() {
		char c;
		while ( buffer.size() == 0) {
			try {
				this.wait(); // thread ---> wait pool
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		c = buffer.remove(buffer.size() -1 );
		return c;
	}
	
	public synchronized void push (char c) {
		this.notify(); // thread --> wait pool ---> lock pool
		buffer.add(c);
		
	}
}
