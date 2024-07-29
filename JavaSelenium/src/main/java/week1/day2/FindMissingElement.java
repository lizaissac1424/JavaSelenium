package week1.day2;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] arr= {1,4,3,2,8,6,7};
		int i;
		int max = 0;
		int sum = 0;
		for(i=0;i<arr.length;i++) {
			
			sum = sum + arr[i];
			if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		
		int missingNumber = (max*(max+1)/2)-sum;
		System.out.println("Missing number : " + missingNumber);

	}

}
