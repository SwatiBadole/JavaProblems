package MyNewProject;

import java.util.Scanner;

public class IntegerNum {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);

		System.out.print("Enter a number");
		int number=read.nextInt();
		
		System.out.print("");
		
		
		//print two int number
		System.out.println("Enter two numbers");
	    int first = 10;
	    int second = 20;
	    
	    System.out.println(first + " " + second);

	    // add two numbers
	    int sum = first + second;
	    System.out.println("The sum is: " + sum);
	    
	    
	    //multiply two floating number
	    float num1 = 1.5f;
        float num2 = 2.0f;

        float product = first * second;


        System.out.println("The product is: " + product);
        
        
       
	}

}
