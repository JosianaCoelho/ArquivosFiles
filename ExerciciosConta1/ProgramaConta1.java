package ExerciciosConta1;

public class ProgramaConta1 {

	public static void main(String[] args) {
		
		Conta1 c1 = new Conta1();
		
		c1.sacarValor(100);
		c1.transferirParaOutraConta(222, 333, 200);
		c1.cancelarContaComJustificativa(222, 333, "motivos pessoais");
//		c1.consultarExtratoEntreDuasDatas("29/09/2022","30/09/2002");
		c1.saldoAtual();
		
		System.out.println(c1);
	}

}
