package ExerciciosConta1;

import java.time.LocalDate;

public class Conta1 {
	
	int numeroDaConta;
	int numeroDaAgencia;
	String nomeCliente;
	LocalDate dataNascimento;
	double saldoConta;
	
	boolean sacarValor(double valor) {
		return true;
	}

	boolean transferirParaOutraConta(int numeroDaConta, int numeroDaAgencia, double valor) {
		return true;
	}
	
	boolean cancelarContaComJustificativa(int numeroDaConta, int numeroDaAgencia, String justificativa) {
		return true;
	}
	
	String consultarExtratoEntreDuasDatas(LocalDate dataX, LocalDate dataY) {
		return "meu extrato" + dataX + " e " + dataY; 
	}
	
	double saldoAtual() {
		return saldoConta;
	}
}

