package fes.aragon.laberinto;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		
		File path = new File("C:\\Users\\Liliana\\Downloads\\laberinto.csv");
		Laberinto test = new Laberinto(path);
		System.out.println(test);
		test.camino(2, 1);
		//test.resolver(3, 1);  
		
	}

}
