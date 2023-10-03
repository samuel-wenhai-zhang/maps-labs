//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner in = new Scanner(new File("acro.dat"));
		int n = in.nextInt();
		in.nextLine();
		Acronyms table = new Acronyms();
		while (n-- > 0) {
			table.putEntry(in.nextLine());
		}
		System.out.println("====\tMAP CONTENTS\t====\n\n");
		System.out.println(table);
		System.out.println("\n\n====\tREAD LINES\t====\n\n");
		
		while (in.hasNextLine()) {
			System.out.println(table.convert(in.nextLine()));
		}
	}
}