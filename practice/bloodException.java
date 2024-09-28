package practice;

public class bloodException extends Exception {
	/*throw key word used to create object of the exception
	 * where throws key word used throw exception to the catch  */
	public bloodException() {
		super("has some exception");
	}
	
	void print() {
		String s=getMessage();
		System.out.println(s);
	}
	
	

}
