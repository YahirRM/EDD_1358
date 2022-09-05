package fes.aragon.tarea3;

import java.util.ArrayList;

public class ArregloADT <T>{
	
	private int tamanio;
	private ArrayList<T> datos;
	
	public ArregloADT(int tam) {
		this.tamanio = tam;
		datos = new ArrayList<>(this.tamanio);
		for (int i = 0; i <this.tamanio; i++) {
			this.datos.add(null);
		}
	}
	public int getLongitud() {
		return this.tamanio;
	}
	
	public T getElemento(int indice ) {
		if(comprobacion(indice)) {
			return this.datos.get(indice);
		}else {
			System.out.println("Fuera del rango");
		}
		return null;
	}
	private boolean comprobacion(int indice) {
		return indice >= 0 && indice < this.tamanio;
	}
	
	public void setElemento(T dato, int indice) {
		if(comprobacion(indice)) {
			this.datos.set(indice, dato);
		}else {
			System.out.println("Fuera del rango");
		}
	}
	public void limpiar(T dato) {
		for (int i = 0; i < this.tamanio; i++) {
			this.datos.set(i, dato);
		}
	}
	public String toString() {
		String estado = "______________"+this.tamanio+"______________\n";
		for (T dato:datos){
			if(dato!=null) {
				estado += dato.toString()+"\n";
			}
		}
		return estado;
	}
}
