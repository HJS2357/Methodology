public class Hello {
   public static int sum(int n, int m) {
	   return n+m;
   }
   
   // starting from main() method
   public static void main(String[] args) {
	   int i =20;
	   int s;
	   char a;
	   
	   s = sum(i,10);           // call sum() method
	   a = '?';
	   System.out.println(a);        // print out character'?'
	   System.out.println("Hello");  // print out string "Hello"
	   System.out.println(s);        // print out int value s
   }
}