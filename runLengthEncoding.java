/**
 * Implementation of RunLength Encoding
 * 
 * @author Nandakumar.k
 *
 */

public class Main {

	public static void main(String... args) {
		String string = "xxxyyyz";
		System.out.println("The Resultant String is " + runLengthEncoding(string));
	}

	public static String runLengthEncoding(String inputString) {
		if (inputString == null || inputString.isEmpty()) {
			return null;
		}
		StringBuilder finalString = new StringBuilder();
		int count = 1;
		char previousCharacter = inputString.charAt(0);
		for (int index = 1; index < inputString.length(); index++) {
			char currebtCharacter = inputString.charAt(index);
			if (currebtCharacter == previousCharacter) {
				count++;
			} else {
				finalString = finalString.append(previousCharacter).append(String.valueOf(count));
				previousCharacter = currebtCharacter;
				count = 1;
			}
		}
		finalString = finalString.append(previousCharacter).append(String.valueOf(count));
		return finalString.toString();
	}

}
