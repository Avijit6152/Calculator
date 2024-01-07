package com.basic;

import java.util.Scanner;

public class Calculator4 {
	
	static {
		
		System.out.println("==========================CALCULATOR===========================");
		
	}

	public static void main(String[] args) {
		
		while(10!=0) {
			
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n1=s.nextInt();
		
		 System.out.print("Select Operation: ");
		

		 System.out.println(" 1. Addition");
		 System.out.println(" 2. Substraction");
		 System.out.println(" 3. Multiplication");
		 System.out.println(" 4. Division ");
		 System.out.println(" 5. Modulus ");
		 System.out.println(" 6. Exponential");
		 System.out.println(" 7. Square root ");
		 System.out.println(" 8. Cube root");
		 System.out.println(" 9. Logarithm");
		 System.out.println(" 10. Sine");
		 System.out.println(" 11. Cosine");
		 System.out.println(" 12. Tangent ");
		 System.out.println(" 13. Percentage");
		 
		 
		 System.out.print("Enter Choice (1-12): ");
		 int choice=s.nextInt();
		 System.out.print("Enter Number : ");
		 int n2=s.nextInt();
		 
		 switch (choice) {
         case 1:
             add(n1,n2);
             break;
         case 2:
             sub(n1,n2);
             break;
         case 3:
             mul(n1,n2);
             break;
         case 4:
             div(n1,n2);
             break;
         case 5:
             mod(n1,n2);
             break;
         case 6:
             exp(n1,n2);
             break;
         case 7:
             sqrt(n1,n2);
             break;
         case 8:
             cbrt(n1,n2);
             break;
         case 9:
             log(n1,n2);
             break;
         case 10:
             sin(n1,n2);
             break;
         case 11:
             cos(n1,n2);
             break;
         case 12:
             tan(n1,n2);
             break;
         case 13:
        	 percentage(n1,n2);
             break;
         default:
             System.out.println("Invalid choice. Please enter a number between 1 and 12.");
     }
		 
	}	    

	}
	
	
	
	 private static void add(int n1, int n2) {
		 
	        double result = n1 + n2;
	        System.out.println("=================================================");
	        System.out.println("Result : "+n1 + " + " + n2 +" = " + result);
	        System.out.println("=================================================");
	    }

	    private static void sub(int n1, int n2) {	       
	    	    double result = n1 - n2;
		        System.out.println("=================================================");
		        System.out.println("Result : "+n1 + " - " + n2 +" = " + result);
		        System.out.println("=================================================");
	    }

	    private static void mul(int n1, int n2) {
	    	 double result = n1 * n2;
		        System.out.println("=================================================");
		        System.out.println("Result : "+n1 + " * " + n2 +" = " + result);
		        System.out.println("=================================================");
	    }

	    private static void div(int n1, int n2) {
	        if (n2 != 0 ) {
	            double result = n1 / n2 ;
	            System.out.println("=================================================");
	            System.out.println("Result : "+n1 + " / " + n2 +  " = " + result);
	            System.out.println("=================================================");
	        } else {
	        	System.out.println("=================================================");
	            System.out.println("Error: Cannot divide by zero.");
	            System.out.println("=================================================");
	        }
	    }
	    
	    private static void mod(int n1, int n2) {
	    	 double result = n1 % n2;
		        System.out.println("=================================================");
		        System.out.println("Result : "+n1 + " Modulus " + n2 +" = " + result);
		        System.out.println("=================================================");
	    }
	    
	    private static void exp(int n1, int n2) {
	    	 double result = Math.pow(n1, n2);
		        System.out.println("=================================================");
		        System.out.println("Result : "+n2 + " Power Of " + n1 +" = " + result);
		        System.out.println("=================================================");
	    }

	    private static void sqrt(int n1, int n2) {
	    	 double result = Math.sqrt(n1);
		        System.out.println("=================================================");
		        System.out.println("Result : " +"Square Root of " + n1 +  " = " + result);
		        System.out.println("=================================================");
	    }
	    
	    private static void cbrt(int n1, int n2) {
	    	 double result =  Math.cbrt(n1);
		        System.out.println("=================================================");
		        System.out.println("Result : " +"Cube Root of " + n1 +  " = " + result);
		        System.out.println("=================================================");
	    }
	    
	    private static void log(int n1, int n2) {
	    	 double result = Math.log(n1);
		        System.out.println("=================================================");
		        System.out.println("Result : " +"Logarithm of " + n1 +  " = " + result);
		        System.out.println("=================================================");
	    }
	    
	    
	    private static void sin(int n1, int n2) {
	    	 double result = Math.sin(n1);
		        System.out.println("=================================================");
		        System.out.println("Result : " +"Sine of " + n1 +  " = " + result);
		        System.out.println("=================================================");
	    }
	    
	    
	    private static void cos(int n1, int n2) {
	    	 double result = Math.cos(n1);
		        System.out.println("=================================================");
		        System.out.println("Result : " +"Cos of " + n1 +  " = " + result);
		        System.out.println("=================================================");
	    }
	    
	    
	    private static void tan(int n1, int n2) {
	    	 double result = Math.tan(n1);
		        System.out.println("=================================================");
		        System.out.println("Result : " +"Tan of " + n1 +  " = " + result);
		        System.out.println("=================================================");
	    }
	    
	    private static void percentage(int n1, int n2) {
	    	 double result = (n1*100)/n2;
		        System.out.println("=================================================");
		        System.out.println("Result : "+n1 + " % " + n2 +" = " + result);
		        System.out.println("=================================================");
	    }
}



//Addition: result = number1 + number2;
//Subtraction: result = number1 - number2;
//Multiplication: result = number1 * number2;
//Division: result = number1 / number2;
//Modulus: result = number1 % number2;
//Exponential: result = Math.pow(number1, number2);
//Square root: result = Math.sqrt(number1);
//Cube root: result = Math.cbrt(number1);
//Logarithm: result = Math.log(number1);
//Sine: result = Math.sin(number1);
//Cosine: result = Math.cos(number1);
//Tangent: result = Math.tan(number1);




