import java.util.Arrays;

public class MaxMode {

	public static void main(String[] args) {
		int myArr[] = {1, 2, 3, 3, 3, 4};
		
		SolutionEx[] sol = new SolutionEx[2];
		sol[0] = new SolutionEx();
		sol[0].solution(myArr);
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