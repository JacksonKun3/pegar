package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
//vai imprimir o status em forma de string  conforme o nome que dei ali, entao por padra no java
		// ele vai transformar o enum para string conforme está escrito no enum
		System.out.println(pedido);
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		System.out.println(os1);
		System.out.println(os2);
	}

}
