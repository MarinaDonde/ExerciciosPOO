package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	
	List<Livro> livros = new ArrayList<Livro>();
	List<VideoGame> videoGames = new ArrayList<VideoGame>();
	
	public Loja() {
		
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

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

	public List<Livro> getLivros() {
		return livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}
	
	public void listaLivros() {
		if (livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque");
		} else {
			System.out.println("A loja " + getNome() + " possui estes livros para venda:");
			for (Livro l : livros) {
				System.out.println(l);
			}
		}
	}
	
	public void listaVideoGames() {
		if (videoGames.isEmpty()) {
			System.out.println("A loja não tem vídeo-games no seu estoque");
		} else {
			System.out.println("A loja " + getNome() + " possui estes video-games para venda:");
			for (VideoGame vg : videoGames) {
				System.out.println(vg);
			}
		}
	}

	public double calculaPatrimonio() {
		double patrimonio = 0;
		List<Livro> livros = getLivros();
		List<VideoGame> games = getVideoGames();
		
		for (Livro l : livros) {
			patrimonio += l.getPreco() * l.getQtd();
		}
		
		for (VideoGame vg : videoGames) {
			patrimonio += vg.getPreco() * vg.getQtd();
		}
		
		System.out.print("O patrimonio da loja: " + getNome() + " é de R$ ");		
		return patrimonio;
	}
	
}
