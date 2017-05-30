package ejerc1;

import java.util.ArrayList;

public class Receta 
{
	private int personas=4;
	private String autor;
	private String nombre;
	private ArrayList<Ingredientes> ingredientes = new ArrayList();
	private String preparacion;
	
	public Receta(String nombre) {
		this.nombre = nombre;
	}

	public Receta(String nombre, ArrayList<Ingredientes> ingredientes, String preparacion, int personas, String autor) {
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.preparacion = preparacion;
		this.personas = personas;
		this.autor = autor;
	}

	public ArrayList<Ingredientes> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}
	
	/*public void recetaPara (int personas)
	{
		float factor=this.per 
	}*/
}
