package com.utxicotepec.core.modelo;

public class Productos {
public String Clave,Nombre,Descripcion,Existencia,Precio,Unidad,Imagen;

public double precios;
public Productos(String clave, String nombre, String descripcion, String existencia, String precio, String unidad,
		String imagen, double precios) {
	super();
	Clave = clave;
	Nombre = nombre;
	Descripcion = descripcion;
	Existencia = existencia;
	Precio = precio;
	Unidad = unidad;
	Imagen = imagen;
	this.precios = precios;
}



public Productos() {
}



public String getClave() {
	return Clave;
}
public void setClave(String clave) {
	Clave = clave;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getDescripcion() {
	return Descripcion;
}
public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
}
public String getExistencia() {
	return Existencia;
}
public void setExistencia(String existencia) {
	Existencia = existencia;
}
public String getPrecio() {
	return Precio;
}
public void setPrecio(String precio) {
	Precio = precio;
}
public String getUnidad() {
	return Unidad;
}
public void setUnidad(String unidad) {
	Unidad = unidad;
}
public String getImagen() {
	return Imagen;
}
public void setImagen(String imagen) {
	Imagen = imagen;
}
public double getPrecios() {
	return precios;
}
public void setPrecios(double precios) {
	this.precios = precios;
}

}
