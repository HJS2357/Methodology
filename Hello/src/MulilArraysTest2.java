
public class MulilArraysTest2 {

	public static void main(String[] args) {
     int twoD[][] = new int[4][];
     for(int i=0;i<4;i++)
      twoD[i] = new int[i+1];
     
     System.out.println("2차원 배열에서 행의 길이는 : "+twoD.length);
     System.out.println("첫 번째 행의 요소 수는 : "+twoD[0].length);
     System.out.println("두 번째 행의 요소 수는 : "+twoD[1].length);
     System.out.println("세 번째 행의 요소 수는 : "+twoD[2].length);
     System.out.println("네 번째 행의 요소 수는 : "+twoD[3].length);
     int a,b,c=0;
     for(a=0;a<twoD.length;a++)
    	 for(b=0;b<twoD[a].length;b++) {
    	 twoD[a][b]=c;
    	 c++;
     }
     for(a=0;a<twoD.length;a++) {
    	 for(int val : twoD[a])
    		 System.out.print(val+"");
    	 System.out.println();
     }
    	 
	}

}
