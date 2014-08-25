package Util;


public class Translator {
	
	private Synthesizer synth;
	
	/**
	 * Translator will seek out attributes and return them.
	 */
	public Translator()
	{
		synth = new Synthesizer("act");
	}
	
	/** 
	 * 
	 * @param path: The path of the file you are looking int
	 * @param attr: The name of the attribute you want
	 * @return
	 */
	public String findString(String path, String attr)
	{
		String value = "";
		value = synth.read(path, attr, "s");
		return value;
	}
	
	public void saveString(String path, String attr, String value)
	{
		synth.write(path,attr,value,"s");
	}

	/** 
	 * 
	 * @param path: The path of the file you are looking int
	 * @param attr: The name of the attribute you want
	 * @return
	 */
	public int findInt(String path, String attr)
	{
		int value = -1;
		value = Integer.parseInt(synth.read(path, attr, "i"));
		return value;
	}
	
	public void saveInt(String path, String attr, int value)
	{
		String convert = "" + value;
		synth.write(path,attr,convert ,"i");
	}

	
	/** 
	 * 
	 * @param path: The path of the file you are looking int
	 * @param attr: The name of the attribute you want
	 * @return
	 */
	public double findDouble(String path, String attr)
	{
		double value = -1;
		value = Integer.parseInt(synth.read(path, attr, "d"));
		return value;
	}
	
	public void saveDouble(String path, String attr, double value)
	{
		String convert = "" + value;
		synth.write(path,attr,convert,"d");
	}
	
}
