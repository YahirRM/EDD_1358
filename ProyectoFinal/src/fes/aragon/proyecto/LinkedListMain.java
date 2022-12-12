package fes.aragon.proyecto;

import java.util.LinkedList;

public class LinkedListMain  {
	public static void main(String[] args) {
			
		//Declaración de la LinkedList
		LinkedList<String> list =  new LinkedList<String>();
		
		//Añadimos un objeto a la lista en orden mediante el método ADD()
		list.add("Elemento 1");
		list.add("Elemento 2");
		list.add("Elemento 3");
		list.add(2, "Elemento 4"); //Aquí se agrega un elemento a la lista en un indice deseado
		
		//Mostramos los elementos de la lista
		System.out.println("La lista tiene los siguientes elementos: "+ list);
		System.out.println("---------------------------------------------------");
		
		//Mostramos el tamaño de la lista mediante el método SIZE()
		System.out.println("La lista tiene un tamaño de: "+ list.size() +" elementos");
		System.out.println("---------------------------------------------------");
		
		//Obtención de los elementos según su posición 
		System.out.println("Primer elemento de la lista: "+ list.getFirst()); //Uso del método GETFIRST() para obtener el primer elemento
		System.out.println("Último elemento de la lista: "+ list.getLast()); //Uso del método GETLAST() para obtener el último elemento
		System.out.println("Elemento seleccionado de la lista: "+ list.get(2)); //Uso del método GET() para obtener el un elemento según su indice
		System.out.println("---------------------------------------------------");
		
		//Agregar un elemento al principio y final de la lista con ayuda del método GETFIRST() y GETLAST()
		list.addFirst("Inicio");
		list.addLast("Final");
		System.out.println("Estado actual de la lista: "+ list);
		System.out.println("La lista tiene un tamaño de: "+ list.size() +" elementos");
		System.out.println("---------------------------------------------------");
		
		//Borramos los elementos con ayuda del método REMOVE() 
		list.remove(2); //Estamos eliminado a un elemento segun su posición
		list.removeFirst(); //Estamos eliminando el primer elemento 
		list.removeLast(); //Estamos eliminando el último elemento
		System.out.println("Estado actual de la lista despues de eliminar el primer, ultimo y 3er elemento: "+ list);
		System.out.println("---------------------------------------------------");
		
		//Comprobar si el elemento existe en la lista mediante el método CONTAINS() 
		if(list.contains("Elemento 4")) {
			System.out.println("Elemento 4 está en la lista");
		}else {
			System.out.println("Elemento 4 no está en la lista");
		}
	}
}
