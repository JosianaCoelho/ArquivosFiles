package ExercíciosConta2;

import java.time.LocalDate;

public class Conta2 {

	int numeroConta;
	int numeroAgencia;
	String nomeCliente;
	LocalDate dataNascimento;
	double saldoConta;
	
	void sacarValor(double valorSaque) {
		saldoConta = saldoConta - valorSaque;
	}
	
	 boolean transferirParaOutraConta(Conta2 outra, double valor) {
		if(valor <= saldoConta) {
			sacarValor(valor);
			outra.depositar(valor);
			return true;
		}
		 return false;
	}
	
	void depositar(double valor) {
		saldoConta = saldoConta + valor;
	}

	void cancelarContaComJustificativa() {
		
	}
	
	void consultarExtratoEntreDuasDatas() {
		
	}
	
	double consultarSaldoAtual() {
		return saldoConta;
	}
}

