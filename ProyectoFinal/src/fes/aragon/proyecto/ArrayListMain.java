package fes.aragon.proyecto;

import java.util.*;

public class ArrayListMain {
	public static void main(String[] args) {
		//Inicializaci�n del Array 
		ArrayList<String> list = new ArrayList<String>();
		
		//Uso del m�todo ADD(), el cual sirve para agregar elementos a la lista
		list.add("Item 1");
		list.add("Item 2");
		list.add(0, "Item 3"); //Agrega el elemento 3 en la posici�n 1
		list.add("Item 4");
		
		//Mostramos los elementos del Array
		System.out.println("La lista tiene los siguientes elementos: "+ list);
		System.out.println("------------------------------------------------");
		
		//Uso del m�todo ITERATOR() para mostrar los elementos de la lista
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------------------------------");
		
		//Uso del m�todo CLEAR() para borrar los elementos de la lista
		list.clear();
		System.out.println("Estado actual de la lista despues del uso del m�todo clear: "+ list);
		System.out.println("------------------------------------------------");
		
		//Se vuelve a llenar la lista
		list.add("Item 1");
		list.add("Item 2");
		list.add(0, "Item 3"); //Agrega el elemento 3 en la posici�n 1
		list.add("Item 4");
		list.add("Item 5");
		
		//Uso del m�todo INDEXOF() para mostrar el �ltimo indice de un elemento 
		int ult = list.indexOf("Item 2");
		System.out.println("El valor �ndice Item 2 es: "+ ult);
		System.out.println("------------------------------------------------");
		
		//Uso del m�todo CLONE() para clonar el objeto list o la lista en este caso 
		Object listClone = list.clone();
		System.out.println("Objeto clonado: "+ listClone);
		System.out.println("------------------------------------------------");
		
		//Verificar si el array est� vac�o con ayuda del m�todo ISEMPTY()
		if(list.isEmpty()) {//Consultamos si la pila contiene alg�n elemento con el m�todo ISEMPTY()
			System.out.println("La Array est� vac�a");
		}else {
			System.out.println("La Array no est� vacia");
		}
		System.out.println("------------------------------------------------");
		
		//Obtenci�n del tama�o del array mediante el m�todo SIZE()
		int tam = list.size();
		System.out.println("El tama�o del array es de: "+ tam);
		System.out.println("------------------------------------------------");
		
		//Verificamos si un elemento esta en el Array
		if(list.contains("Item 6")) { // Uso del m�todo CONTAINS() para saber si el elemento a buscar se encuentra o no en la pila 
			System.out.println("El elemento se encuentra en el array");
		}else {
			System.out.println("El elemento no se encuentra en el array: ");
		}
		System.out.println("------------------------------------------------");
		
		//Obtenemos un elemento seg�n una posici�n dada, con ayuda del m�todo GET
		String pos = list.get(4);
		System.out.println("El elemento del indice 4 es: "+ pos);
		System.out.println("------------------------------------------------");
		
		//Remplazamos un elemento con el m�todo SET
		list.set(0, "Elemento de cambio");
		System.out.println("El estado actual del Array despu�s del cambio es: "+ list);
		System.out.println("------------------------------------------------");
		
		//Borrando un elemento dado con el m�todo REMOVE
		list.remove(0);
		System.out.println("El estado actual del Array despu�s del remover el indice 0  es: "+ list);	
	}
}
