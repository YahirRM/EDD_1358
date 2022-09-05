package fes.aragon.tarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NominaADT {

    int tam = 0;
    String lineasL = "";
    ArrayList<ArrayList<String>> array2 = new ArrayList();
    ArregloADT nomina;
    String[] lineas;
    String[] tamanio;
    Trabajador trabajador;

    public  NominaADT(File Arch) {
        try {

            BufferedReader lectura = new BufferedReader(new FileReader(Arch));
            String leer;

            while ((leer = lectura.readLine()) != null){
                lineas = leer.split(",");
                tamanio = leer.split("\n");
                tam += tamanio.length;
                ArrayList<String> array = new ArrayList();
                for (String datos : lineas){
                    array.add(datos);
                }
                array2.add(array);
            }

            nomina = new ArregloADT(tam - 1);
            int col = 0;
            for (int fila = 1; fila < array2.size(); fila++){
                trabajador = new Trabajador(Integer.parseInt(array2.get(fila).get(0)), array2.get(fila).get(1), array2.get(fila).get(2), array2.get(fila).get(3), Integer.parseInt(array2.get(fila).get(4)), Integer.parseInt(array2.get(fila).get(5)), Integer.parseInt(array2.get(fila).get(6)));
                nomina.setElemento(trabajador, col);
                col++;
            }
        } 
        catch (IOException ex){
        }
    }
    public void listarSueldos() {
        for (int tamanio = 0; tamanio < nomina.getLongitud(); tamanio++){
            Trabajador t;
            t = (Trabajador) nomina.getElemento(tamanio);
            System.out.println("Id: " + t.getNumeroTrabajador() + ", Sueldo: " + t.calcularSueldo());
            
        }
    }
    public void menorAntigueadad() {
        int mayor = 2023;
        for(int index=0; index < nomina.getLongitud(); index++){
            Trabajador t;
            t = (Trabajador) nomina.getElemento(index);
            if(t.getAnioIngreso() < mayor){
                int indice = index;
                mayor = t.getAnioIngreso();
        System.out.println("El empleado con menor antiguedad:" + nomina.getElemento(indice));    
            }
        }
    }
    public void mayorAntigueadad() {
        int mayor = 2023;
        for(int index=0; index > nomina.getLongitud(); index++){
            Trabajador t;
            t = (Trabajador) nomina.getElemento(index);
            if(t.getAnioIngreso() > mayor){
                int indice = index;
                mayor = t.getAnioIngreso();
        System.out.println("El empleado con mayor antiguedad:" + nomina.getElemento(indice));    
            }
        }
    }

}
