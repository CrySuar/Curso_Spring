package com.utxicotepec.core.modelo;

import java.util.Date;

public class Alumnos {
	private String matricula;
	private String nombre;
	private String carrera;
	private String img;
	private Date fecha;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Alumnos(String matricula, String nombre, String carrera, String img, Date fecha) {
		
		this.matricula = matricula;
		this.nombre = nombre;
		this.carrera = carrera;
		this.img = img;
		this.fecha = fecha;
	}
	public Alumnos() {
		
	}
	
}
