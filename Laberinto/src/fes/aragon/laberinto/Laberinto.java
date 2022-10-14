package fes.aragon.laberinto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Laberinto {
	ArrayList<ArrayList<String>> informacion = new ArrayList();
	Arreglo2D<String> matriz;
	int tam = 0;
	int ren, col;
	String LineasL = "";
	String[] lineas;
	String[] tamlis;
	private Pila solucion;

	public Laberinto(File path) {
		leer(path);
	}

	public Arreglo2D<String> leer(File path) {
		try {
			BufferedReader lector = new BufferedReader(new FileReader(path));
			String linea;

			while ((linea = lector.readLine()) != null) {
				lineas = linea.split(",");
				tamlis = linea.split("\n");
				tam += tamlis.length; //
				ArrayList<String> InnerArray = new ArrayList();
				for (String datos : lineas) {
					InnerArray.add(datos);
				}
				informacion.add(InnerArray);
			}

			ren = Integer.parseInt(informacion.get(0).get(0));
			col = Integer.parseInt(informacion.get(1).get(0));
			matriz = new Arreglo2D(ren, col);
			int numRen = 0;
			while (numRen < ren) {
				int numcol = 0;
				int numren = numRen + 2;
				while (numcol < col) {
					matriz.setElemento(numren, numcol, informacion.get(numren).get(numcol));
					numcol += 1;
				}
				numRen += 1;
			}
			int a = 0;
			while (a < ren) {
				int b = 0;
				int c = a + 2;
				while (b < col) {
					if ("0".equals(informacion.get(c).get(b))) {
						matriz.setElemento(a, b, " ");
					} else if ("1".equals(informacion.get(c).get(b))) {
						matriz.setElemento(a, b, "+");
					}
					b += 1;
				}
				a += 1;
			}
			int entrada = tam - 2;
			int salida = tam - 1;
			int eren = Integer.parseInt(informacion.get(entrada).get(0).replaceAll("\"", ""));
			int ecol = Integer.parseInt(informacion.get(entrada).get(1).replaceAll("\"", ""));
			int sren = Integer.parseInt(informacion.get(salida).get(0).replaceAll("\"", ""));
			int scol = Integer.parseInt(informacion.get(salida).get(1).replaceAll("\"", ""));
			matriz.setElemento(eren, ecol, "E");
			matriz.setElemento(scol, sren, "S");
		} catch (IOException ex) {
		}
		return matriz;
	}

	public Pila camino(int x, int y) {
		solucion = new Pila();
		solucion.push(x + "," + y);
		if (this.matriz.getElemento(x, y) == "S") {

		} else if (comprobacion(x, y - 1) && " ".equals(matriz.getElemento(x, y - 1))) {

			solucion.push(x + "," + (y - 1));

		} else if (comprobacion(x - 1, y) && " ".equals(matriz.getElemento(x - 1, y))) { 
																							
			solucion.push((x - 1) + "," + y);

		} else if (comprobacion(x, y + 1) && " ".equals(matriz.getElemento(x, y + 1))) {
			solucion.push(x + "," + (y + 1));
			
		} else if (comprobacion(x + 1, y) && " ".equals(matriz.getElemento(x + 1, y))) {
			solucion.push((x + 1) + "," + y);

		} else {
			System.out.println(" ");
		}
		System.out.println(solucion);

		return solucion;
	}
	public boolean comprobacion(int x, int y) {
		return (x >= 0 && x <= ren) && (y >= 0 && y <= col);
	}
	
	/* 
	
	public Pila resolver(int x, int y) {

        int x2 = x;
        int y2 = y;
        String visitado = "~";
        solucion = new Pila();

        while (matriz.getElemento(x2, y2) != "S") {
            solucion.push(x + "," + y);
            if ("S".equals(matriz.getElemento(x, y))) {
                x2 = x;
                y2 = y;
                matriz.setElemento(x2, y2, "S");

            } else if (comprobacion(x, y - 1) && (" ".equals(matriz.getElemento(x, y - 1)) || "S".equals(matriz.getElemento(x, y - 1)))) {//izquierda
                if (" ".equals(matriz.getElemento(x, y - 1))) {
                    solucion.push(x + "," + (y - 1));
                    matriz.setElemento(x, y - 1, visitado);
                    x2 = x;
                    y2 = y - 1;
                } else {
                    x2 = ren;
                    y2 = col;
                }

            } else if (comprobacion(x - 1, y) && (" ".equals(matriz.getElemento(x - 1, y)) || "S".equals(matriz.getElemento(x - 1, y)))) { 
                if (" ".equals(matriz.getElemento(x - 1, y))) {
                    solucion.push((x - 1) + "," + y);
                    matriz.setElemento(x - 1, y, visitado);
                    x2 = x - 1;
                    y2 = y;
                   
                } else {
                    x2 = ren;
                    y2 = col;
                }

            } else if (comprobacion(x, y + 1) && (" ".equals(matriz.getElemento(x, y + 1)) || "S".equals(matriz.getElemento(x, y + 1)))) {
                if (" ".equals(matriz.getElemento(x, y + 1))) {
                    solucion.push(x + "," + (y + 1));
                    matriz.setElemento(x, y + 1, visitado);
                    x2 = x;
                    y2 = y + 1;
                } else {
                    x2 = ren;
                    y2 = col;
                }

            } else if (comprobacion(x + 1, y) && (" ".equals(matriz.getElemento(x + 1, y)) || "S".equals(matriz.getElemento(x + 1, y)))) {
                //abajo
                if (" ".equals(matriz.getElemento(x + 1, y))) {
                    solucion.push((x + 1) + "," + y);
                    matriz.setElemento(x + 1, y, visitado);
                    x2 = x + 1;
                    y2 = y;
                } else {
                    x2 = ren;
                    y2 = col;
                    }
                }else if (comprobacion(x + 1, y) && (visitado.equals(matriz.getElemento(x + 1, y)))) {//no puede avanzar a la derecha
                if (" ".equals(matriz.getElemento(x + 1, y))) {
                    solucion.push((x + 1) + "," + y);
                    matriz.setElemento(x + 1, y, visitado);
                    x2 = x + 1;
                    y2 = y;
                } else {
                    x2 = ren;
                    y2 = col;
                }

            } else {
                solucion.pop();
                matriz.setElemento(x, y, "#");
            }
            x = x2;
            y = y2;
            System.out.println(matriz);
            System.out.println(solucion);

        }

        return solucion;

    }
	*/
	@Override
	public String toString() {
		return matriz.toString();
	}
}
