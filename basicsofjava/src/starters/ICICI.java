package starters;

import java.util.Scanner;

public class ICICI implements Loans{
int t=1;
public void education(int p) {
	int r = 5;
	System.out.println("interest is "+(p*t*r/100));
}
public void farmer(int p) {
	int r = 10;
	System.out.println("interest is "+(p*t*r/100));
}
public void employee(int p) {
	int r = 20;
	System.out.println("interest is "+(p*t*r/100));
}
	public static void main(String[] args) {
Loans loan = new ICICI();
System.out.print("enter your principle amount : ");
Scanner scr = new Scanner(System.in);
int p = scr.nextInt();
System.out.println("");
scr.close();
loan.education(p);
loan.employee(p);
loan.farmer(p);
	}

}
