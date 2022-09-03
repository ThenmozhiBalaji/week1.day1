package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnum=0, snum=1,sum = fnum+snum;
		System.out.print(fnum);
		System.out.print(",");
		System.out.print(snum);
		System.out.print(",");
		System.out.print(sum);
		System.out.print(",");
		for (int i = 1 ; i<=11; i+=1) {
			fnum = snum;
			snum = sum;
			sum = fnum + snum;
			System.out.print(sum);
			System.out.print(",");
		}
	}

}
