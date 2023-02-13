
public class OperatorEx24 {

	public static void main(String[] args) {
		int x = 10;
		char ch = ' ';
		
		// 논리연산자
		x = 15;
		System.out.printf("x=%2d, 10 < x && < 20 =%b%n", x, 10 < x && x<20);
		x = 6;
		// 연산자 우선순위: () > && > ||
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 =%b%n", x, x%2==0 || x%3 ==0 && x%6!=0);
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b%n", x, (x%2==0 || x%3 ==0) && x%6!=0);
		// 논리 부정 연산자
		boolean b = true;
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		//비트연산자
		x = 0xAB;
		int y = 0xF;
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.println();
		
		//비트 전환연산자
		byte p = 10;
		byte n = -10;
		System.out.printf(" p = %d \t%s%n", p, toBinaryString(p));
		System.out.printf("~p = %d \t%s%n", ~p, toBinaryString(~p));
		//양의 정수 -> 음의 정수 구하기 : ~p+1
		System.out.printf("~p+1=%d \t%s%n", ~p+1, toBinaryString(~p+1));
		System.out.printf("~~p = %d \t%s%n", ~~p, toBinaryString(~~p));
		System.out.println();
		
		System.out.printf("   n  = %d%n", n);
		//음의 정수 -> 양의 정수 구하기 : ~(n-1)
		System.out.printf(" ~(n-1) = %d%n", ~(n-1));
		System.out.println();
		
		//쉬프트 연산자
		int dec = 8;
		//x << n 은 x * 2^n 의 결과
		System.out.printf(" %d >> %d = %4d \t%s%n", dec, 0,  dec >> 0, toBinaryString(dec >> 0));
		System.out.printf(" %d >> %d = %4d \t%s%n", dec, 1,  dec >> 1, toBinaryString(dec >> 1));
		System.out.printf(" %d >> %d = %4d \t%s%n", dec, 2,  dec >> 2, toBinaryString(dec >> 2));
		//x >> n 은 x / 2^n 의 결과
		System.out.printf(" %d << %d = %4d \t%s%n", dec, 1,  dec << 1, toBinaryString(dec << 1));
		System.out.printf(" %d << %d = %4d \t%s%n", dec, 2,  dec << 2, toBinaryString(dec << 2));
		
		 dec = -8;
		 System.out.printf("%d >> %d = %4d \t%s%n", dec, 1,  dec >> 1, toBinaryString(dec >> 1));
		 System.out.printf("%d >> %d = %4d \t%s%n", dec, 2,  dec >> 2, toBinaryString(dec >> 2));
		 
		 //쉬프트 연산과 비트 and연산을 이용한 16진수에서 한자리씩 뽑아내는 예제
		 dec = 1234;
		 int hex = 0xABCD;
		 int mask = 0xF;
		 
		 System.out.printf("hex=%X%n", hex);
		 System.out.printf("%X%n", hex & mask);
		 
		 hex = hex >> 4;
		 System.out.printf("%X%n", hex & mask);
		 hex = hex >> 4;
		 System.out.printf("%X%n", hex & mask);
		 hex = hex >> 4;
		 System.out.printf("%X%n", hex & mask);
		
	}

	 static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		
		return tmp.substring(tmp.length()-32);
	}

}
