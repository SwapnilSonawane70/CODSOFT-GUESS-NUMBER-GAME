package Student_Grade_Calculate;

import java.util.Scanner;

public class Student_Grade_Calculate {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student Grade Calculater");
		System.out.println("Enter the no of Subject");
		int nS=sc.nextInt();
		int total=0;
		
		for(int i=0;i<nS;i++) {
			System.out.println("Enter the marks obtaind in "+i+": ");
			int marks=sc.nextInt();
			total+=marks;
		}
		double averp=(double)total/nS;
		
		char Grade;
		if(averp>=90) {
			Grade='O';
		}
		else if(averp>=80) {
			Grade='A';
		}
		else if(averp>=70) {
			Grade='B';
		}
		else if(averp>=60) {
			Grade='C';
		}
		else if(averp>=50) {
			Grade='D';
		}
		else if(averp>=40) {
			Grade='E';
		}
		else {
			Grade='F';
		}
		System.out.println("Total Marks Scored is "+total);
		System.out.println("Average Percentage Gained is "+averp+"%");
		System.out.println("Grade :"+Grade);
	}

}
