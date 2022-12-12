package fes.aragon.proyecto;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		
		//Declaración de la pila (Stack)
		Stack<Integer> pila = new Stack<Integer>();
		
		System.out.println("Pila: "+pila); //Consultamos el estado actua de la pila 
		if(pila.isEmpty()) {//Consultamos si la pila contiene algún elemento con el método ISEMPTY()
			System.out.println("La pila esta vacía");
		}else {
			System.out.println("La pila no esta vacia");
		}
		System.out.println("---------------------------------------------------");
		
		//Agregamos elementos a la pila mediante el método PUSH
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		
		//Hacemos un recorido para mostrar los valores de la pila
		for(Integer i: pila) {
			System.out.println(i);
		}

		System.out.println("Pila: "+pila); //Consultamos el estado actua de la pila
		if(pila.isEmpty()) {//Consultamos si la pila contiene algún elemento con el método ISEMPTY()
			System.out.println("La pila esta vacía");
		}else {
			System.out.println("La pila no esta vacia");
		}
		System.out.println("---------------------------------------------------");
		
		//Se busca el elemento dentro de la pila según el índice señalado esto mediante el método SEARCH()
		if(pila.contains(3)) { // Uso del método CONTAINS() para saber si el elemento a buscar se encuentra o no en la pila 
		System.out.println("Objeto 3 despúes de usar el método search(): "+pila.search(3));
		}else {
			System.out.println("El elemento no se encuentra en la pila: ");
		}
		System.out.println("---------------------------------------------------");
		
		//El método POP() se encarga de eliminar el último registro que entro a la pila y a su vez se muestra el estado actual
		if(pila.size()>0) { //Usamos el método SIZE() para obtner el tamaño actual de la pila 
			pila.pop(); 
			System.out.println("Estado actual de la pila despúes de usar el método pop(): "+pila);
		}else {
			System.out.println("No hay elemento en la pila");
		}
		
		//El método PEEK() se encarga de mostrar el elemento final de la pila
		if(pila.size()>0) { //Usamos el método SIZE() para obtner el tamaño actual de la pila 
			System.out.println("El último elemento de la pila usando el método peek() es: "+pila.peek());
		}else {
			System.out.println("No hay elemento en la pila");
		}
		System.out.println("---------------------------------------------------");
				
		//Uso del método CLEAR(), el cual sirve para vaciar la pila por completo
		pila.clear();
		System.out.println("Estado actual de la pila despúes del método clear(): "+pila); //Consultamos el estado actua de la pila 
		if(pila.isEmpty()) {//Consultamos si la pila contiene algún elemento con el método ISEMPTY()
			System.out.println("La pila esta vacía");
		}else {
			System.out.println("La pila no esta vacia");
		}
		//Usamos el método SIZE() para obtner el tamaño actual de la pila
		System.out.println("Tamaño actual de la pila despúes de usar el método clear(): "+pila.size());
	}
}
   
