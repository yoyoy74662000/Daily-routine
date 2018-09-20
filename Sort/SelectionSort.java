import java.lang.reflect.Array;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,80,70,90,40,50,70};
		int[] result = sort(array);
		for(int i : result){
			System.out.print(i);
			System.out.print(',');
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int[] sort(int[] arr) {
		if(arr == null || arr.length == 0) {
			return null;
		}
		for(int i = 0; i < arr.length; i++) {
			int min = i;
			for(int j = i +1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(arr, i ,min);
		}
		return arr;
	}
}
