package implementacao;

public class Cancelado implements Estado{

	@Override
	public boolean estaPago() {
		return false;
	}

	@Override
	public boolean reservadoNoEstoque() {
		return false;
	}

	@Override
	public void imprimirDadosDaOrdem() {
		System.out.println("A ordem não está paga, e não há nenhum produto reservado pois a mesma foi cancelada");
		System.out.println("-----------------------------------------------------------------------------------");
	}

}
