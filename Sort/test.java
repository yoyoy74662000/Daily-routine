
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,80,70,90,40,50,70};
		int[] result = quickSort(array);
		for(int i : result){
			System.out.print(i);
			System.out.print(',');
		}
	}
	
	
	public static int[] quickSort(int[] arr) {
		if(arr == null || arr.length == 0) {
			return null;
		}
		
		quickSort(arr, 0, arr.length-1);
		return arr;
	}
	
	private static void quickSort(int[] arr, int left, int right) {
		if( left >= right) {
			return;
		}
		
		int mid = quickSelect(arr, left, right);
		quickSort(arr, left, mid-1);
		quickSort(arr, mid+1, right);
	}
	
	private static int quickSelect(int[] arr, int left, int right) {
		int pivot = right;
		
		int leftbound = left;
		int rightbound = right -1;
		
		while(leftbound <= rightbound) {
			if(arr[leftbound] <= arr[pivot]) {
				leftbound++;
			}
			else if(arr[rightbound] >= arr[pivot]) {
				rightbound--;
			}
			else {
				swap(arr, leftbound, rightbound);
			}
		}
		swap(arr, leftbound, pivot);
		return leftbound;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
