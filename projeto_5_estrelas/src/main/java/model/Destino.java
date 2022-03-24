package model;

public class Destino {
	
	private int id;
	private String lugar;
	private float valor;

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = Float.parseFloat(valor);
	}
	@Override
	public String toString() {
		return "Destino [id=" + id + ", lugar=" + lugar + ", valor=" + valor + "]";
	}

		
	}
	

