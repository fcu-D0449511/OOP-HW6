package fcu.iecs.oop.pokemon;
import java.util.Random;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2)
	{
		 Random ran = new Random();
	     int c = ran.nextInt(10)+1;
		 
		 if(c%2 == 0)
		{
			System.out.printf("Winner is %s.", p1.getname());
			p1.cp=p1.cp+500;
		}
		 else
		 {
			System.out.printf("Winner is %s.", p2.getname());
			p2.cp=p2.cp+500; 
		 }
	}

}
