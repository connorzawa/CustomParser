package Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Synthesizer {
	
	private String extension;
	private Scanner reader;
	private PrintWriter writer;
	private Pattern value;
	private Pattern protein;
	private Matcher mValue;
	private Matcher mProtein;
	
	public Synthesizer(String extension)
	{
		this.extension = extension;
		// Pattern to search for next "."
		// Pattern to get value between "~ ~"
		protein = Pattern.compile(Pattern.quote("~") + "(.*?)" + Pattern.quote(("~")));
	}
	
	public String read(String path, String attr, String type)
	{ 
		// Convert path to the correct format
		String file = path + "." + extension;
		String result = "";
		// Try to open the file in question
		try {
			reader = new Scanner(new File (file));
		} catch (FileNotFoundException e) {			
			// If the file isn't found, return an empty String and print error
			System.out.println("FILE NOT FOUND");
			e.printStackTrace();
			return "";
		}
		
		// Compile the pattern to retrieve the attribute requested
		value = Pattern.compile(Pattern.quote(type + ".") + Pattern.quote(attr) + Pattern.quote("~")); 
		// Scan the file
		while(reader.hasNextLine())
		{
			String line = reader.nextLine();
			// Figure out what attribute you are reading
			mValue = value.matcher(line);
			if(mValue.find())
			{
					// Return the result if the line matches
					mProtein = protein.matcher(line);
					if(mProtein.find())
					{
							result = mProtein.group(1);
					}
			}
		}
		reader.close();
		return result;
	}
	
	public void write(String path, String attr, String value, String type)
	{
		String file = path + "." + extension;
		
		try {
			writer = new PrintWriter(new File(file));
		} catch (FileNotFoundException e) {
			System.out.println("ERROR WRITING TO FILE!");
			e.printStackTrace();
			return;
		}
		writer.write(type + "." + attr + "~" + value + "~" + '\r' + '\n');
		writer.close();
		
		
	}
	
	
	
}
