package OOPs;

public class sadbasicsexp_1 {

	public static void main(String[] args) {
		int p=12;
		int count =0;
		for (int i = 1; i <=p; i++) {
			if (p%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println(p+" is a prime number");
		}
		else {
			System.out.println(p+" is not a prime number");
		}
	}

}
