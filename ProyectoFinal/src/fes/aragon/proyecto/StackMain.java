package fes.aragon.proyecto;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		
		//Declaraci�n de la pila (Stack)
		Stack<Integer> pila = new Stack<Integer>();
		
		System.out.println("Pila: "+pila); //Consultamos el estado actua de la pila 
		if(pila.isEmpty()) {//Consultamos si la pila contiene alg�n elemento con el m�todo ISEMPTY()
			System.out.println("La pila esta vac�a");
		}else {
			System.out.println("La pila no esta vacia");
		}
		System.out.println("---------------------------------------------------");
		
		//Agregamos elementos a la pila mediante el m�todo PUSH
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
		if(pila.isEmpty()) {//Consultamos si la pila contiene alg�n elemento con el m�todo ISEMPTY()
			System.out.println("La pila esta vac�a");
		}else {
			System.out.println("La pila no esta vacia");
		}
		System.out.println("---------------------------------------------------");
		
		//Se busca el elemento dentro de la pila seg�n el �ndice se�alado esto mediante el m�todo SEARCH()
		if(pila.contains(3)) { // Uso del m�todo CONTAINS() para saber si el elemento a buscar se encuentra o no en la pila 
		System.out.println("Objeto 3 desp�es de usar el m�todo search(): "+pila.search(3));
		}else {
			System.out.println("El elemento no se encuentra en la pila: ");
		}
		System.out.println("---------------------------------------------------");
		
		//El m�todo POP() se encarga de eliminar el �ltimo registro que entro a la pila y a su vez se muestra el estado actual
		if(pila.size()>0) { //Usamos el m�todo SIZE() para obtner el tama�o actual de la pila 
			pila.pop(); 
			System.out.println("Estado actual de la pila desp�es de usar el m�todo pop(): "+pila);
		}else {
			System.out.println("No hay elemento en la pila");
		}
		
		//El m�todo PEEK() se encarga de mostrar el elemento final de la pila
		if(pila.size()>0) { //Usamos el m�todo SIZE() para obtner el tama�o actual de la pila 
			System.out.println("El �ltimo elemento de la pila usando el m�todo peek() es: "+pila.peek());
		}else {
			System.out.println("No hay elemento en la pila");
		}
		System.out.println("---------------------------------------------------");
				
		//Uso del m�todo CLEAR(), el cual sirve para vaciar la pila por completo
		pila.clear();
		System.out.println("Estado actual de la pila desp�es del m�todo clear(): "+pila); //Consultamos el estado actua de la pila 
		if(pila.isEmpty()) {//Consultamos si la pila contiene alg�n elemento con el m�todo ISEMPTY()
			System.out.println("La pila esta vac�a");
		}else {
			System.out.println("La pila no esta vacia");
		}
		//Usamos el m�todo SIZE() para obtner el tama�o actual de la pila
		System.out.println("Tama�o actual de la pila desp�es de usar el m�todo clear(): "+pila.size());
	}
}
   
