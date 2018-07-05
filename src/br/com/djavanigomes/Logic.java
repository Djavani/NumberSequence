package br.com.djavanigomes;

public class Logic {

	public void sequenceAnalysis(String numberA, String numberB) {

		if (!(numberA.isEmpty() || numberB.isEmpty())) {
			System.out.println("The generated sequence is: " + getSequence(numberA, numberB));
		}
	}

	public int getSequence(String numberA, String numberB) {

		String numberC = "";
		int total = Math.max(numberA.length(), numberB.length());

		for (int i = 0; i <= total; i++) {
			if (i < numberA.length()) {
				numberC += numberA.charAt(i);
			}
			if (i < numberB.length()) {
				numberC += numberB.charAt(i);
			}
		}
		return (numberC.length() > 6) ? -1 : Integer.valueOf(numberC.toString());
	}

}
