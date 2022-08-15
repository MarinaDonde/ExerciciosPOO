package application;

import entities.Guerreiro;
import entities.Mago;

public class Program {

	public static void main(String[] args) {

		Mago druid = new Mago("Maguinho", 300, 280, 40, 50, 10);
		Guerreiro knight = new Guerreiro("Kina", 500, 80, 40, 120, 10);
		
		System.out.println(druid);
		
		System.out.println(druid.attack());

		druid.lvlUp();
		System.out.println(druid);

		druid.lvlUp();
		System.out.println(druid);

		System.out.println(druid.attack());
		
		System.out.println(druid.aprenderMagia("congelamento"));
		
		druid.getMagias();
		
		System.out.println("-----------------------");
		
		System.out.println(knight);
		
		System.out.println(knight.attack());

		knight.lvlUp();
		System.out.println(knight);

		knight.lvlUp();
		System.out.println(knight);

		System.out.println(knight.attack());
		
		knight.getHabilidades();
		
		System.out.println(knight.aprenderHabilidade("Chute alto"));
		knight.aprenderHabilidade("Corte com espada");
			
		knight.getHabilidades();
		
	}

}
