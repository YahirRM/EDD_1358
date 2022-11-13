package fes.aragon.cola;

public class Cola <T>{
	private Nodo<T> inicioCola, finalCola;
	int tam;
	
	public Cola() {
		this.inicioCola = null;
		this.finalCola = null;
		this.tam = 0;
	}
	
	public boolean estaVacia() {
		return this.inicioCola == null;
	}
	
	public int longitud() {
		return this.tam; 
	}
	
	//Metdodo para insertar 
	
	public void insertar(T dato) {
		Nodo<T> nodo = new Nodo<T>(dato);
		
		if (this.estaVacia()) {
			inicioCola = nodo;
			
		} else {
			finalCola.siguiente = nodo;
		}
		finalCola = nodo;
		tam++;
	}
	
	//Metedodo para extraer 
	
	public T extraer() {
		T aux = inicioCola.informacion;
		inicioCola = inicioCola.siguiente;
		tam--;
		return aux;
	}
	
	public void transversal() {
        Nodo curr_node = this.inicioCola;
        while (curr_node != null) {
            System.out.print(curr_node);
            curr_node = curr_node.getSiguiente();
        }
        System.out.println("");
    }  

}
