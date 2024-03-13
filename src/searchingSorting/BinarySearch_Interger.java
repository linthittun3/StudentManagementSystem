package searchingSorting;

import java.util.Scanner;

public class BinarySearch_Interger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arry = {10, 12, 20, 33, 35, 50, 55, 65, 80, 90};
		System.out.print("Enter search data: ");
		int data = sc.nextInt();
		search(arry, data);
		
	}
	public static void search(int[] arry, int data) {
		int first = 0;
		int last = arry.length-1;
		int mid;
		while(first<=last) {
			mid=(first+last)/2;
			if(data<arry[mid]) {
				last = mid - 1;
			}else if(data>arry[mid]) {
				first = mid + 1;
			}else {
				System.out.println(data+ " can be fount at "+ mid);
				break;
			}
		}
		if(first > last) {
			System.out.println(data+ " cannot be fount in a given array");
		}
	}

}
