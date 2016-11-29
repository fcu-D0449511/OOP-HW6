package fcu.iecs.oop.pokemon;

public class Pokemon {

	private String name = null;
	public int cp=0;
	
	public Pokemon(String a , int b)
	{
		getname();
		getcp();
		setcp(b);
	}
	public String getname()
	{
		return name;
	}
	public int getcp()
	{
		return cp;
	}
	public void setcp(int num)
	{
		if(num>=0)
			cp=num;
	}
	
}
