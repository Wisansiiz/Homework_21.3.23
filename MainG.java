import java.util.*;
class MainG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner (System.in);
		int h,r;
		h=reader.nextInt();r=reader.nextInt();
		double v=Math.PI *r*r*h/1000;
		double tong=20/v;
		if(20%v!=0)tong++;
		int i=new Double(tong).intValue();
		System.out.println(i);
	}

}
