package program;

import java.io.*;

import javax.xml.soap.Text;

//import java.util.Scanner;
//import threads.*;
//import data.*;
//import box.*;
//import client.*;
//import recieve_response_test.*;
//import enums.*;
import files.*;

public class Program {
	
	public static void main(String[] args) throws IOException {
		print("begin");
		
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
//		if (args.length != 1) {
//			System.out.println("Using: ShowFile text.txt");
//			return;
//		}
		
		try {
			
			fin = new FileInputStream(new File("E:\\eclipse-workspace\\Java_Basics\\src\\files\\text.txt"));
			
			do {
				byte[] b = new byte[256];
				
				i = fin.read(b, 0, b.length);
				if (i != -1)
					 for (int k = 0; k < b.length; k++) {
						 if (b[k] == 0) {
							 break;
						 }
						 System.out.print((char)b[k]); 
					 }
			} while (i != -1);
		}
		catch (IOException e) {
			print("Error reading from file");
		}
		finally {
			try {
				if (fin != null) {
					fin.close();	
				}
			}
			catch (IOException e) {
				print("Error closing file");
			}
		}
		
		
		print("end");
	}
	
	public static void print() {
		System.out.println();
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
