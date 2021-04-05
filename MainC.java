import java.util.*;
class MainC {
	public static void main(String[] args) {
		double a,b,c;
		Scanner reader=new Scanner(System.in);
		a=reader.nextDouble();
		b=reader.nextDouble();
		c=reader.nextDouble();
		double jiaoa,jiaob,jiaoc,a1;
		a1=(b*b+c*c-a*a)/(2*b*c);
		jiaoa=Math.acos(a1);
		jiaob=Math.acos((a*a+c*c-b*b)/(2*a*c));
		jiaoc=Math.acos((a*a+b*b-c*c)/(2*b*a));
		double max=0;
		if (jiaoa>max)max=jiaoa;
		if (jiaob>max)max=jiaob;
		if (jiaoc>max)max=jiaoc;
		
		System.out.printf("%.4f",Math.toDegrees(max));
		
	}

}
