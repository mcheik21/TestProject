package Array;

public class Maximum {
	public int max(int arr[]) {
		if(arr.length==0) {
			return -1;
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}

}
