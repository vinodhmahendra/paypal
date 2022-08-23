import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Sample5 {

	public static void main(String[] args) {
		ShoppingCart cart = null;

		try (InputStream is = new FileInputStream("missingfile.txt"); ObjectInputStream in = new ObjectInputStream(is);

		) {

			cart = (ShoppingCart) in.readObject();

		} catch ( ClassNotFoundException | IOException e) {
			System.out.println("Exception deserializing " +cart);
			System.out.println(e);
			System.exit(-1);
		}

	}

}

class ShoppingCart {

}