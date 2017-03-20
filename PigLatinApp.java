import java.util.Scanner;

public class PigLatinApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pig Latin Translator.\n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		String entry = "";
		PigLatinValidator v = new PigLatinValidator();
		
		while (choice.equalsIgnoreCase("y"))
		{
			entry = v.getRequiredString(sc, "Enter a line to be translated to Pig Latin: ");
			System.out.println(parseEntryString(entry));
			choice = v.getChoiceString(sc, "\nTranslate another line? (y/n): ", "y", "n");
		}
	}
	
	public static String parseEntryString(String entry)
	{
		String entryLowerCase = entry.toLowerCase().trim();
		String[] newEntry = entryLowerCase.split(" ");
		String newSentence = "";
		for (int i = 0; i < newEntry.length; i ++)
		{
			if (newEntry[i].charAt(0) == 'a' || newEntry[i].charAt(0) == 'e' || newEntry[i].charAt(0) == 'i'
					|| newEntry[i].charAt(0) == 'o' || newEntry[i].charAt(0) == 'u')
			{
				StringBuilder pigString = new StringBuilder(newEntry[i]);
				pigString.append("way").toString();
				newSentence += pigString + " ";
			}
			else
			{
				if (newEntry[i].charAt(1) == 'a' || newEntry[i].charAt(1) == 'e' || newEntry[i].charAt(1) == 'i'
						|| newEntry[i].charAt(1) == 'o' ||newEntry[i].charAt(1) == 'u')
				{
					StringBuilder pigString = new StringBuilder(newEntry[i]);
					pigString.append(newEntry[i].charAt(0));
					pigString.append("ay");
					pigString.delete(0, 1);
					newSentence += pigString + " ";
				}
				else if (newEntry[i].charAt(2) == 'a' || newEntry[i].charAt(2) == 'e' || newEntry[i].charAt(2) == 'i'
						|| newEntry[i].charAt(2) == 'o' ||newEntry[i].charAt(2) == 'u')
				{
					StringBuilder pigString = new StringBuilder(newEntry[i]);
					pigString.append(newEntry[i].charAt(0));
					pigString.append(newEntry[i].charAt(1));
					pigString.append("ay");
					pigString.delete(0, 2);
					newSentence += pigString + " ";
				}
				else if (newEntry[i].charAt(3) == 'a' || newEntry[i].charAt(3) == 'e' || newEntry[i].charAt(3) == 'i'
						|| newEntry[i].charAt(3) == 'o' ||newEntry[i].charAt(3) == 'u')
				{
					StringBuilder pigString = new StringBuilder(newEntry[i]);
					pigString.append(newEntry[i].charAt(0));
					pigString.append(newEntry[i].charAt(1));
					pigString.append(newEntry[i].charAt(2));
					pigString.append("ay");
					pigString.delete(0, 3);
					newSentence += pigString + " ";
				}
				else if (newEntry[i].charAt(4) == 'a' || newEntry[i].charAt(4) == 'e' || newEntry[i].charAt(4) == 'i'
						|| newEntry[i].charAt(4) == 'o' ||newEntry[i].charAt(4) == 'u')
				{
					StringBuilder pigString = new StringBuilder(newEntry[i]);
					pigString.append(newEntry[i].charAt(0));
					pigString.append(newEntry[i].charAt(1));
					pigString.append(newEntry[i].charAt(2));
					pigString.append(newEntry[i].charAt(3));
					pigString.append("ay");
					pigString.delete(0, 4);
					newSentence += pigString + " ";
				}
			}
		}
		return newSentence;	
	}
}
