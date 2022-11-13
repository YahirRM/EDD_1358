package fes.aragon.cola;

public class Nodo<T> {

	T informacion;
	Nodo<T> siguiente;

	public Nodo(T dato) {
		this.informacion = dato;
		this.siguiente = null;
	}

	public Nodo() {
	}

	public Nodo(T dato, Nodo<T> siguiente) {
		this.informacion = dato;
		this.siguiente = siguiente;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

	public T getDato() {
		return informacion;
	}

	public void setDato(T dato) {
		this.informacion = dato;
	}

	@Override
	public String toString() {

		return "|" + informacion + "| -->";
	}

	public String printAll() {
		return "[Dato = " + informacion + "] -> [Siguiente : " + this.getSiguiente() + "]";
	}
}
