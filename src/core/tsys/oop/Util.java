package core.tsys.oop;

public class Util {

	public static int area(int l, int w) {
		return l * w;
	}

	public static int sum(int a, int b) {
		System.out.println("2 args");
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		System.out.println("3 args");
		return a + b + c;
	}

	public static int sum(int... a) {
		System.out.println("var args");
		int sum = 0;
		for (int value : a) {
			sum += value;
		}
		return sum;
	}

}
