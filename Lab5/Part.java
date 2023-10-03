//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

public class Part implements Comparable<Part>
{
	private String make, model, rest;
	private int year;

	public Part(String line) 
	{
		String[] list = line.split(" ");
		int i  = list.length - 1;
		year = Integer.parseInt(list[i--]);
		model = list[i--];
		make = list[i--];
		rest = "";
		for (int j = 0; j <= i; j++) {
			rest += list[j] + " ";
		}
		rest = rest.trim();
	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{
		if (!make.equals(rhs.make)) {
			return make.compareTo(rhs.make);
		}
		else if (!model.equals(rhs.model)) {
			return model.compareTo(rhs.model);
		}
		else if (year != rhs.year) {
			return year - rhs.year;
		}
		else {
			return rest.compareTo(rhs.rest);
		}
	}

	public String toString()
	{
		return make + " " + model + " " + year + "  " + rest;		
	}
}