package fcu.iecs.oop.pokemon;

public class Player {

	public String playername = null;
	public int level = 1;
	public Pokemon[] pokemons;
	
    public Player(String a )
	{
		this.playername = a;
	}
	public String getplayername()
	{
		return playername;
	}
	public int getlevel()
	{
		return level;
	}
	public Pokemon[] getpokemons()
	{
		return pokemons;
	}
	public void setplayername(String playername)
	{
		this.playername = playername;
	}
	public void setlevel(int level)
	{
		this.level = level;
	}
	public void setPokemons(Pokemon[] pokemons)
	{
		this.pokemons = pokemons;
	}
}
