package searchingSorting;

import java.util.Scanner;

public class BinarySearch_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String arry[] = {"aa", "cc", "dd", "ff", "hh", "jj", "mm", "nn", "pp"};
		System.out.print("Enter search data: ");
		String data = sc.next();
		search(arry,data);
	}

	public static void search(String[] arry, String data) {
		// TODO Auto-generated method stub
		int first = 0;
		int last = arry.length-1;
		int mid;
		while(first<=last) {
			mid = (first+last)/2;
			if(data.compareToIgnoreCase(arry[mid])<0) {
				last = mid - 1;
			}else if(data.compareToIgnoreCase(arry[mid])>0) {
				first = mid + 1;
			}else {
				System.out.println(data + " can be found at "+ mid);
				break;
			}
		}
		if(first>last) {
			System.out.println(data + " cannot be found in the given array.0");
		}
	}

}
