package fes.aragon.proyecto;

import java.util.LinkedList;

public class LinkedListMain  {
	public static void main(String[] args) {
			
		//Declaraci�n de la LinkedList
		LinkedList<String> list =  new LinkedList<String>();
		
		//A�adimos un objeto a la lista en orden mediante el m�todo ADD()
		list.add("Elemento 1");
		list.add("Elemento 2");
		list.add("Elemento 3");
		list.add(2, "Elemento 4"); //Aqu� se agrega un elemento a la lista en un indice deseado
		
		//Mostramos los elementos de la lista
		System.out.println("La lista tiene los siguientes elementos: "+ list);
		System.out.println("---------------------------------------------------");
		
		//Mostramos el tama�o de la lista mediante el m�todo SIZE()
		System.out.println("La lista tiene un tama�o de: "+ list.size() +" elementos");
		System.out.println("---------------------------------------------------");
		
		//Obtenci�n de los elementos seg�n su posici�n 
		System.out.println("Primer elemento de la lista: "+ list.getFirst()); //Uso del m�todo GETFIRST() para obtener el primer elemento
		System.out.println("�ltimo elemento de la lista: "+ list.getLast()); //Uso del m�todo GETLAST() para obtener el �ltimo elemento
		System.out.println("Elemento seleccionado de la lista: "+ list.get(2)); //Uso del m�todo GET() para obtener el un elemento seg�n su indice
		System.out.println("---------------------------------------------------");
		
		//Agregar un elemento al principio y final de la lista con ayuda del m�todo GETFIRST() y GETLAST()
		list.addFirst("Inicio");
		list.addLast("Final");
		System.out.println("Estado actual de la lista: "+ list);
		System.out.println("La lista tiene un tama�o de: "+ list.size() +" elementos");
		System.out.println("---------------------------------------------------");
		
		//Borramos los elementos con ayuda del m�todo REMOVE() 
		list.remove(2); //Estamos eliminado a un elemento segun su posici�n
		list.removeFirst(); //Estamos eliminando el primer elemento 
		list.removeLast(); //Estamos eliminando el �ltimo elemento
		System.out.println("Estado actual de la lista despues de eliminar el primer, ultimo y 3er elemento: "+ list);
		System.out.println("---------------------------------------------------");
		
		//Comprobar si el elemento existe en la lista mediante el m�todo CONTAINS() 
		if(list.contains("Elemento 4")) {
			System.out.println("Elemento 4 est� en la lista");
		}else {
			System.out.println("Elemento 4 no est� en la lista");
		}
	}
}
