package br.senai.sp.jandira.clinica.model;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Paciente {
	
	public String nome; 
	public LocalDate dataNascimento;
	private double peso;
	private double altura;
	public String telefone;
	public boolean estaInternado;
	private double imc;
	
	public void setAltura(double altura) {
		 
		 if(altura > 0) {
			//true
			 this.altura = altura;
		 } 
		 else {
			 //false
			 System.out.println("A altura do(a) paciente" + nome + " está incorreta!");
		 }
			 
			 }
	public void setPeso(double peso) {
		
		if (peso >= 40) {
			this.peso = peso;
			//true
			System.out.println("peso não foi atribuido com suecsso.");
		}
		else {
			//false
			System.out.println("o peso da paciente " + nome + "não foi atribuido.");
			
		}
	}
		 
	
		
	
	void calcularIdade() {
		
	}
	
    public void calcularImc() {
    	imc = peso / Math.pow(altura, altura); 
    	
    }
    
    public void classificarImc() {
    	
    }
    
    public void mostrarFichaPaciente() {
    	
    	calcularImc();
    	System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("Data nasc.: " + dataNascimento);
		System.out.println("Altura:" + altura);
		System.out.println("imc :" + imc);
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