package fes.aragon.cola.prioridad;

public class BoundedPriorityQueue<T> {
	private int nPrioridad, tam;
	private ArregloADT nivelPrioridad;
	private Cola aux, aux2;

	public BoundedPriorityQueue(int niveles) {
		this.nPrioridad = niveles;
		nivelPrioridad = new ArregloADT(nPrioridad);
		for (int i = 0; i < niveles; i++) {
			nivelPrioridad.setElemento(i, new Cola());
		}
	}

	public boolean estaVacia() {
		return this.tam == 0;
	}

	public int longitud() {

		return tam;
	}

	public void insertar(int prioridad, T elem) {
		if (prioridad >= 0 && prioridad < nPrioridad) {
			aux = (Cola) nivelPrioridad.getElemento(prioridad);
			aux.insertar(elem);
			nivelPrioridad.setElemento(prioridad, aux);
			this.tam++;
		} else {
			System.out.println("Esa prioridad no existe");
		}
	}

	public void extraer() {
		int prioridad = 0;
		aux = (Cola) nivelPrioridad.getElemento(prioridad);
		if (!aux.estaVacia()) {
			aux.extraer();
			nivelPrioridad.setElemento(prioridad, aux);
			this.tam--;

		} else {
			while (aux.estaVacia() && prioridad < nPrioridad) {

				prioridad++;
				if (prioridad < nPrioridad) {
					aux = (Cola) nivelPrioridad.getElemento(prioridad);

				}
			}
			aux.extraer();
			nivelPrioridad.setElemento(prioridad, aux);
			this.tam--;
		}
		if (tam < 0) {
			this.tam = 0;
		}
	}
	
	 @Override
	    public String toString() {
	        String estado ="";
	        for (int i = 0; i < nPrioridad; i++) {
	        	aux = (Cola) nivelPrioridad.getElemento(i);
	        	estado += "\n" +aux.toString();
			}
	        return estado;
	 }
}
