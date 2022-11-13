package fes.aragon.cola.prioridad;

import java.util.ArrayList;

public class Cola<T> {
	
	private ArrayList cola;
    private int tam;
    private T elemento;

    public Cola() {
        this.cola = new ArrayList();
        this.tam = 0;
    }

    public boolean estaVacia() {
        return this.tam == 0;
    }

    public int longitud() {
        return tam;
    }

    public void insertar(T elem) {
        this.elemento = elem;
        cola.add(elemento);
        tam = this.tam + 1;
    }

    public void extraer() {
        if (!estaVacia()) {
            cola.remove(0);
            tam = this.tam - 1;
        }
    }
    
    @Override
    public String toString() {
        return "" + cola;
    }
}
