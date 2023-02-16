
public class VarArgsEx {

	public static void main(String[] args) {
		String [] strArr = {"100", "200", "300"};
		System.out.println(concatenate("", "100","200","300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
		System.out.println("["+concatenate(",", new String[0])+ "]");
		System.out.println("[" + concatenate(",")+"]" );

	}
	static String concatenate(String delim, String... args) { 
		//static method 는 this(인스턴스 변수)를 사용할 수 없다.
		//static method 는 인스턴스 생성하지 않고도 호출 될 수 있으므로 호출된 시점에 인스턴스가 존재하지 않을 수 있어서이다.
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		
		return result;
	}

}
