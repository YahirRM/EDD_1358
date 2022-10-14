package fes.aragon.laberinto;

import java.util.ArrayList;

public class Pila <T>{
	
	private ArrayList<T> stack;
    private T top, base;
    private int tam;

    public Pila() {
        stack = new ArrayList<T>(this.tam);
        top = null;
        base = null;
        tam = 0;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public T getTop(){
        return this.top;
    }
    
    public int lenght() {
        return this.tam;
    }
    
    public void pop(){
        if (isEmpty()){
            System.out.println("No hay valores disponibles");
        } else{
            System.out.println("El tope es: " + top);
            stack.remove(stack. get(stack. size()-1));
            top = stack. get(stack. size()-1);
            
        }
    }
    
    public T peek(){
        return stack. get(stack. size()-1);
    }
    
    public void push(T value){
        stack.add(value);
        if (isEmpty()){
            this.base = value;
            this.top = base;
        }else{
             top = stack. get(stack. size()-1);
        }
    }
    
    @Override
    public String toString(){
        String estado = "";
        
        for(T elemento : stack){
            if(elemento != null){
                
                estado += "\n "+elemento.toString();
            }
        }
        return estado;
    }
}
