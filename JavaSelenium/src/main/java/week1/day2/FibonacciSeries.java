package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=8;
		int a=0,b=1;
		System.out.println("The Fibonacci Series ");
		for(int i=1;i<=n;i++)
		{
			System.out.println(a+" ");
		int sum=a+b;
		a=b;
		b=sum;
		}
	}
}