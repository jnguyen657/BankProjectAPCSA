package ff;

import java.util.Scanner;

public class Alphabetize
{
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		String word = input.nextLine();
		
		System.out.println(alphabetize(word));
		
	}
	
	public static String alphabetize(String word)
	{
		
		String part1 = word.substring(0, word.indexOf(" "));
		String part2 = word.substring(word.indexOf(" ") + 1);
		
		if (part1.compareTo(part2) < 0) {
			
			return part1 + " " + part2;
			
		} else {
			
			return part2 + " " + part1;
			
		}
		
	}
	
}
