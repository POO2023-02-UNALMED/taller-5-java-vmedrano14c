package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona() {
		this.nombre = null;
		this.zoo = null;
		this.animales = new ArrayList<Animal>();
	}

	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = new ArrayList<Animal>();
	}

	public int cantidadAnimales() {
        int cantidadAnimales = 0;
        for (Animal animal : animales){
            cantidadAnimales += 1;
        }
		return cantidadAnimales;
	}

	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	
}
