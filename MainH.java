import java.util.*;
class MainH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		int n ;
		n=reader.nextInt();
		double s = Math.toRadians(n);
		double sin=Math.sin(s);
		double cos=Math.cos(s);
		System.out.printf("%.3f ",sin);
		System.out.printf("%.3f",cos); 
	}

}
