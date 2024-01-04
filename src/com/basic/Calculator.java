package com.basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(10!=0) {
		 long startTime = System.currentTimeMillis();
		 System.out.println("----------------------------------------------------------------------------------------------");
		 System.out.println("                                      CALCULATOR                                        ");
		 System.out.println("----------------------------------------------------------------------------------------------");
         
		 System.out.print("Enter  First Number: ");
		 double num1=s.nextDouble(); 
		 System.out.print("Enter  Second Number: ");
		 double num2=s.nextDouble();
		 System.out.print("Enter  Third Number: ");
		 double num3=s.nextDouble();
		 System.out.print("Enter  Fourth Number: ");
		 double num4=s.nextDouble();
		 
		 System.out.print("Select Operation: ");
		 System.out.println("( 1. Addition ,"+ " 2. Substraction ," + " 3. Multiplication ," + " 4. Division )");

		 
		 System.out.print("Enter Choice (1-4): ");
		 int choice=s.nextInt();
		 
		 switch (choice) {
         case 1:
             add(num1, num2,num3,num4);
             break;
         case 2:
             sub(num1, num2,num3,num4);
             break;
         case 3:
             mul(num1, num2,num3,num4);
             break;
         case 4:
             div(num1, num2,num3,num4);
             break;
         default:
             System.out.println("Invalid choice. Please enter a number between 1 and 4.");
     }
		 

        //s.close();
    
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Execution time: " + executionTime + " milliseconds");
        
		}
		 
	}
	
	
	 private static void add(double num1, double num2, double num3, double num4) {
	        double result = num1 + num2 + num3 + num4;
	        System.out.println("=================================================");
	        System.out.println("Result : "+num1 + " + " + num2 + " + " +num3+ " + " + num4+" = " + result);
	        System.out.println("=================================================");
	    }

	    private static void sub(double num1, double num2, double num3, double num4) {
	        double result = num1 - num2 - num3 - num4;
	        System.out.println("=================================================");
	        System.out.println("Result : "+num1 + " - " + num2 + " - " +num3+ " - " +num4+ " = " + result);
	        System.out.println("=================================================");
	    }

	    private static void mul(double num1, double num2, double num3, double num4) {
	        double result = num1 * num2 * num3 * num4;
	        System.out.println("=================================================");
	        System.out.println("Result : "+num1 + " * " + num2 + " * " +num3+ " * " +num4+ " = " + result);
	        System.out.println("=================================================");
	    }

	    private static void div(double num1, double num2, double num3, double num4) {
	        if (num2 != 0 && num3 !=0 && num4 !=0) {
	            double result = num1 / num2 / num3 / num4;
	            System.out.println("=================================================");
	            System.out.println("Result : "+num1 + " / " + num2 + " / " +num3+ " / " +num4+ " = " + result);
	            System.out.println("=================================================");
	        } else {
	        	System.out.println("=================================================");
	            System.out.println("Error: Cannot divide by zero.");
	            System.out.println("=================================================");
	        }
	    }

	   
}
