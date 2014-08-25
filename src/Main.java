import Window.Window;
import Character.Character;
import Character.CharacterFactory;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//CharacterFactory cf = new CharacterFactory();
		//fight(cf.create("Files/Hero/GenericHero"), cf.create("Files/Enemy/GenericEnemy"));
		
		Window win = new Window();
	}

	public static void fight(Character char1, Character char2)
	{
		while(true)
		{
			if(char2.Health() <= 0)
			{
				System.out.println(char1.Name() + " is victorious!");
				break;
			}
			else
			{
				char2.subtractHealth(char1.Attack());
				System.out.println(char1.Name() + " did " + char1.Attack() + " damage to " + char2.Name() + "!");
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(char1.Health() <= 0)
			{
				System.out.println(char2.Name() + " is victorious!");
				break;
			}
			else
			{
				char1.subtractHealth(char2.Attack());
				System.out.println(char2.Name() + " did " + char2.Attack() + " damage to " + char1.Name() + "!");
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
