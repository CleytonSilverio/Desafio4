package br.gft.model;

public class Livro extends Produto{

	private String autor;
	private String tema;
	private int qtdPagina;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPagina() {
		return qtdPagina;
	}
	public void setQtdPagina(int qtdPagina) {
		this.qtdPagina = qtdPagina;
	}
	
	public String toString(){
			return "Titulo: " + nome +", Pre�o: R$" + preco + ", Quantidade: " + quantidade + " Em estoque"  ;
	
    }
	@Override
	public double calculoImposto() {
		double imposto;
		if(tema != "Educativo") {
			imposto = preco * 0.10;
			System.out.println("O imposto de: " + nome + ",� de: R$" + imposto);
		}
		if(tema == "Educativo") {
			System.out.println("Livros educativos n�o possuem impostos! :)");
		}
		return 0;
	}
	
	
	
}
