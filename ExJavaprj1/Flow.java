import java.util.Arrays;

public class Flow {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		int[] arr = {10,20,30,40,50};
		for(int tmp:arr) {
			System.out.println(tmp);
		}
		// for문에 Loop1이라는 이름을 붙였다.
				Loop1 : for(int i=2;i <=9;i++) {	
						for(int j=1;j <=9;j++) {
							if(j==5)
								break Loop1;
//								break;
//								continue Loop1;
//								continue;
							System.out.println(i+"*"+ j +"="+ i*j);
						} // end of for i
						System.out.println();
				} // end of Loop1
		
		

	}

}
