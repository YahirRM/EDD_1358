package fes.aragon.cola;

public class Main {
	
	public static void main(String[] args) {
		
		Cola<Integer> colita = new Cola();
		
		colita.insertar(20);
		colita.transversal();
		colita.insertar(21);
		colita.transversal();
		colita.insertar(22);
		colita.transversal();
		colita.extraer();
		colita.transversal();
		colita.insertar(23);
		colita.insertar(32);
		colita.transversal();
		colita.extraer();
		colita.transversal();
		colita.extraer();
		colita.transversal();
	}
}
