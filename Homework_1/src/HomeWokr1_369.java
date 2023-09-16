import java.util.Scanner;

public class HomeWokr1_369 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print(" Enter integer value 1~99 : ");
		
		int integer = scanner.nextInt();
	    int a = integer%10;               // integer 1의 자리수
	    int b = integer/10 ;		      // integer 10의 자리수
	    int c = 0;
	    int d = 0;
	    
	    if(a%3==0) c=1;                  // integer 1의 자리수가 3배수면 1, 아니면 0
	    if(b%3==0) d=1;                  // integer의 10의 자리수가 3배수면 1, 아니면 0
	    
	    int e = c+d;                     // 각 자리수 3배수의 개수합 = e
	    
	    int f=1;                         // 예외 처리를 위한 변수 설정
	    
		if(integer > 100) {
			System.out.print("unexpected input, system off.");   // 예외 입력 처리
			f=0;
		}
		
		if(f==1)                                                // 예외 입력이 아닌 경우 코드 실행
		{
		  if(e==1) {
			System.out.print("박수짝");	
		 }
	 	  else if(e==2) {
			System.out.print("박수짝짝");
		 }
		  else {
			System.out.print("No 3, 6, or 9 ");
		 }
		}
		scanner.close();
	}
}
