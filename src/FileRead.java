package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead 
{
	//scanner to search in file
	Scanner s;
	//method 1
	public void open() 
	{
		try 
		{
			s = new Scanner(new File("src/details.txt"));
		}
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	//method 2
	public boolean readfile(String username, String password) 
	{
		boolean status = false;
		String tempUN = username;
		String tempPAS = password;
		
		while(s.hasNext()) 
		{
			String a = s.next();
			String b = s.next();
			
			if(tempUN.equals(a) && tempPAS.equals(b)) 
			{
				status = true;
			}
		}
		return status;
	}
	//method 3
	public void close() 
	{
		s.close();
	}
}
