package week1.day2;

public class FibbinocciSeries {

	public static void main(String[] args) {
		int firstNum=0,secondNum=1,sum=0;
		System.out.println(firstNum+secondNum);
		for(int i=2;i<=11;i++) {
			sum=firstNum+secondNum;
			System.out.println(sum);
			firstNum=secondNum;
			secondNum=sum;	
			
		}

	}
}
