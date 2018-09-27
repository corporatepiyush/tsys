package core.tsys.oop;

public class Rectangle {

	private final int length;
	private final int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (length != other.length)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

}
