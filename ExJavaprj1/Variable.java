
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
		
	}

}
