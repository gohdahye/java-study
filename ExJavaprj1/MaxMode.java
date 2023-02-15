import java.util.Arrays;
import java.util.Scanner;

public class MaxMode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("테스트 할 개수를 입력해주세요: ");
		int testCnt = sc.nextInt();
		int testLeng = 0;
		int InArr[][] = new int[testCnt][];
		
		for(int i=0; i<testCnt; i++) {
			System.out.print("몇 개를 테스트할 것 인지 입력해주세요: ");
			testLeng = sc.nextInt();
			InArr[i] = new int[testLeng];
			sc.nextLine();
			
			System.out.print("테스트 케이스를 한줄로 입력해주세요: ");
			String input = sc.nextLine();
			String [] StrIn = input.split(" ");
			
			for(int j=0; j<testLeng; j++) {
				InArr[i][j] = Integer.parseInt(StrIn[j]);
			}
			
		}
		SolutionEx sol1 = new SolutionEx();
		

	}
}
	
class SolutionEx {
    public int solution(int[] array) {
        int answer = 0;
        int[] index = new int[array.length + 1];
        int max = Integer.MIN_VALUE;
        
        for (int i=0; i<array.length; i++){
            index[array[i]]++;
        }
        
        System.out.println(Arrays.toString(index));
        
        for(int i=0; i<index.length; i++){
            if(index[i] > max){
                max = index[i];
                answer = i;
            }
        }
        System.out.println(answer);
        return answer;
    }
}