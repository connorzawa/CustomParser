package Character;
import Util.Factory;


public class CharacterFactory extends Factory {

	public Character create(String path)
	{
		
		String name = trans.findString(path, "Name");
		int health =  trans.findInt(path, "Health");
		int attack = trans.findInt(path, "Attack");
		int defense = trans.findInt(path, "Defense");
		
		Character character = new Character(name, health, attack, defense);
		return character;
	}
}
