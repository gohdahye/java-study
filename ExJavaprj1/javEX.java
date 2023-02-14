import java.util.Arrays;

public class javEX {

	public static void main(String[] args) {
		int n = 10;
		int[] answer = new int[n+1];
		answer[0] = 1;
        for(int i=2, j=1; i<=n; i++){
            if(i%2 != 0){
                answer[j] = i;
                j++;
            }
           
        }
        System.out.println(Arrays.toString(answer));
		
	}

}
