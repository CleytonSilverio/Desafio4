package br.gft.model;

import java.util.List;
import java.util.ArrayList;


public class Loja {
	
	private String nome;
	private String cnpj;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void calculoimp(List<VideoGame> games, List<Livro> livros) {
		int i;
		int n = livros.size();
		for(i=0;i<n;i++) {
			livros.get(i).calculoImposto();
		}
		n = games.size();
		for(i=0;i<n;i++) {
			games.get(i).calculoImposto();
		}
	}
	
	public void listarLivros(ArrayList<Livro> livros) {
		int i;
		int n = livros.size();
		
		System.out.println("-------------------------------------------------------------");
		for(i=0;i<n;i++) {
			System.out.println(livros.get(i));
		}
	}
	
	public void listarVideoGames(ArrayList<VideoGame> games) {
		int k;
		int m = games.size();
		
		System.out.println("-------------------------------------------------------------");
		for(k=0;k<m;k++) {
			System.out.println(games.get(k));
		}
		
	}
	
	public void calculoPatrimonio(List<VideoGame> games, List<Livro> livros, Loja lj) {
		int k;
		int m = games.size();
		double patrimonio=0;
		System.out.println("-------------------------------------------------------------");
		for(k=0;k<m;k++) {
			patrimonio = patrimonio + (games.get(k).getPreco()*games.get(k).getQuantidade()) + (livros.get(k).getPreco()*livros.get(k).getQuantidade());
		}
		System.out.println("O patrimonio da loja: "+ lj.getNome() + " Encontra-se atualmente em: " + patrimonio);
	}

}
