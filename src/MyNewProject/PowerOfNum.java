package MyNewProject;
 import java.util.Scanner;
public class PowerOfNum {
	public static void main(String[] args) {
		
		int base,exponent;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter base");
		base=sc.nextInt();
		
		System.out.println("enter exponent");
		exponent=sc.nextInt();
		
		double power=Math.pow(base, exponent);
		System.out.println(base+"the power"+exponent+"is:"+power);
		
	}

}
