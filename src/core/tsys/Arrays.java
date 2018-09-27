package core.tsys;

public class Arrays {

	public static void main(String[] args) {

		int[] arr = {1,2,3};
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = new int[3];
		arr2[0] = 1;
		
		
		for(int index=0; index < arr.length; index++) {
			System.out.println(arr[index]); 
		}
		
		for(int value:arr) {
			System.out.println(value);
		}
	}
}
