package core.tsys;

public class DataTypes {

	public static void main(String[] args) {

		boolean bf = false; // 1 bit
		byte b = 12; // 8 bit
		short sh = 12122; // 
		char ch = 'a';
		 
		int i = 123456;
		long l = 2312324l;
		
		float fl = 123.345f;
		double d = 243234324.235452545d;
		
		//wrapper classes
		
		Long lo = 12234l;
		Long l1 = l;
		Integer i1 = 123;

		String str = "Hello world" + "firstname, " + "lastname";
		
		str.intern();
		
		StringBuffer buf = new StringBuffer();
		
		StringBuilder build = new StringBuilder();
		build.append("Hello").append("World");
		
		StringBuilder build1 = new StringBuilder();
		build1.append("Hello").append("World");
		
		System.out.println(build.equals(build1));
	}

}
