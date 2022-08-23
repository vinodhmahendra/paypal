package paypal.client;

import paypal.interfaces.SimpleInterface;

public class UseSimpleInterface {

	public static void main(String[] args) {
		// old styled code  ( "Anonymous Class " )
//		SimpleInterface obj = new SimpleInterface() {
//			
//			@Override
//			public void doSomething() {
//				System.out.println("say something!");
//				
//			}
//		};
		
		//new styled code ( Lambda Expression )
		SimpleInterface obj = () -> System.out.println("say something");
		
		obj.doSomething();
	}

}
