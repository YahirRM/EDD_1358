package fes.aragon.ArregloADT;

public class Main {
	public static  void main(String[] args) {
		
		ArregloADT<Integer> lista = new ArregloADT<>(3);
		
		lista.setElemento(0, 140);
		lista.setElemento(1, 230);
		lista.setElemento(2, 333);
		
		System.out.println("LISTA DE TIPO ENTERO");
		System.out.println("\nEl tamaño del arreglo es de: "+lista.getLongitud());
		System.out.println("Primer elemento de la lista: "+lista.getElemento(0));
		System.out.println("Segundo elemento de la lista: "+lista.getElemento(1));
		System.out.println("Tercer elemento de la lista: "+lista.getElemento(2));
		
		lista.limpiarLista();
		System.out.println("\nDespues del uso del método CLEAR para asignar un valor enviado, el estado actual de los objetos: "+lista.toString());
		
		System.out.println("----------------------------------------------------------------------");
		
		ArregloADT<String> lista2 = new ArregloADT<>(3);
		
		lista2.setElemento(0, "Buenas tardes");
		lista2.setElemento(1, "Adios");
		lista2.setElemento(2, "Mercado Romero Yahir Ricardo");
			
		System.out.println("LISTA DE TIPO STRING");
		System.out.println("\nEl tamaño del arreglo es de: "+lista2.getLongitud());
		System.out.println("Primer elemento de la lista: "+lista2.getElemento(0));
		System.out.println("Segundo elemento de la lista: "+lista2.getElemento(1));
		System.out.println("Tercer elemento de la lista: "+lista2.getElemento(2));
		
		lista2.limpiarLista();
		System.out.println("\nDespues del uso del método CLEAR para asignar un valor enviado, el estado actual de los objetos: "+lista2.toString());
		
		System.out.println("----------------------------------------------------------------------");	
	}
}
