package tryCatchFinally;

public class number {
	public static void main(String[] args) {
		//unchecked exception
		int num=10;
		int num1=0,res=0;
		

//		res=num/num1;
//		System.out.println(res);
		
		try {
		res=num/num1;
		System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println(num+" can't be divided "+num1);
		}
		finally {
			//used to run important code if exception occur or  not
			System.out.println("unchecked exception");
		}
		
		int[] arr= {10,20,30};
		
		try {
			System.out.println(arr[4]);//-------------> it will throw ArrayIndexOutOfBoundException
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

}
