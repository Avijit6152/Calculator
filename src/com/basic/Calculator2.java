package com.basic;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("First Number: ");
		int n1=s.nextInt();
		
		System.out.println("Operators : (1.+, 2.-, 3.*, 4./)");
		System.out.print("Select Operators (1-4): ");
		int sel=s.nextInt();
		
		System.out.print("Second Number: ");
		int n2=s.nextInt();
		
		switch (sel) {
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
        default:
            System.out.println("Invalid choice!!! Please enter a number between 1 and 4.");
    }
		
	}
	
	
	
	public static int add(int n1,int n2) {
		int r=n1+n2;
		System.out.println("Result : "+r);
		return r;
	}
	
	public static int sub(int n1,int n2) {
		int r=n1-n2;
		System.out.println("Result : "+r);
		return r;
	}
	
	public static int mul(int n1,int n2) {
		int r=n1*n2;
		System.out.println("Result : "+r);
		return r;
	}
	
	public static int div(int n1,int n2) {
		int r=n1/n2;
		System.out.println("Result : "+r);
		return r;
	}
}
