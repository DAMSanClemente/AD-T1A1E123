
import java.io.*;
public class Producto implements Serializable{
	
	private int id;
	private String nome;
	private double prezo;
	
	
	public Producto(){
		
		
	}

	public Producto(int ide,String nombre, double precio){
		this.id= ide;
		this.nome=nombre;
		this.prezo=precio;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezo() {
		return prezo;
	}

	public void setPrezo(double prezo) {
		this.prezo = prezo;
	}
	
	
}
