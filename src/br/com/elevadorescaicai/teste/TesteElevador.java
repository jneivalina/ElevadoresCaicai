package br.com.elevadorescaicai.teste;

import br.com.elevadorescaicai.modelo.Elevador; //ctrl + X + O

public class TesteElevador {

	public static void main(String[] args) {
		
	Elevador objeto = new Elevador();//instanciando
	
	objeto.inicializar("Torre A", 20, 10, 0);
	System.out.println(objeto.toString());
	
	objeto.entrar();
	objeto.entrar();
	objeto.subir(2);
	System.out.println(objeto.toString());
	objeto.descer();
	objeto.sair();
	objeto.sair();
	objeto.sair();
	System.out.println(objeto.toString());
	objeto.entrar();
	objeto.entrar();
	objeto.entrar();
	objeto.entrar();
	objeto.entrar();
	objeto.entrar();
	objeto.subir(8);
	System.out.println(objeto.toString());

	
	

	}

}
