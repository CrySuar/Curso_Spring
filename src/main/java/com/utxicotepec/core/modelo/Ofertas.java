package com.utxicotepec.core.modelo;

public class Ofertas {
	
	public Ofertas() {
	}

	private String Nombre,Oferta, Descripcion, Imagen;private double ofertass;
	
public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getOferta() {
		return Oferta;
	}
	public void setOferta(String oferta) {
		Oferta = oferta;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getImagen() {
		return Imagen;
	}
	public void setImagen(String imagen) {
		Imagen = imagen;
	}
	public double getOfertass() {
		return ofertass;
	}
	public void setOfertass(double ofertass) {
		this.ofertass = ofertass;
	}

public Ofertas(String nombre, String oferta, String descripcion, String imagen, double ofertass) {
	super();
	Nombre = nombre;
	Oferta = oferta;
	Descripcion = descripcion;
	Imagen = imagen;
	this.ofertass = ofertass;
}

}
