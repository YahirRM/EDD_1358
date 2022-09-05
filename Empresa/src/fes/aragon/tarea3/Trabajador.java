package fes.aragon.tarea3;

public class Trabajador {
	private double HORAEXTRA =276.5;
	private int numeroTrabajador;
	private String nombre;
	private String paterno;
	private String materno;
	private int hrsExtra;
	private double sueldoBase;
	private int anioIngreso;
	
	public Trabajador(int nt, String nom, String pat, String mat, int he, double sb, int anio  ) {
		this.HORAEXTRA = 276.5;
		this.numeroTrabajador = nt;
		this.nombre = nom;
		this.paterno = pat;
		this.materno = mat;
		this.hrsExtra = he;
		this.sueldoBase =sb;
		this.anioIngreso = anio;
	}

	public int getNumeroTrabajador() {
		return numeroTrabajador;
	}

	public void setNumeroTrabajador(int nt) {
		this.numeroTrabajador = nt;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String pat) {
		this.paterno = pat;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String mat) {
		this.materno = mat;
	}

	public int getHrsExtra() {
		return hrsExtra;
	}

	public void setHrsExtra(int he) {
		this.hrsExtra = he;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sb) {
		this.sueldoBase = sb;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anio) {
		this.anioIngreso = anio;
	}
	
	public double calcularSueldo() {
		int antiguedad = 2022 - this.anioIngreso;
		double total = this.sueldoBase +(this.sueldoBase*(antiguedad*0.03)) + (this.hrsExtra*this.HORAEXTRA);
		return total;
	}
	
	@Override
	public String toString() {
		return "Trabajador [numeroTrabajador=" + numeroTrabajador + ", nombre=" + nombre + ", paterno=" + paterno
				+ ", materno=" + materno + ", hrsExtra=" + hrsExtra + ", sueldoBase=" + sueldoBase + ", anioIngreso="
				+ anioIngreso + "]";
	}
}
