package basic;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		int [] a = new int [size];
		for (int i=0; i < a.length;i++) {
			System.out.println("Enter Element for "+i+" index position");
			a[i] = sc.nextInt();
		}
		for(int s: a)
			System.out.println(s);

	}

}
