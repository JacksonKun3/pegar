package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO); 
		/* vai imprimir o Order.Status.AGUARDANDO_PAGAMENTO em forma de string, sendo que era do tipo enum*/
		System.out.println(pedido);//imprimir o toString
		
		//duas formas para transformar um enum numa string
		OrderStatus os1 = OrderStatus.ENTREGUE;/*estanciou o objeto os1 do tipo OrderStatus com o 
		valor Order.Status.ENTREGUE,estanciando eu consigo pegar o valor, no caso pegar a string e transformar
		ela para enum*/
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		System.out.println(os1);
		System.out.println(os2);
	}

}
