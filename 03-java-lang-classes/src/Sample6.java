import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Sample6 {
	
	//declare rule
	public static int readByteFromFile() throws IOException{
		try (InputStream in = new FileInputStream("a.txt")){
			System.out.println("File Open!");
			return in.read();
		}
	}
	
	public static void main(String[] args) {
		try {
			readByteFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
