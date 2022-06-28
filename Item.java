package oo.composicao;

public class Item {
	String nome;
	int quantidade;
	double preco;
	Compra compra;
	public Object produto;
	
	Item(String nome, int quantidade, double preco){
	this.nome = nome;
	this.quantidade = quantidade;
	this.preco = preco;
	}

	public Item(Produto p, int qtde) {
		// TODO Auto-generated constructor stub
	}
}
