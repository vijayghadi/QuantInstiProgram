

public class MultiplesOf3or5 {

	public static void main(String[] args) {
		int sum = 0;
		int n = 1000;
		for (int i=1; i<n; i++){
			if((i % 3 == 0) || (i % 5 == 0)){
				sum += i;
			}
		}
		
		System.out.println("Sum of Multiples of 3 OR 5 between 1000 are :"+sum);
	}

}
