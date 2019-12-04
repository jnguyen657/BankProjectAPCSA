package Employees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeesData 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		String file = "EData.txt";
		
		Scanner scfile = new Scanner(new File(file));
		
		getInfo(scfile, "815462");
	}
	
	
	
	private static String getInfo(Scanner sc, String key)
	{
		while (sc.hasNext())
		{
			String id = sc.next();
			
			if (key.equals(id))
			{
				while (!sc.next().equals("end"))
				{
					System.out.println(sc.next());
				}
				String success = "Success";
				return success;
			}
			else
			{
				sc.nextLine();
			}
			
		}
		//System.out.println(id);
		
		
		String e = "ERROR";
		return e;
		
	}

}
