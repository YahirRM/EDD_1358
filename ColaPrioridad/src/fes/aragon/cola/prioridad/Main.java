package fes.aragon.cola.prioridad;

public class Main {
	public static void main(String[] args) {
		
		//Cola normal 
		Cola colita = new Cola();
		System.out.println(colita.estaVacia());
		System.out.println(colita.longitud());
		colita.insertar(5);
		colita.insertar(6);
		colita.insertar(2);
		System.out.println(colita);
		System.out.println(colita.estaVacia());
		System.out.println(colita.longitud());
		colita.extraer();
		System.out.println(colita);
		System.out.println(colita.estaVacia());
		System.out.println(colita.longitud());
		
		//Cola con prioridad 
		
		BoundedPriorityQueue cp = new BoundedPriorityQueue(7);
		System.out.println("\n----------------");
		
		cp.insertar(4, "Maestra");
		cp.insertar(2, "Niños");
		cp.insertar(4, "Mecanicos");
		cp.insertar(3, "Mujeres");
		cp.insertar(2, "Tercera Edad");
		cp.insertar(1, "Niños");
		cp.insertar(3, "Hombres");
		cp.insertar(4, "Vígia");
		cp.insertar(5, "Capitan");
		cp.insertar(4, "Timonel");
		System.out.println(cp);
		System.out.println(cp.longitud());
		System.out.println(cp.estaVacia());
		
		
		
		
	}

}
