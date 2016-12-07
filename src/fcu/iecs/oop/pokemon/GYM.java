package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM{

	public static int win1 = 0; 
	public static int win2 = 0;
	
	public static Player fight(Player...players)
	{
		Player player1 = players[0];
		Player player2 = players[1];
			
		Pokemon[] t1 = player1.getpokemons();
		Pokemon pkm11 = t1[0];
		Pokemon pkm12 = t1[1];
		Pokemon pkm13 = t1[2];
		
		Pokemon[] t2 = player2.getpokemons();
		Pokemon pkm21 = t2[0];
		Pokemon pkm22 = t2[1];
		Pokemon pkm23 = t2[2];
		
		fight(pkm11, pkm21);
		fight(pkm12, pkm22);
		if(win1==2 || win2==2)
		{
			if(win1==2)
			{
				player1.setlevel( player1.getlevel() +1 );
				System.out.printf("Winner is %s, and his/her level becomes %d.", player1.getplayername() , player1.getlevel());
				return player1;
			}
			else
			{
				player2.setlevel( player2.getlevel() +1 );
				System.out.printf("Winner is %s, and his/her level becomes %d.", player2.getplayername() , player2.getlevel());
				return player2;
			}
		}
		else
		{
			fight(pkm13, pkm23);
			if(win1==2)
			{
				player1.setlevel( player1.getlevel() +1 );
				System.out.printf("Winner is %s, and his/her level becomes %d.", player1.getplayername() , player1.getlevel());
				return player1;
			}
			else
			{
				player2.setlevel( player2.getlevel() +1 );
				System.out.printf("Winner is %s, and his/her level becomes %d.", player2.getplayername() , player2.getlevel());
				return player2;
			}
		}
	}
   public static void fight(Pokemon a, Pokemon b)
   {
	   if(a.gettype() == PokemonType.FIRE)
	   {
		   if(b.gettype() == PokemonType.FIRE)
		   {
			   if(a.getcp() > b.getcp())
			   {
				   win1++;
			   }
			   else if(a.getcp() < b.getcp())
			   {
				   win2++;
			   }
			   else
			   {
				   Random r = new Random();
					
					if(r.nextInt(2)==0)
					{
						win1++;
					}
					else
					{
						win2++;  
					}
			   }
		   }
		   else if(b.gettype() == PokemonType.GRASS)
		   {
			   win1++; 
		   }
		   else
		   {
			   win2++;
		   }
	   }
	   if(a.gettype() == PokemonType.GRASS)
	   {
		   if(b.gettype() == PokemonType.GRASS)
		   {
			   if(a.getcp() > b.getcp())
			   {
				   win1++;
			   }
			   else if(a.getcp() < b.getcp())
			   {
				   win2++;
			   }
			   else
			   {
				   Random r = new Random();
					
					if(r.nextInt(2)==0)
					{
						win1++;
					}
					else
					{
						win2++;  
					}
			   }
		   }
		   else if(b.gettype() == PokemonType.WATER)
		   {
			   win1++; 
		   }
		   else
		   {
			   win2++;
		   }
	   }
	   if(a.gettype() == PokemonType.WATER)
	   {
		   if(b.gettype() == PokemonType.WATER)
		   {
			   if(a.getcp() > b.getcp())
			   {
				   win1++;
			   }
			   else if(a.getcp() < b.getcp())
			   {
				   win2++;
			   }
			   else
			   {
				   Random r = new Random();
					
					if(r.nextInt(2)==0)
					{
						win1++;
					}
					else
					{
						win2++;  
					}
			   }
		   }
		   else if(b.gettype() == PokemonType.FIRE)
		   {
			   win1++; 
		   }
		   else
		   {
			   win2++;
		   }
	   }
   }
	
}
