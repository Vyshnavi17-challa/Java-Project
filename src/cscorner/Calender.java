package cscorner;

import java.util.Scanner;

public class Calender {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Day=sc.nextLine().toLowerCase();
		switch(Day) {
		case "monday":
			System.out.println("Lets learn Python");
			break;
		case "tuesday":
			System.out.println("Lets learn Java");
			break;
		case "wednesday":
			System.out.println("Lets learn Anguler JS");
			break;
		case "thursday":
			System.out.println("Lets learn swift");
			break;
		case "friday":
			System.out.println("Lets learn Ruby");
			break;
		case "saturday":
			System.out.println("Lets learn Oracle");
			break;
		case "sunday":
			System.out.println("Lets learn CSS");
			break;
		default:
			break;
			
		}
		sc.close();
	}

}
