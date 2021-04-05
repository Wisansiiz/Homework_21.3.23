import java.util.*;
class MainB {
	public static void main(String[] args) {

		double L1,L2,L3;
		Scanner reader=new Scanner(System.in);
		while(reader.hasNext()){
			L1=reader.nextDouble();
			L2=reader.nextDouble();
			L3=reader.nextDouble();
	    double jiao1,R,s;
			jiao1=Math.acos((L2*L2+L3*L3-L1*L1)/(2*L2*L3));
			R=(L1/2)/Math.sin(jiao1);
			s=Math.PI *R*R;
			
		    System.out.printf("%.2f\n",s);
			}
	}

}
