import java.util.Arrays;

// 프로그래머스 분수의 덧셈
public class getbusu {
	public static int getGCD(int a, int b){

    	if (a == 0)
    		return b;
 
        return getGCD(b % a, a);
    }
	public static int getLCM(int a, int b, int gcd){

        return Math.abs(a * b) / gcd;
    }
	public static void main(String[] args) {
		
		int numer1 = 9;
		int denom1 = 10;
		
		int numer2 = 1;
		int denom2 = 3;
		int[] answer = new int[2];
		

        int gcd = getGCD(denom1, denom2);
        int lcm = getLCM(denom1, denom2, gcd);
        
        answer[1] = lcm;
        
        int denom1_tmp = 0;
        int denom2_tmp = 0;
        
        if (denom1 == lcm){
            
            if(denom2 == lcm){
                answer[0] = numer1 + numer2;
            }
            else{
                denom2_tmp = lcm / denom2;
                answer[0] = numer1 + (numer2*denom2_tmp);
            }
        }else{
            
            denom1_tmp = lcm / denom1;
            
            if(denom2 == lcm){
                answer[0] = (numer1*denom1_tmp) + numer2;
            }
            else{
                denom2_tmp = lcm / denom2;
                answer[0] = (numer1*denom1_tmp) + (numer2*denom2_tmp);
            }
        }
        
        
        
        System.out.println(Arrays.toString(answer));
    }
	
    

	

}
