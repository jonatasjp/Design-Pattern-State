package teste;

import java.util.Arrays;

import implementacao.Cancelado;
import implementacao.EntregaExpressa;
import implementacao.ItemPedido;
import implementacao.Ordem;
import implementacao.OrdemAtacado;
import implementacao.Pago;
import implementacao.Pedido;
import implementacao.Pendente;
import implementacao.Produto;

public class Main {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Viol�o", 155.25);
		Produto produto2 = new Produto("Guitarra", 552.75);
		Produto produto3 = new Produto("Bateria", 1255);
		
		ItemPedido item1 = new ItemPedido(produto1, 2);
		ItemPedido item2 = new ItemPedido(produto2, 2);
		ItemPedido item3 = new ItemPedido(produto3, 2);
		
		Pedido pedido = new Pedido();
		pedido.setItensDoPedido(Arrays.asList(item1, item2, item3));
		
		Ordem ordem1 = new OrdemAtacado();
		ordem1.setTipoEntrega(new EntregaExpressa());
		System.out.println(ordem1.calcularTotal(pedido));
		
		ordem1.setEstadoDaOrdem(new Pendente());
		ordem1.imprimirDadosDaOrdem();
		
		ordem1.setEstadoDaOrdem(new Pago());
		ordem1.imprimirDadosDaOrdem();
		
		ordem1.setEstadoDaOrdem(new Cancelado());
		ordem1.imprimirDadosDaOrdem();
	
	}

}
