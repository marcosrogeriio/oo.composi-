package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente ="Marcos Rogerio";
		compra1.adicionarItem(new Item("Caneta", 24, 2.4));
		compra1.adicionarItem(new Item("Caderno", 3, 7.4));
		compra1.adicionarItem(new Item("Boracha", 4, 9.4));
		
		System.out.println(compra1.itens);
		System.out.println(compra1.obterValorTotal());
		
		
		double total = compra1.itens.get(0).compra.
		itens.get(1).compra.obterValorTotal();	
		System.out.println("O total é " + total);
		}
}
