package br.com.eicon.curso;

import java.util.Scanner;

public class InformaMes {

	public static void main(String[] args) {

		int mes;
		String retornoMes;
		Scanner inMes = new Scanner(System.in);
		
		System.out.println("Infomorme numero equivalente ao mes:");
		mes = inMes.nextInt();
	    
		Mes getMes = new Mes();
	    retornoMes = getMes.mesPorExtenso(mes);
	    
	    System.out.println(retornoMes);
		
		
		
		
		inMes.close();
	}

}
