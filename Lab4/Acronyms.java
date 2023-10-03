//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
	private Map<String,String> acronymTable;

	public Acronyms()
	{
		acronymTable = new TreeMap<String, String>();
	}

	public void putEntry(String entry)
	{
		String[] pair = entry.split(" - ");
		acronymTable.put(pair[0], pair[1]);
	}

	public String convert(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";
		while (chop.hasNext()) {
			String word = chop.next();
			if (!acronymTable.containsKey(word)) {
				output += word + " ";
			}
			else {
				output += acronymTable.get(word) + " ";
			}
		}

		return output;
	}

	public String toString()
	{
		String output = "{";
		for (String key : acronymTable.keySet()) {
			output += key + "=" + acronymTable.get(key) + "\n ";
		}
		output = output.trim() + "}";
		return output;
	}
}