//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner in  = new Scanner(new File("relatives.dat"));
		int n = in.nextInt();
		in.nextLine();
		Relatives r = new Relatives();
		while (n-- > 0) {
			r.setPersonRelative(in.nextLine());
		}
		System.out.println(r);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			if (!line.equals("")) {
				System.out.println(r.getRelatives(line));
			}
		}
	}
}