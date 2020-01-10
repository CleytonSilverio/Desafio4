package br.gft.model;

import br.gft.interfaces.CalculaImposto;

public abstract class Produto implements CalculaImposto{
	
	protected String nome;
	protected double preco;
	protected int quantidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
