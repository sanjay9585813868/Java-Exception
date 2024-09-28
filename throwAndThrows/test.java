package throwAndThrows;

//----------------------------------------------------------------------
public class test {
	// throws key is used to declare that the method might throw one or more
	// exceptionit is used along with throw keyword (throws is used along with the method
	// declaration )
	
	static void validate(int age) throws invalidException {
		if (age < 18) {
			throw new invalidException("you are too younger");
		} else if (age >= 30) {
			throw new invalidException(" you are too older");
		} else {
			System.out.println("welcome to vote");
		}
	}

	public static void main(String args[]) {
		try {
			validate(44);
		} catch (invalidException ex) {
			System.err.println(ex);
		}
		System.out.println("rest of the code...");
	}
}
