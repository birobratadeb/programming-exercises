package sdet_javaProg;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0, n2=1,sum=0;
		System.out.println(n1+ " " +n2);		
		for (int i=0; i<8;i++) {
			sum = n1+n2;
			System.out.println(" " +sum);
			n1=n2;
			n2=sum;
		}		
	}
}
