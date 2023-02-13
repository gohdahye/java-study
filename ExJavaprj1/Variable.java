
public class Variable {

	public static void main(String[] args) {
		int age = 27;
		double d = 1.23456789;
		String url = "www.codechobo.com";
		
		
		System.out.printf("age:%d%n", age);
		System.out.printf("age:%d%n", 20);
		System.out.printf("age:14%n");
		
		System.out.printf("d=%14.10f%n", d);
		System.out.printf("d=%014.10f%n", d);
		
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
		
		//지시자
		//java api Formatter 클래스에 자세한 내용 참고
		//%b : (불리언)boolean type
		//%d : (10진수)decimal type
		//%o : (8진수)octal type
		//%x, %X : (16진수)hexa-decimal type
		//%f : 부동소수점
		//%e, %E: 지수 표현
		//%c : 문자 출력
		//%s : 문자열 출력
		
		//%20d: 최소 20자리수 출력공간 확보 우측정렬
		//%-20d: 최소 20자리수 출력공간 확보 좌측정렬
		//%.8s: 왼쪽에서 8글자만 출력
	}

}
