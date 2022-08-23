import java.io.FileNotFoundException;

public class Sample7 {

	public void readFile(String file) throws FileNotFoundException {
		boolean found = findFile(file);

		if (!found) {
			throw new FileNotFoundException("Missing file");
		}
	}

	public void verifyPassword(String password) throws InvalidPasswordException {
		boolean result = verify(password);

		if (!result) {
			throw new InvalidPasswordException("invalid password");
		}
	}
	
	private boolean verify(String password) {
		return false;
	}

	private boolean findFile(String file) {
		// code to return true if file can be located
		return false;
	}

}
