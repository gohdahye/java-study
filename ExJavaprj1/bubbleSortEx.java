import java.util.Arrays;

public class bubbleSortEx {

	public static void main(String[] args) {
		int myArr[] = {5,3,2,7,6};
		
		Solution[] sol = new Solution[2];
		sol[0] = new Solution();
		sol[0].solution(myArr);
	}
}
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
            	int k = j+1;
                if(array[j] > array[k]){
                    int tmp = array[j];
                    array[j] = array[k];
                    array[k] = tmp;
                }   
            }
        }
        System.out.println(Arrays.toString(array));
        int mid = array.length / 2;
        answer = array[mid];
        System.out.println(answer);
        return answer;
    }
}