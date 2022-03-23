package MyNewProject;

public class ArithmaticOperation {
	
	static void addition(int num1, int num2)
	{
        System.out.print("Addition of given numbers = ");
        System.out.println(num1 + num2);
    }     

 
  static void subtraction(int num1, int num2)
  {
        System.out.print("Subtraction of given numbers = ");
        System.out.println(num1 - num2);
  }     

 
  static void multiplication(int num1, int num2)
  {
        System.out.print("Multiplication of given numbers = ");
        System.out.println(num1 * num2);
  }     

 
  static void division(int num1, int num2)
  {
        System.out.print("Division of given given numbers = ");
        System.out.println(num1 / num2);
  }     


  public static void main(String args[])
  {
        
        addition(2, 1);
        subtraction(4, 3);
        multiplication(2, 3);
        division(20, 4);
      
  }
  
}
