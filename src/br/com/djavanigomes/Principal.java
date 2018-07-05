package br.com.djavanigomes;

import java.util.Scanner;

public class Principal {
	
	private static Logic logic = new Logic();
	private static  String numberA;
	private static String numberB;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type the number A: ");
		
		numberA = (scan.nextLine());
		
		System.out.println("Type the number B: ");
		
		numberB = (scan.nextLine());	
		
		if (numberA.isEmpty() || numberB.isEmpty()) {	    	
	    	System.out.println("You must enter two numbers for analysis.");
	    }else {
	    	logic.sequenceAnalysis(numberA, numberB);
	    }
		
		scan.close();
	}
}
