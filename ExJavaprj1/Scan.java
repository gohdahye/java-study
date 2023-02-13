import java.util.*;

public class Scan {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("정수를 입력해주세요: ");
			String input = sc.nextLine();
			int num = Integer.parseInt(input);
			
			System.out.println("입력내용:"+input);
			System.out.printf("num=%d%n", num);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
