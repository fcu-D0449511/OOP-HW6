package fcu.iecs.oop.pokemon;

public class Main {
	public static void main(String[] args) {
		  Pokemon p1 = new Pokemon("Psyduck", 100);
		  Pokemon p2 = new Pokemon("Pikachu", 300);
		  
		  GYM.fight(p1, p2);

		}
}
