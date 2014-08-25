package Character;

public class Character {

	private String name;
	private int health;
	private int attack;
	private int defense;
	
	public Character(String name, int health, int attack, int defense)
	{
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.defense = defense;
	}
	
	public String Name()
	{
		return this.name;
	}
	
	public int Health()
	{
		return this.health;
	}
	
	public int Attack()
	{
		return this.attack;
	}
	
	public int Defense()
	{
		return this.defense;
	}
	
	public void  setName(String name)
	{
		this.name = name;
	}
	
	public void subtractHealth(int healthLost)
	{
		this.health -= healthLost;
	}
}
