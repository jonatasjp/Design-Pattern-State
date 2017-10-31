package implementacao;

public class Pendente implements Estado{

	@Override
	public boolean estaPago() {
		return false;
	}

	@Override
	public boolean reservadoNoEstoque() {
		return true;
	}

	@Override
	public void imprimirDadosDaOrdem() {
		System.out.println("A ordem n�o est� paga, por�m os pedidos da ordem est�o reservados");
		System.out.println("------------------------------------------------------------------");
	}

}
