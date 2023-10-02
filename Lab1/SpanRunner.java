//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner in = new Scanner(new File("spantoeng.dat"));
		int n = in.nextInt();
		in.nextLine();

		SpanishToEnglish dict = new SpanishToEnglish();
		while (n-- > 0) {
			dict.putEntry(in.nextLine());
		}

		System.out.println("====\tMAP CONTENTS\t====\n");
		System.out.println(dict + "\n\n");

		while (in.hasNextLine()) {
			System.out.println(dict.translate(in.nextLine()));
		}
	}
}