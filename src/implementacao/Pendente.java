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
		System.out.println("A ordem não está paga, porém os pedidos da ordem estão reservados");
		System.out.println("------------------------------------------------------------------");
	}

}
