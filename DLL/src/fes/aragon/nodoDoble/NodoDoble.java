package fes.aragon.nodoDoble;

public class NodoDoble<T> {
	
	private T dato;
	private NodoDoble<T> siguiente;
	private NodoDoble<T> anterior;
	
	public NodoDoble() {
		
	}
	
	public NodoDoble(T dato) {
		this.dato = dato;
	}
	
	public NodoDoble(T dato, NodoDoble<T> sig, NodoDoble<T> ant) {
		this.dato = dato;
		this.siguiente = sig;
		this.anterior = ant;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public NodoDoble<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble<T> siguiente) {
		this.siguiente = siguiente;
	}

	public NodoDoble<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble<T> anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return " <<--" + dato + "-->> ";
	}
	
	
	
	
	
	
	

}
