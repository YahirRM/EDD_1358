package fes.aragon.nodoDoble;

public class DLL <T> {
	private NodoDoble<T> head;
	private int tamanio;
	
	public DLL() {
		this.head = null;
		this.tamanio = 0;
	}
	
	public boolean vacia() {
		return this.head == null;
	}
	
	public int getTamanio() {
		return this.tamanio;
	}
	
	public void agregarInicio(T dato) {
		NodoDoble<T> nuevo = new NodoDoble<>(dato);
		if(this.vacia()) {
			this.head = nuevo;
		}else {
			nuevo.setSiguiente(this.head);
			this.head.setAnterior(nuevo);
			this.head = nuevo;
		}
	}
	
	public void agregarFinal(T dato) {
		NodoDoble nuevo = new NodoDoble(dato);
		if(this.vacia()) {
			this.head = nuevo;
		}else {
			NodoDoble aux = this.head;
			while(aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			nuevo.setAnterior(aux);
			aux.setSiguiente(nuevo);
			aux = null;
			nuevo = null;
		}
	}
	
	public void agregarDespues(T dato, int posicion) {
		NodoDoble nuevo = new NodoDoble(dato);
		NodoDoble aux = this.head;
		
		for (int i = 1; i <= posicion -1 ;  i++) {
			aux = aux.getSiguiente();
		}
		nuevo.setSiguiente(aux.getSiguiente());
		nuevo.setAnterior(aux);
		aux.setSiguiente(nuevo);
	}
	
	public void eliminarPrimero() {
		NodoDoble aux = this.head;
		if(!this.vacia()) {
			this.head = aux.getSiguiente();
			this.head.setAnterior(null);
		}
	}
	
	public void eliminarFinal() {
		if(!this.vacia()) {
			NodoDoble aux = this.head;
			while(aux.getSiguiente().getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(null);
		}else {
			this.head = null;
		}
	}
	
	public void eliminar (int posicion) {
		NodoDoble aux1 = this.head;
        NodoDoble aux2 = null;
        for (int i = 1; i < posicion - 1; i++){
            aux1 = aux1.getSiguiente();
        }
        aux2= aux1.getSiguiente().getSiguiente();
        aux1.setSiguiente(aux2);
        aux2.setAnterior(aux1);
	}
	
	public int buscar(T dato){
        int posicion=1;
        NodoDoble aux = this.head;
        while(aux != null && aux.getDato()!= dato  ){
            aux = aux.getSiguiente();
            posicion +=1;
        }
        return posicion;
    }
	
	public void actualizar(T a_buscar,T dato ){
        NodoDoble aux = this.head;
    
            while(aux != null && aux.getDato()!=a_buscar){
                aux = aux.getSiguiente();
            }
            aux.setDato(dato);
    }
    
	public void transversal() {
		NodoDoble emp = this.head;
		while(emp != null) {
			System.out.print(emp);
			emp = emp.getSiguiente();
		}
		System.out.println("");
	}
	
	
	
	
	
	
	
	
	
	

}
