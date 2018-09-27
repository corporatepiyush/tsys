package core.tsys.oop;

public class OOPS {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 10);
		
		Rectangle rect1 = new Rectangle(10, 10);
		
		
		if(rect == rect1) {
			System.out.println("ref equal");
		}
		
		if(rect.equals(rect1)) {
			System.out.println("equals equal");
		}
		
		Square square = new Square(10);
		System.out.println(square.area());
		
		if(square.equals(rect)) {
			System.out.println("square = rect");
		}
		
		
		System.out.println(Util.area(10, 20));
		
		System.out.println(Util.sum());
		System.out.println(Util.sum(10));
		System.out.println(Util.sum(10, 20));
		System.out.println(Util.sum(10, 20, 30));
		System.out.println(Util.sum(10, 20, 30, 40));
		
	}
}
