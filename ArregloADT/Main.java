package fes.aragon.ArregloADT;

public class Main {
	public static  void main(String[] args) {
		
		ArregloADT<Integer> lista = new ArregloADT<>(3); //Creación de nuestra arraylist de tipo Integer
		
		// Uso del método setElemento para intanciar los valores de nuestro arreglo
		lista.setElemento(0, 140); 
		lista.setElemento(1, 230);
		lista.setElemento(2, 333);
		
		
		System.out.println("LISTA DE TIPO ENTERO");
		System.out.println("\nEl tamaño del arreglo es de: "+lista.getLongitud()); //Uso del método getLongitud, el cual nos retornara el tamaño de nuesto arreglo
		System.out.println("Primer elemento de la lista: "+lista.getElemento(0)); //Uso del método getElemento, el cual nos permitira mostrar el elemento en el indice indicado
		System.out.println("Segundo elemento de la lista: "+lista.getElemento(1));
		System.out.println("Tercer elemento de la lista: "+lista.getElemento(2));
		
		lista.limpiarLista(); // Uso del método limpiarLista, el cual establecera los elementos del arrgelo con un valor enviado, en este caso null
		System.out.println("\nDespues del uso del método CLEAR para asignar un valor enviado, el estado actual de los objetos: "+lista.toString());
		// Uso del método toString que regresara en String el estado actual de nuestro arreglo, una vez de haber usado el método limpiarLista
		
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
