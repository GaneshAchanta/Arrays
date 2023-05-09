package basic;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		System.out.println("Retrieve elements by using Index Position");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("Retrieve elements by using Basic for loop");
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Retrieve elements by using forEach loop");
		for(int x:arr) {
			System.out.println(x);
		}

	}

}
