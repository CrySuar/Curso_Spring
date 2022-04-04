package com.utxicotepec.core.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utxicotepec.core.modelo.Alumnos;
import com.utxicotepec.core.modelo.Ofertas;
import com.utxicotepec.core.modelo.Productos;

@Controller
public class home {
	
	
	public List<Ofertas> getOfertas(){
		ArrayList<Ofertas> ofe = new ArrayList<>();
		ofe.add(new Ofertas("Coca Cola", "10", "Caduca en una semana del 8 de marzo", "imagen.png", 10));
		ofe.add(new Ofertas("Barritas Marinela", "12", "Oferta por fin de mes", "imagen2.png", 12));
		ofe.add(new Ofertas("Galletas Marias", "5", "Oferta, 15 pesos por 3 empaques de galletas y le sale a 5 pesos", "imagen3.png", 5));
		return ofe;
	}
	
	public List<Alumnos> getAlumnos(){
		ArrayList<Alumnos> alumno=new ArrayList<>();
		alumno.add(new Alumnos("454514","Lolita Gomez",
				"Desarrollo de Software Multiplataforma","/imagenes/454514.jpeg", new Date()));
		alumno.add(new Alumnos("454513","Stefany Garcia",
				"Entornos Visuales","/imagenes/454513.jpeg", new Date()));
		alumno.add(new Alumnos("454512","Romeo Juarez",
				"Gastronomia","/imagenes/454512.jpg", new Date()));

		return alumno;
		}
	
	public List<Productos> getProductos(){
		ArrayList<Productos> producto = new ArrayList<>();
			producto.add(new Productos("clave", "nombre", "descripcion", "existencia", "precio", "unidad", "/imagenes/imagen.jpg", 23));
			producto.add(new Productos("2003", "Sabritas", "Papas En diabladas", "Expira Mañana", "23", "20 Boldad", "/imagenes/imagen2.jpeg", 23));
			producto.add(new Productos("2541", "Galletas Principe", "Galletas de Chocolate", "Caduca Pasado Mañana", "15", "3 paquetes de galletas", "/imagenes/imagen3.jpg", 15));
		return producto;
	}
	
	@GetMapping(path={"/"})
	public String bienvenida() {
		return "index";
	}
	@GetMapping(path={"/menu"})
	public String laravel() {
		return "laravel";
	}
	
	
	@GetMapping(path= {"/home"})
	public String home(Model model) {
		model.addAttribute("alumnos",this.getAlumnos());
		return "laravel";
	}
	@GetMapping(path={"/productos"})
	public String productos(Model model) {
		model.addAttribute("producto", this.getProductos());
		return "productos";
	}
	@GetMapping(path={"/login"})
	public String login() {
		return "login";
	}
	
	@GetMapping(path= {"/mision"})
	public String misi() {
		return "mivior";
	}
	
	@GetMapping(path= {"/oferta"})
	public String ofert (Model model) {
		model.addAttribute("ofertasss", this.getOfertas());
		return "ofertasos";
	}
	
	@GetMapping(path= {"/clien"})
	public String cliente() {
		return "Clients";
	}
	
}