import java.util.Scanner;

public class Week9P1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int[] array = new int[in.nextInt()];
		
		for (int i = 0;i < array.length;i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			array[i] = in.nextInt();
		}
		
		int num = 0;
		int[] backwardArray = new int[array.length];
		for (int i = array.length-1;i >= 0;i--) {
			backwardArray[i] = array[num];
			num++;
		}
		
		System.out.print("The array backwards is: ");
		for (int i = 0;i < array.length;i++) {
			System.out.print(backwardArray[i] + ", ");
		}
		
		in.close();
	}

}
