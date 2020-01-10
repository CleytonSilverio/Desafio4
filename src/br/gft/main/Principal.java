package br.gft.main;

import java.util.ArrayList;

import br.gft.model.Livro;
import br.gft.model.Loja;
import br.gft.model.VideoGame;

public class Principal {

	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.setNome("Harry Potter");
		l1.setAutor("J. K. Rowling");
		l1.setPreco(40);
		l1.setQuantidade(50);
		l1.setQtdPagina(300);
		l1.setTema("Fantasia");
		Livro l2 = new Livro();
		l2.setNome("Senhor dos Aneis");
		l2.setAutor("J. R. R. Tolkien");
		l2.setPreco(60);
		l2.setQuantidade(30);
		l2.setQtdPagina(500);
		l2.setTema("Fantasia");
		Livro l3 = new Livro();
		l3.setNome("Java POO");
		l3.setAutor("GFT");
		l3.setPreco(20);
		l3.setQuantidade(50);
		l3.setQtdPagina(500);
		l3.setTema("Educativo");
		
		ArrayList<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		VideoGame vg = new VideoGame();
		vg.setNome("PS4");
		vg.setMarca("Sony");
		vg.setModelo("Slim");
		vg.setPreco(1800);
		vg.setQuantidade(100);
		vg.setUsado(false);
		
		VideoGame vg2 = new VideoGame();
		vg2.setNome("PS4");
		vg2.setMarca("Sony");
		vg2.setModelo("Slim");
		vg2.setPreco(1000);
		vg2.setQuantidade(7);
		vg2.setUsado(true);
		
		VideoGame vg3 = new VideoGame();
		vg3.setNome("Xbox");
		vg3.setMarca("Microsoft");
		vg3.setModelo("One");
		vg3.setPreco(1500);
		vg3.setQuantidade(500);
		vg3.setUsado(false);
		
		ArrayList<VideoGame> games = new ArrayList<>();
		games.add(vg);
		games.add(vg2);
		games.add(vg3);

		Loja lj = new Loja();
		lj.setNome("Americanas");
		lj.setCnpj("123456789");
		
		new Loja().calculoimp(games, livros);
	
		new Loja().listarVideoGames(games);
		
		new Loja().listarLivros(livros);
		
		new Loja().calculoPatrimonio(games, livros, lj);
		
	}

}
