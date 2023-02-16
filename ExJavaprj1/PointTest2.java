
public class PointTest2 {

	public static void main(String[] args) {
		Point3d p3 = new Point3d();
		System.out.println("p3.x="+p3.x);
		System.out.println("p3.y="+p3.y);
		System.out.println("p3.z="+p3.z);
	}

}
class Point2 {
	int x=100;
	int y=20;
	
	Point2(int x, int y){
		this.x = x;
		this.y= y;
	}
	
}
class Point3d extends Point2{
	int z = 30;
	Point3d(){
		this(100,200,300);
	}
	Point3d(int x, int y, int z){
		//super는 조상의 생성자를 호출함
		//object 클래스를 제외한 모든 클래스의 생성자는 생성자, this(), super()를 호출해야 한다.
		//아니면 컴파일러가 자동으로 super(); 를 실행한다.
		//this() 는 생성자 또는 같은 클래스의 다른 생성자를 호출 할때 사용한다.
		super(x, y);	//Point(x, y)를 호출한다.
		this.z = z;
	}
}