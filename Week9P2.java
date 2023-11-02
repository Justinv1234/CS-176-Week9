import java.util.Scanner;

public class Week9P2 {

	public static int findDuplicate(int[] a) {
	    for (int i = 0; i < a.length; i++) {

	        for (int j = 0; j < a.length; j++) {
	            if (i != j && a[i] == a[j]) {
	            	return a[i];
	            }
	        }
	    }
	    return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int[] array = new int[in.nextInt()];
		
		for (int i = 0;i < array.length;i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			array[i] = in.nextInt();
		}
		
		System.out.print(findDuplicate(array) + " duplicates first");
		
		in.close();
	}

}
