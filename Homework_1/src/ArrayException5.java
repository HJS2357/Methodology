
public class ArrayException5 {

	public static void main(String[] args) {
         
		
		int[] intArray = new int[5];
		intArray[0]=0;
		
		for(int i=0; i<5; i++) {
			try {
				intArray[i+1]=i+1+intArray[i];
				System.out.println("intArray["+i+"]="+intArray[i]);
				
				if(i==2) {
					System.out.println(intArray[i]/0);
				}
				if(i==1) {
					ArithmeticException e = new ArithmeticException("Intentionally Raise");
					throw e;
				}
		} catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Exception : ArrayIndexOutOfBounds");
		} catch (ArithmeticException e2) {
			System.out.println("0");
			System.out.println(e2.getMessage());
			e2.printStackTrace();
		}
	  }
	}
}
