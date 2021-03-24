import java.util.*;
class MainD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=50,c=20,d=10,e=5,f=1;
		int a1,b1,c1,d1,e1,f1,x;
		Scanner reader=new Scanner(System.in);
		x=reader.nextInt();
		a1=x/a;
		b1=((x-a1*a))/b;
		c1=((x-(a1*a+b1*b)))/c;
		d1=((x-(a1*a+b1*b+c1*c)))/d;
		e1=(x-((a1*a+b1*b+c1*c+d1*d)))/e;
		f1=(x-(a1*a+b1*b+c1*c+d1*d+e1*e))/f;
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
        System.out.println(f1);
	}

}
