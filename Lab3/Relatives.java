//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new TreeMap<String, Set<String>>();
	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		if (!map.containsKey(personRelative[0])) {
			Set<String> s = new TreeSet<String>();
			s.add(personRelative[1]);
			map.put(personRelative[0], s);
		}
		else {
			map.get(personRelative[0]).add(personRelative[1]);
		}
	}


	public String getRelatives(String person)
	{
		if (!map.containsKey(person)) {
			return person + " is not related to anyone";
		}
		return person + " is related to " + map.get(person);
	}


	public String toString()
	{
		String output="";

		for (String person : map.keySet()) {
			output += person + " is related to ";
			for (String relative : map.get(person)) {
				output += relative + " ";
			}
			output += "\n";
		}

		return output;
	}
}