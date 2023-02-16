
public class DrawShape {

	public static void main(String[] args) {
		// Point 객체 배열 
		Point[] p = {
						// Point 객체 생성 (매개변수가 있는 생성자 이용)
						new Point(100, 100),	
						new Point(140, 50),
						new Point(200, 100)
					}; 
		
		//Triangle 객체 생성(Point 객체를 가지는 Triangle 생성)
		Triangle t = new Triangle(p);
		
		//Circle 객체 생성(Point 객체를 가지는 Circle 생성)
		Circle c = new Circle(new Point(150,150), 50);
		
		//Triangle 객체의 draw 메소드 실행
		t.draw();
		//Circle 객체의 draw 메소드 실행
		c.draw();
	}

}

class Shape{
	
	String color = "black";		//인스턴스 변수
	
	//반환값이 없는 인스턴스 메소드
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}
	
}
class Point{
	int x;		//인스턴스 변수
	int y;		//인스턴스 변수
	
	// 매개변수가 있는 생성자
	Point(int x, int y){
		this.x = x;		//인스턴스 변수에 매개변수 할당
		this.y = y;
	}
	
	// 생성자 (현재는 생성자가 있으므로 생략 불가능)
//	클래스 내의 생성자 없을 경우만 컴파일러에 의해 자동 추가됨
	Point(){
		this(0, 0);
	}
	
	// String 타입의 인스턴스 메소드
	String getXY() {
		return "("+x+","+y+")";
	}
}
class Circle extends Shape{
	Point center;
	int r;
	
	Circle(){
		this(new Point(0, 0), 100);
	}
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}
class Triangle extends Shape{
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}