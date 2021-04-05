import java.util.*;
class MainI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int xa,ya,xb,yb;
		Scanner reader = new Scanner (System.in);
		xa=reader.nextInt();ya=reader.nextInt();
		xb=reader.nextInt();yb=reader.nextInt();
		double x=Math.abs(xa-xb);
		double y=Math.abs(ya-yb);
		double c=Math.sqrt(x*x+y*y);
		System.out.printf("%.3f",c);
	}

}
