import java.util.Scanner;

public class PigLatinValidator {
	
	public String getRequiredString(Scanner sc, String prompt) {
		String i = "";
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			i = sc.nextLine();
			if (i.length() < 1)
				System.out.println("Error! This entry is required. Try again.");
			else
				isValid = true;
		}
		return i;
	}

	public String getChoiceString(Scanner sc, String prompt, String s1, String s2) {
		String i = "";
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			i = sc.nextLine();
			if (i.equalsIgnoreCase(s1) || (i.equalsIgnoreCase(s2))) {
				System.out.println();
				isValid = true;
			} else if (i.length() < 1)
				System.out.println("Error! This entry is required. Try again.");
			else
				System.out.println("Error! Entry must be " + s1 + " or " + s2 + ". Try again.");
		}
		return i;
	}
}
