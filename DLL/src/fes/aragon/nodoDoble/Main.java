package fes.aragon.nodoDoble;

public class Main {
	
	public static void main(String[] args) {
		
		ListaDoble <Integer> test = new ListaDoble();
		
		System.out.println("Probando la lista doblemente ligada\n");
		
		System.out.println("------Agregando al final------");
		test.agregarFinal(45);
		test.agregarFinal(120);
		test.agregarFinal(10);
		test.agregarFinal(235);
		test.agregarFinal(219);
		test.agregarFinal(42);
		test.transversal();
		System.out.println("\n------Agregando al inicio------");
		test.agregarInicio(23);
		test.transversal();
		test.agregarInicio(1);
		test.transversal();
		System.out.println("\n------Agregando despues de------");
		test.agregarDespues(345, 1);
		test.transversal();
		System.out.println("\n------Eliminando el primero------");
		test.eliminarPrimero();
		test.transversal();
		System.out.println("\n------Eliminando el último------");
		test.eliminarFinal();
		test.transversal();
		System.out.println("\n------Eliminando cualquiera (posición 3)------");
		test.eliminar(3);
		test.transversal();
		System.out.println("\n------Buscando un nodo (23)------");
		System.out.println("Posición del nodo a buscar: "+test.buscar(23));
		System.out.println("\n------Actualizando un nodo(10->>12)------");
		test.actualizar(10, 12);
		test.transversal();
		
	}

}
