//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class HistogramRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner in = new Scanner(new File("histogram.dat"));
		while (in.hasNextLine()) {
			Histogram h = new Histogram(in.nextLine());
			System.out.println(h);
		}
	}
}