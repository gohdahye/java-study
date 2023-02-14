import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		int [] iArr1 = new int[10];
		int [] iArr2 = new int[10];
		int [] iArr3 = {100,90,80,70,60};
		char [] chArr = {'A','B','C','D'};
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
		
		//ArrayCopy
		char [] abc = {'A','B','C','D'};
		char [] num = {'0','1','2','3'};
		System.out.println(abc);
		System.out.println(num);
		char [] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		
		//Max_Min
		int [] score = {79,88,91,33,100,55,95};
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i< score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최대값 :"+max);
		System.out.println("최소값 :"+min);
		
		//Random
		int [] ball = new int[45];
		for(int i=0; i<ball.length; i++) 
			ball[i] = i+1;
		
		int temp = 0;
		int j = 0;
		
		for(int i=0; i<6; i++) {
			j = (int)(Math.random() * 45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		
		
		//char_array
		//charAt : 문자열버전, 배열에서 인덱스로 가져오는 것 과 같은 기능
		String src = "ABCDE";
		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"):"+ch);
		}
		//String을 char[]로 변환
		char[] chArrs = src.toCharArray();
		
		//char 배열(char[])을 출력
		System.out.println(chArrs);
		System.out.println(Arrays.toString(chArrs));
	}
}
