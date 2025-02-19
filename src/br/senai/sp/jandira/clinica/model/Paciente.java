package br.senai.sp.jandira.clinica.model;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Paciente {
	
	public String nome; 
	public LocalDate dataNascimento;
	public double peso;
	public double altura;
	public String telefone;
	public boolean estaInternado;
	
	
	
	void calcularIdade() {
		
	}
	
    public void calcularImc() {
    	
    }
    
    public void classificarImc() {
    	
    }
    
    public void mostrarFichaPaciente() {
    	
    	System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("Data nasc.: " + dataNascimento);
		System.out.println("Altura:" + altura);
		System.out.println("Dia Nasc.:" + obterDiaSemanaNascimento());
		System.out.println("internado:" + estaInternado);
		System.out.println("Telefone:" + telefone);
		System.out.println("-------------------------");
    	
    }
    
    private String obterDiaSemanaNascimento() {
    	String diaSemana = dataNascimento.getDayOfWeek().toString();
    	return diaSemana;
    	
}
}