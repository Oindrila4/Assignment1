package assignment;

import java.util.Scanner;

public class Colorcode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color code");
		String colorcode=sc.next();
		switch(colorcode) {
		case "R":

			System.out.println("Red");

			break;

		case "B":

			System.out.println("Blue");

			break;

		case "G":

			System.out.println("Green");

			break;

		case "O":

			System.out.println("Orange");

			break;

		
		case "Y":

			System.out.println("Yellow");

			break;

		case "W":

			System.out.println("White");

			break;


	}


	}

}
