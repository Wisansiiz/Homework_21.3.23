import java.util.*;
class MainE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e;
		Scanner reader=new Scanner(System.in);
		a=reader.nextInt();
		b=reader.nextInt();
		c=reader.nextInt();
		d=reader.nextInt();
        e=reader.nextInt();
        
        e+=a/3;b+=a/3;a/=3;
        a+=b/3;c+=b/3;b/=3;
        b+=c/3;d+=c/3;c/=3;
        c+=d/3;e+=d/3;d/=3;
        d+=e/3;a+=e/3;e/=3;
        
        System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	}

}
