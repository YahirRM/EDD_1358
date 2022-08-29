package fes.aragon.ArregloADT;

import java.util.ArrayList;

public class ArregloADT<T> {
	
	private int tamanio;
	private ArrayList<T> datos;
	
	public ArregloADT(int tam) {
		this.tamanio = tam;
		datos = new ArrayList<>();
		for(int j = 0; j<tam; j++) {
			datos.add((T) new Object());
		}

	}
	
	public int getLongitud() {
		return datos.size();
	}
	
	public T getElemento(int indice) {
		if(indice >=0 && indice<this.tamanio) {
			return datos.get(indice);
		}
		return null;
	}
	public void setElemento(int indice, T elemento) {
		if(indice>=0 && indice<this.tamanio) {
			datos.set(indice, elemento);
		}
	}

	public void limpiarLista() {
		for (int i = 0; i < tamanio; i++) {
			datos.set(i, null);
		}
	}

	@Override
	public String toString() {
		return "ArregloADT [datos=" + datos + "]";
	}
	
	
	
}
