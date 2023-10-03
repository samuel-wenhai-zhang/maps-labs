//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
		histogram = new TreeMap<String, Integer>();
	}

	public Histogram(String sent)
	{
		this();
		Scanner in = new Scanner(sent);
		while (in.hasNext()) {
			String s = in.next();
			if (!histogram.containsKey(s)) {
				histogram.put(s, 1);
			}
			else {
				histogram.put(s, histogram.get(s) + 1);
			}
		}
	}

	public String toString()
	{
		String output="char\t1---5----01---5\n";
		String allStars = "";
		for (String k : histogram.keySet()) {
			allStars = "";
			for (int i = 0; i < histogram.get(k); i++) {
				allStars += "*";
			}
			output += k + "\t" + allStars + "\n";
		}

		return output+"\n\n";
	}
}