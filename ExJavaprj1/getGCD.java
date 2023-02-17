import java.util.Arrays;
import java.util.*;

// 최대공약수와 최소공배수 구하기

public class getGCD {
	public static int getGCD(int a, int b){

    	if (a == 0)
    		return b;
 
        return getGCD(b % a, a);
    }
	public static int getLCM(int a, int b, int gcd){

        return Math.abs((a * b) / gcd);
    }

	public static void main(String[] args) {
		
		System.out.print("정수를 입력해주세요: ");
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int answer = 0;
	
        int gcd = getGCD(num1, num2);
        int lcm = getLCM(num1, num2, gcd);
        
        System.out.printf("최대공약수 : %d%n",gcd);
        System.out.printf("최소공배수 : %d",lcm);
    }
	
    

	

}
