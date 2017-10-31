package implementacao;

public class Pago implements Estado{

	@Override
	public boolean estaPago() {
		return true;
	}

	@Override
	public boolean reservadoNoEstoque() {
		return false;
	}

	@Override
	public void imprimirDadosDaOrdem() {
		System.out.println("A ordem está paga, e os pedidos da ordem estão separados para entrega");
		System.out.println("---------------------------------------------------------------------");
	}

}
