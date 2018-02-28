package program;

import java.util.Scanner;
import data.*;
import box.*;
import client.*;

public class Program {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		DynStack stack = new DynStack(5);
		stack.clear();
		
		print("-----------------------------------------------");
		print("end");
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
