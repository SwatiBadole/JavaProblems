package MyNewProject;

	import java.util.Scanner;

	public class MyInfo {

		
	  public static void main(String[] args) 
	  {
	    Scanner input = new Scanner (System.in);
	    System.out.println("Input your first name: ");
	    String fname = input.next();
	    
	    System.out.println("Input your middle name: ");
	    String mname = input.next();
	    
	    System.out.println("Input your last name: ");
	    String lname = input.next();
	    
	    Fullname(fname,mname,lname);
	    
	   
	  }
	  public static void Fullname(String fname,String mname, String lname) 
		{
			System.out.println("My Full name is:"+fname+" "+mname+" "+lname);
		}
  }
	


