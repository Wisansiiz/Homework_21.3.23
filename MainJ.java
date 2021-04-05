import java.util.*;
class MainJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner reader = new Scanner (System.in);
		String s;
		s = reader.next();
		String S = s.replaceAll(","," ");
		String a = S.substring(0,1);
		String b = S.substring(2,3);
		int A=Integer.valueOf(a);
		int B=Integer.valueOf(b);
		System.out.println(A+B);

	}

}
