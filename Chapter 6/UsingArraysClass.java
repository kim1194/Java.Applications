import java.util.Arrays;

public class UsingArraysClass{
	public static void main(String[] args){
		int [] numbers = {6,19,2,29,1,30,8,3,12,4};
		//Arrays.sort(numbers)...sort method
		Arrays.sort(numbers,4,9);
		for(int element: numbers){
			System.out.printf("%d%n", element);
		}
		
		//binarySearch method
		int index = Arrays.binarySearch(numbers, 30); 
		System.out.printf("The index number of 30 is %d%n", index);
		System.out.println("==============================");
		
		//equals method
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		boolean isEqual = Arrays.equals(arr1, arr2);
		System.out.printf("%b%n", isEqual);

		//fill method
		int[] myArrays = new int[5];
		Arrays.fill(myArrays, 20);
		for(int component: myArrays){
			System.out.printf("%d%n", component);
		}

		//copyOf method
		int[] original = {1, 2, 3};
		int[] copy = Arrays.copyOf(original, 5); 
		System.out.println("==============================");
		for(int value: copy){
			System.out.printf("%d%n", value);
		}
		
		//toString method
		String copyArray = Arrays.toString(copy);
		System.out.println("==============================");
		System.out.printf("%s%n", copyArray);
	}
}