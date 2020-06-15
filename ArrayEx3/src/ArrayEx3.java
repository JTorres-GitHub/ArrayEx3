
public class ArrayEx3 {
	public static int sumArray(int[] arr){
		int i;
		int sum = 0;
		
		for(i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] arg){
		int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(sumArray(array1));
	}
}
