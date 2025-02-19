/* 
 * desenvolvido por gabriel 
 * 19/02/2025
 * as 15:15 eu fiz essas classes para aprender sobre o eclipse.
 * Senai Jandira
 */

package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		// Criação dosobjetos do tipo paciente
		
			Paciente p1 = new Paciente();
			p1.nome = "Ana MAria";
			p1.peso = 68.200;
			p1.altura = 1.65;
			p1.telefone = "(11) 9888-8888";
			p1.dataNascimento = LocalDate.of(2003, 07, 15);
			p1.estaInternado = true;
			
			Paciente p2 = new Paciente();
			p2.altura = 1.64;
			p2.dataNascimento = LocalDate.of(2008, 6, 8);
			p2.nome = "Gabriel";
			p2.peso = 61.500;
			p2.telefone = "(11) 93466-0839";
			p2.estaInternado = false;
			
			//Mostrar dados dos pacientes
			p1.mostrarFichaPaciente();
			p2.mostrarFichaPaciente();
			
			
	}	
	
}		
		

		
	