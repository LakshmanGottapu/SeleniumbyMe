package ExceptionHandling;

import java.util.*;

public class Error {
public static void main(String[] args) {
	
		System.out.println("start");
	Scanner scr = new Scanner(System.in);
	int input = scr.nextInt();
	try{if(input<=18) throw new MyException();}

	
  catch(MyException e) {
		System.out.println("you are a minor and u dont have access to this site ");
	}
	catch(InputMismatchException e) {
		System.out.println("enter only numbers");
	}
	System.out.println("end");

}
static class MyException extends Exception{
	MyException(){
	}
}
}