import java.util.*;
class MainF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner cin=new Scanner(System.in);
		a=cin.nextInt();
		int bai=a/100;
		int shi=a/10%10;
		int ge=a%10;
		System.out.println(ge+""+shi+""+bai);
		
	}

}
