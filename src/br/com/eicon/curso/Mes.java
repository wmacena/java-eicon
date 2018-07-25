package br.com.eicon.curso;

public class Mes {
	String[] mesPorExtenso = new String[] { "invalido", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
			"Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
	
	boolean  validaMes(int mes) {
		if(mes > 0 && mes <= 12) {
			return true;
		}
		return false;
	}
	
	String mesPorExtenso(int mesNumerico) {
		
		Mes checaMes = new Mes();
		String retornoGeMesPorExtenso ="O mes equivalente ao numero ";
		
		if(checaMes.validaMes(mesNumerico)) {
			retornoGeMesPorExtenso += " " + mesNumerico + " é " + mesPorExtenso[mesNumerico];
		}else {
			retornoGeMesPorExtenso = "Mes digitado Invalido!";
		}
		
		return retornoGeMesPorExtenso;
		
	}
}
