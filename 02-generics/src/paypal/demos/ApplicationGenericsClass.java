package paypal.demos;

public class ApplicationGenericsClass {

	public static void main(String[] args) {
		SampleClass<Integer> intObj = new SampleClass<>(10);
		System.out.println("Generic Class Returns: " + intObj.getData());
		
		SampleClass<String> stringObj = new SampleClass<>("SpringPeople!");
		System.out.println("Generic Class Returns: " +stringObj.getData());
	}

}

//generic class
class SampleClass <T> {
	
	//variable of T type
	private T data;
	
	public SampleClass(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
}