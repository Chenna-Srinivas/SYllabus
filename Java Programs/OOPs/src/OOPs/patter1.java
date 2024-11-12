package OOPs;

import java.util.Iterator;

public class patter1 {
public static void main(String[] args) {
	int n=4,space=3,a=1,star=1;
	int row=4,col=7;
	for (int i = 1; i <=n ; i++) {
		a=1;
		for (int j = 0; j < col; j++) {
			System.out.println(" ");
		}
		for (int k = 0; k <= star; k++) {
			System.out.print(a);
			a++;
		}
		if (i<3) {
			space--;
			star=star+2;
			
		}
		else {
			space++;
			star=star-2;
			
		}
	}
	System.out.println("");
}
}
