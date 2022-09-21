package fes.aragon.juego;

public class Main {
	public static void main(String[] args) {
		Tablero test = new Tablero();
		
		test.setCasillas(3, 2, true);
        test.setCasillas(5, 2, true);
        test.setCasillas(3, 1, true);
        test.setCasillas(5, 9, true);
        test.setCasillas(8, 3, true);
        test.setCasillas(2, 1, true);
        test.setCasillas(1, 4, true);
        test.setCasillas(4, 6, true);
        test.setCasillas(1, 8, true);
        test.setCasillas(3, 7, true);
        test.setCasillas(2, 9, true);
        test.mostrarTabla();
        System.out.println("---------Segunda Generación--------");
        test.genSig();
        test.mostrarTabla();
        System.out.println("---------Tercera Generación--------");
        test.genSig();
        test.mostrarTabla();
        System.out.println("---------cuarta Generación--------");
        test.genSig();
        test.mostrarTabla();
		
	
	}
}
