package fes.aragon.cola;

public class Main {
	
	public static void main(String[] args) {
		
		Cola<Integer> colita = new Cola();
		
		System.out.println(colita.estaVacia());
		System.out.println(colita.longitud());
		colita.insertar(20);
		colita.insertar(21);
		colita.insertar(22);
		colita.transversal();
		System.out.println(colita.estaVacia());
		System.out.println(colita.longitud());
		colita.extraer();
		colita.transversal();
		colita.insertar(23);
		colita.insertar(32);
		colita.transversal();
		colita.extraer();
		colita.transversal();
		colita.extraer();
		colita.transversal();
		System.out.println(colita.estaVacia());
		System.out.println(colita.longitud());
	}
}
