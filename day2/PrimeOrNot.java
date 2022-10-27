package week1.day2;

public class PrimeOrNot {

	public static void main(String[] args) {
		int n=11;
		int a=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				a++;
				break;
			}
			}
			if(a==0)
			{
				System.out.println("prime number");
			}else {
				System.out.println("not a prime number");
			}
		
		

	}

}
