package steps;

import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;
import utils.MassadeTeste;

public class LoginValido {

	Elementos elementos = new Elementos ();
	Metodos metodos = new Metodos();
	MassadeTeste massa = new MassadeTeste(); 
	
	@Before
public void iniciarTeste() {
	Executa.abrirNavegador(true);
}
	
	@Test
	public void loginTelefone () {
		metodos.escrever(elementos.telefone, massa.login);
		metodos.escrever(elementos.senha, massa.senha);
		metodos.clicar(elementos.btnEntrar);
		
	
	}
	
	
	
}
