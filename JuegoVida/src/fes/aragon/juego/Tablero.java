package fes.aragon.juego;

public class Tablero {

	private boolean[][] tabla = new boolean[10][10];
	private boolean[][] temp = new boolean[10][10];
	private boolean cel;
	private int fila;
	private int columna;
	private int filaMaxima = 9;
	private int columnaMaxima = 9;

	public Tablero() {

	}

	public Tablero(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}

	public void setCasillas(int filas, int columnas, boolean temp) {
		tabla[filas][columnas] = temp;
	}

	public boolean getTablero(int fila, int columna) {
		return this.tabla[fila][columna];
	}

	public boolean validacion(int filas, int columnas) {
		return !(filas < 0 || filas >= 9 || columnas < 0 || columnas >= 9);
	}

	public void mostrarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				boolean temp = tabla[i][j];
				if (temp == false) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
			}
			System.out.println("");
		}
	}

	public int vecinosvivos(int filas, int columnas) {
		int celulaViva = 0;
		if (validacion(filas - 1, columnas - 1) && tabla[filas - 1][columnas - 1]) {
			celulaViva++;

		}
		if (validacion(filas - 1, columnas) && tabla[filas - 1][columnas]) {
			celulaViva++;
		}
		if (validacion(filas - 1, columnas + 1) && tabla[filas - 1][columnas + 1]) {
			celulaViva++;
		}
		if (validacion(filas, columnas - 1) && tabla[filas][columnas - 1]) {
			celulaViva++;
		}
		if (validacion(filas, columnas + 1) && tabla[filas][columnas + 1]) {
			celulaViva++;
		}
		if (validacion(filas + 1, columnas - 1) && tabla[filas + 1][columnas - 1]) {
			celulaViva++;
		}
		if (validacion(filas + 1, columnas) && tabla[filas + 1][columnas]) {
			celulaViva++;
		}
		if (validacion(filas + 1, columnas + 1) && tabla[filas + 1][columnas + 1]) {
			celulaViva++;
		}
		return celulaViva;
	}

	public void verificacionCelula() {
		for (fila = 0; fila < this.filaMaxima; fila++) {
			for (columna = 0; columna < this.columnaMaxima; columna++) {
				int celNueva = vecinosvivos(fila, columna);

				if (tabla[columna][fila] == true && celNueva <= 1) {
					temp[columna][fila] = false;
				} else if (tabla[columna][fila] == true && celNueva >= 4) {
					temp[columna][fila] = false;
				} else if (tabla[columna][fila] == true && celNueva == 2) {
					temp[columna][fila] = true;
				} else if (tabla[columna][fila] == true && celNueva == 3) {
					temp[columna][fila] = true;
				} else if (tabla[columna][fila] == false && celNueva == 3) {
					temp[columna][fila] = true;
				}
			}
		}
		for (fila = 0; fila < this.filaMaxima; fila++) {
			for (columna = 0; columna < this.columnaMaxima; columna++) {
				tabla[columna][fila] = temp[columna][fila];
			}
		}
	}

	public int getColumnaI(int col) {
		int temp;
		int columnaMaxima = this.columnaMaxima;
		if (col == 0) {
			temp = columnaMaxima;
		} else {
			temp = col - 1;
		}
		return (temp);
	}

	public int getColumnaD(int col) {
		int temp;
		int columnaMaxima = this.columnaMaxima;
		if (col == columnaMaxima) {
			temp = 0;
		} else {
			temp = col + 1;
		}
		return (temp);
	}

	public int getFilaS(int fila) {
		int filaMaxima = this.filaMaxima;
		int temp;
		if (fila == 0) {
			temp = filaMaxima;
		} else {
			temp = fila - 1;
		}
		return (temp);
	}

	public int getFilaI(int fila) {
		int filaMaxima = this.filaMaxima;
		int temp;
		if (fila == filaMaxima) {
			temp = 0;
		} else {
			temp = fila + 1;
		}
		return (temp);
	}

	public void genSig() {

		temp = tabla;
		for (int fila = 0; fila < 10; fila++) {
			for (int columnas = 0; columnas < 10; columnas++) {
				if (tabla[fila][columnas]) {
					if (vecinosvivos(fila, columnas) != 2 && vecinosvivos(fila, columnas) != 3) {
						temp[fila][columnas] = false;
						
					} else {
						
					}
				} else {
					if (vecinosvivos(fila, columnas) == 3) {
						temp[fila][columnas] = true;
					}
				}
			}

		}
		tabla = temp;
	}
}
