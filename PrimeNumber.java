package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 50;
		int count = 0;
		for (int i = 2; i<num; i+=1)
		{
		if (num % i == 0)
		{
			count = count +1;
		}
		}
		if (count != 0)
			System.out.println("It is not a prime number");
		
		else
			System.out.println("It is a Prime number");
	}

}
