
public class ReturnTest {

	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		int result = r.add(3, 5);
		System.out.println(result);
		int [] result2 = {0};
		r.add(3, 5, result2);
		System.out.println(result2[0]); //result2는 배열로 참조형 매개변수여서 더한 값이 출력
		

	}int add(int a, int b){
		return a+b;
	}
	void add(int a, int b, int[] result) {
		result[0] = a+b;
	}

}
