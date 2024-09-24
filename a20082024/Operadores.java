package br.edu.uft.poo.a2024s2.a20082024;

import java.util.Date;

public class Operadores {
	public static void main (String [] args) {
		String nome = "Giovana";
		int idade = 35;
		double peso = 80;
		char sexo = 'F';
		boolean doadorOrgao = false;
		Date dataNascimento = new Date(20-8-2024);
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(peso);
		System.out.println(sexo);
		System.out.println(doadorOrgao);
		System.out.println(dataNascimento);
		
		//operadores aritmeticos
		Double soma = 10.5+15.7;
		int subtração = 113-25;
		int multiplicacao = 20*7;
		int modulo = 18%3;
		double resultado = (10*7)+(20/4);
		
		System.out.println(soma);
		System.out.println(subtração);
		System.out.println(multiplicacao);
		System.out.println(modulo);
		System.out.println(resultado);
		
		String nomeCompleto = "LINGUAGEM"+"JAVA";
		System.out.println(nomeCompleto);
		
		String concatenacao = "1"+(1*1*10);
		System.out.println(concatenacao);
		
		//Operadores unários
		int numero = 5;
		System.out.println(- numero);
		numero ++;
		System.out.println(numero);
		System.out.println(numero++);
		System.out.println(numero);
		System.out.println(++numero);
		boolean verdadeiro = true;
		System.out.println("Inverteu " + !verdadeiro);
		
		//operadores ternarios
		
		int a, b;
		a=5;
		b=5;
		String resultado1;
		
		//usando if else
		if(a==b) 
			resultado1 = "verdadeiro";
		else 
			resultado1 = "falso";
		 System.out.println(resultado1);
		 
		 //usando outra forma (operador condicional ternário)
		 String resultado2 = (a==b) ? "verdadeiro" : "falso";
		 System.out.println(resultado2);
		 
		 //comparação avançada
		 String nome1 = "JAVA";
		 String nome2 = "JAVA";
		 System.out.println(nome1 == nome2);//true
		 
		 String nome3 = new String ("JAVA");
		 System.out.println(nome1==nome3);//false
		 
		 //mesmo tendo as mesmas funcionalidades, caractrísticas e etc, eles ainda são objetos diferentes. 
		 //nome1 é um objeto, mas o nome3 foi um objeto instanciado (criado)
		 
		 String nome4 = nome3;
		 System.out.println(nome3==nome4);//true
		 
		 System.out.println(nome1.equals(nome2));
		 System.out.println(nome2.equals(nome3));
		 System.out.println(nome3.equals(nome4));
		 //equal compara o conteúdo (JAVA), o == compara o objeto (o local de alocamento)
		 
		 //operadores logicos
		 int numero1 = 1;
		 int numero2 = 1;
		 
		 if(numero1==2 & numero2 ++ ==2)
			 System.out.println("as duas condições são verdadeiras");
		 else
			 System.out.println("falso");
		 
		 System.out.println("o numero 1 agora é " + numero1);
		 System.out.println("o numero 2 agora é " + numero2); //na linha "if(numero1==2 & numero2 ++ ==2)" ele incrementou 
		 //+1 no numero2
	}
}