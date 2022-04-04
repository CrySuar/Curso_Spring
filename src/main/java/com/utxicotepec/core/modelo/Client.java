package com.utxicotepec.core.modelo;

public class Client {
private String Clave, Nombre, Direccion, Correo, Imagen;

public Client() {
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

public String getDireccion() {
	return Direccion;
}

public void setDireccion(String direccion) {
	Direccion = direccion;
}

public String getCorreo() {
	return Correo;
}

public void setCorreo(String correo) {
	Correo = correo;
}

public String getImagen() {
	return Imagen;
}

public void setImagen(String imagen) {
	Imagen = imagen;
}

public Client(String clave, String nombre, String direccion, String correo, String imagen) {
	
	Clave = clave;
	Nombre = nombre;
	Direccion = direccion;
	Correo = correo;
	Imagen = imagen;
}
}
