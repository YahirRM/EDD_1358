package fes.aragon.tablas.hash;

public class ListaLigada<T> {

	Nodo<T> head;
	int tamanio;

	public ListaLigada() {
	        this.head = null;
	        this.tamanio = 0;
	    }

	public boolean estaVacia() {
		return this.head == null;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void agregarAlFinal(T valor) {
		Nodo nuevo = new Nodo(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			Nodo aux = this.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
		}
		tamanio++;
	}

	public void agregarAlInicio(T valor) {
		Nodo nuevo = new Nodo(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			nuevo.setSiguiente(this.head);
			this.head = nuevo;
		}
		tamanio++;
	}

	public void agregarDespuesDe(T valor, int posicion) {
		Nodo nuevo = new Nodo(valor);
		Nodo aux = this.head;
		for (int contador = 1; contador <= posicion - 1; contador++) {
			aux = aux.getSiguiente();
		}
		nuevo.setSiguiente(aux.getSiguiente());
		aux.setSiguiente(nuevo);
		tamanio++;
	}

	public void eliminar(int posicion) {
		Nodo aux = this.head;
		if (!this.estaVacia()) {

			for (int contador = 1; contador <= posicion - 1; contador++) {
				aux = aux.getSiguiente();
			}

			aux.setSiguiente(aux.getSiguiente().getSiguiente());
			tamanio--;
		} else {
			System.out.println("No hay datos");
		}

	}

	public void eliminarElPrimero() {
		if (!this.estaVacia()) {
			head = head.getSiguiente();
			tamanio--;
		} else {
			head = null;
		}
	}

	public void eliminarElFinal() {
		if (!this.estaVacia()) {
			Nodo aux = this.head;
			while (aux.getSiguiente().getSiguiente() != null) {
				aux = aux.getSiguiente();

			}
			tamanio--;
			aux.setSiguiente(null);
		} else {
			head = null;
		}
	}

	public int buscar(T valor) {

		int posicion = 1;
		Nodo aux = this.head;
		while (aux != null && aux.getDato() != valor) {
			aux = aux.getSiguiente();
			posicion++;
		}

		return posicion;

	}

	public T getDato(int posicion) {
		int index = 0;
		Nodo aux = this.head;
		while (aux != null && index < posicion) {
			index++;
			aux = aux.getSiguiente();
		}
		T dato = (T) aux.getDato();

		return dato;
	}

	public boolean existe(T valor) {
		Nodo aux = this.head;
		while (aux != null) {
			if (aux.getDato() != valor) {
				return false;
			} else {
				aux = aux.getSiguiente();
			}
		}
		return true;

	}

	public void actualizar(T a, T valor) {
		Nodo aux = this.head;
		while (aux != null && aux.getDato() != a) {
			aux = aux.getSiguiente();

		}
		aux.setDato(valor);
	}

	public void transversal() {
		Nodo curr_node = this.head;
		while (curr_node != null) {
			System.out.print(curr_node);
			curr_node = curr_node.getSiguiente();
		}
		System.out.println("");
	}

	@Override
	public String toString() {
		String estado = "";
		Nodo curr_node = this.head;
		while (curr_node != null) {
			estado += curr_node.toString();
			curr_node = curr_node.getSiguiente();
		}
		return estado;
	}

}