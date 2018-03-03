package program;

//import java.util.Scanner;
//import threads.*;
//import data.*;
//import box.*;
//import client.*;
//import recieve_response_test.*;
//import enums.*;

public class Program {
	
	public static void main(String[] args) {
		print("begin");
		
		TypeAnnoDemo.myMeth(10);
		
		print("end");
	}
	
	public static void print() {
		System.out.println();
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
