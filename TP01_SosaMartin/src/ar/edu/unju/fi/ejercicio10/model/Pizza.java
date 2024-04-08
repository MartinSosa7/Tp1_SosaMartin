package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	private Integer diametro;
	private Integer price;
	private Float area;
	private boolean ingredientesEspeciales;
	static final Integer add20 = 500;
	static final Integer add30 = 750;
	static final Integer add40 = 100;
	
	public Pizza() {}

	public Integer getDiametro() {
		return diametro;
	}

	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Float getArea() {
		return area;
	}

	public void setArea(Float area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	public Integer calcularPrecio() {
		switch (this.diametro) {
			case 20: {
				if(this.ingredientesEspeciales == true)
					return 4500 + add20;
				return 4500;
			}
			case 30:{
				if(this.ingredientesEspeciales == true)
					return 4800 + add30;
				return 4800;
			}
			case 40:{
				if(this.ingredientesEspeciales == true)
					return 5500 + add40;
				return 5500;
			}
		}
		return 0;
	}
	
	public void calcularArea() {
		
		this.area = (float)((Math.pow(this.diametro,2))*Math.PI)/4;
		this.price = calcularPrecio();
	}
	
	
}
