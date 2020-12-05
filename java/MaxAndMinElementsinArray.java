package sdet_javaProg;

public class MaxAndMinElementsinArray {

	public static void main(String[] args) {
		int a[]= {0,14,2,31,4,15,6,17,8,39,10};
		int max = a[0];
		for(int i=1; i<a.length; i++)
		{
			if (a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("The max value is: " +max);
		int min = a[0];
		for(int i=1; i<a.length; i++)
		{
			if (a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("The min value is: " +min);
		}
}
