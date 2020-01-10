package br.gft.model;

public class VideoGame extends Produto{
	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	
	public String toString(){
		return "VideGame: " + modelo +", Preço: R$" + preco + ", Quantidade: " + quantidade + " Em estoque"  ;

}
	
	
	@Override
	public double calculoImposto() {
		double imposto;
		if(isUsado == false) {
			imposto = preco * 0.40;
			System.out.println("O videogame: " + modelo + ", tem de impostos: " + imposto);
		}
		if(isUsado == true) {
			imposto = preco * 0.25;
			System.out.println("O videogame: " + modelo + ", tem de impostos: " + imposto);
		}
		return 0;
	}
	
	

}
