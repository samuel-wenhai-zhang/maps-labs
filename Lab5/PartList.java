//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class PartList
{
	private TreeMap<Part, Integer> partsMap;
	
	public PartList()
	{
		partsMap = new TreeMap<Part, Integer>();
	}
	
	public PartList(String fileName)
	{
		this();
		try
		{
			Scanner in = new Scanner(new File(fileName));
			while (in.hasNextLine()) {
				String line = in.nextLine();
				if (!line.equals("")) {
					Part p = new Part(line);
					if (!partsMap.containsKey(p)) {
						partsMap.put(p, 1);
					}
					else {
						partsMap.put(p, partsMap.get(p) + 1);
					}
				}
			}
		}
		catch( IOException e )  //Most specific exceptions must be listed 1st
		{
			e.printStackTrace();
		}
		catch( RuntimeException e )
		{
			e.printStackTrace();
		}
		catch( Exception e )
		{
			e.printStackTrace();;
		}
		finally
		{
			//no code needed here
		}
	}
	
	public String toString()
	{
		String output="";
		for (Part key : partsMap.keySet()) {
			output += key + " - " + partsMap.get(key) + "\n";
		}
		return output;
	}
}