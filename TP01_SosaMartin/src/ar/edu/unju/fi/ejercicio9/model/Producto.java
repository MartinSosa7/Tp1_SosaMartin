package ar.edu.unju.fi.ejercicio9.model;

public class Producto {

	private String name;
	private String code;
	private Float price;
	private Integer discount;
	
	public Producto(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	
	public float calcularDescuento() {
		return ((this.discount * this.price) / 100);
	}
}
