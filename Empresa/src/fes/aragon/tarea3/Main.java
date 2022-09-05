package fes.aragon.tarea3;

import java.io.File;

public class Main {
	
	public static void main(String[] args) {
		File Arch = new File("C:\\Users\\Liliana\\Downloads\\junio.dat");
        NominaADT pruebanom = new NominaADT(Arch);
        
        pruebanom.listarSueldos();
        pruebanom.mayorAntigueadad();
        pruebanom.menorAntigueadad();
	}

}
