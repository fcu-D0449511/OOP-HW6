package fcu.iecs.oop.pokemon;

public class Pokemon {

	private String name = null;
	private int cp=0;
	private PokemonType type;
	public Pokemon(String a ,PokemonType c, int b )
	{
		this.name=a;
		this.cp=b;
		this.type=c;
	}
	public String getname()
	{
		return name;
	}
	public int getcp()
	{
		return cp;
	}
	public void setcp(int cp)
	{
		this.cp = cp;
	}
	public PokemonType gettype()
	{
		return type;
	}
}
