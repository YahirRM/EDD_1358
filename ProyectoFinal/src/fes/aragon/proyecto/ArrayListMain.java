package fes.aragon.proyecto;

import java.util.*;

public class ArrayListMain {
	public static void main(String[] args) {
		//Inicialización del Array 
		ArrayList<String> list = new ArrayList<String>();
		
		//Uso del método ADD(), el cual sirve para agregar elementos a la lista
		list.add("Item 1");
		list.add("Item 2");
		list.add(0, "Item 3"); //Agrega el elemento 3 en la posición 1
		list.add("Item 4");
		
		//Mostramos los elementos del Array
		System.out.println("La lista tiene los siguientes elementos: "+ list);
		System.out.println("------------------------------------------------");
		
		//Uso del método ITERATOR() para mostrar los elementos de la lista
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------------------------------");
		
		//Uso del método CLEAR() para borrar los elementos de la lista
		list.clear();
		System.out.println("Estado actual de la lista despues del uso del método clear: "+ list);
		System.out.println("------------------------------------------------");
		
		//Se vuelve a llenar la lista
		list.add("Item 1");
		list.add("Item 2");
		list.add(0, "Item 3"); //Agrega el elemento 3 en la posición 1
		list.add("Item 4");
		list.add("Item 5");
		
		//Uso del método INDEXOF() para mostrar el último indice de un elemento 
		int ult = list.indexOf("Item 2");
		System.out.println("El valor índice Item 2 es: "+ ult);
		System.out.println("------------------------------------------------");
		
		//Uso del método CLONE() para clonar el objeto list o la lista en este caso 
		Object listClone = list.clone();
		System.out.println("Objeto clonado: "+ listClone);
		System.out.println("------------------------------------------------");
		
		//Verificar si el array está vacío con ayuda del método ISEMPTY()
		if(list.isEmpty()) {//Consultamos si la pila contiene algún elemento con el método ISEMPTY()
			System.out.println("La Array está vacía");
		}else {
			System.out.println("La Array no está vacia");
		}
		System.out.println("------------------------------------------------");
		
		//Obtención del tamaño del array mediante el método SIZE()
		int tam = list.size();
		System.out.println("El tamaño del array es de: "+ tam);
		System.out.println("------------------------------------------------");
		
		//Verificamos si un elemento esta en el Array
		if(list.contains("Item 6")) { // Uso del método CONTAINS() para saber si el elemento a buscar se encuentra o no en la pila 
			System.out.println("El elemento se encuentra en el array");
		}else {
			System.out.println("El elemento no se encuentra en el array: ");
		}
		System.out.println("------------------------------------------------");
		
		//Obtenemos un elemento según una posición dada, con ayuda del método GET
		String pos = list.get(4);
		System.out.println("El elemento del indice 4 es: "+ pos);
		System.out.println("------------------------------------------------");
		
		//Remplazamos un elemento con el método SET
		list.set(0, "Elemento de cambio");
		System.out.println("El estado actual del Array después del cambio es: "+ list);
		System.out.println("------------------------------------------------");
		
		//Borrando un elemento dado con el método REMOVE
		list.remove(0);
		System.out.println("El estado actual del Array después del remover el indice 0  es: "+ list);	
	}
}
