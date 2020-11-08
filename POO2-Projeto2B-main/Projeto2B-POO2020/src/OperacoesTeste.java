import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperacoesTeste {

	@Test
	void testemmc() {
		Operacoes operacoes = new Operacoes();
		int resultado = operacoes.mmc(125,150);
		assertEquals(750, resultado);
	
	}

@Test
	void testesomar() {
	Operacoes operacoes = new Operacoes();
	String resultado = operacoes.somaFracao();
	assertEquals(10+"/"+10, resultado);
	}

@Test
	void testesubtrair() {
		Operacoes operacoes = new Operacoes();
		String resultado = operacoes.subtraiFracao();
		assertEquals(10+"/"+10, resultado);
	}

@Test
	void testeMultiplicar() {
	
		Operacoes operacoes = new Operacoes();
		String resultado = operacoes.multiplicaFracao(2, 2, 2, 2);
		assertEquals(4+"/"+4,resultado); 
	}

@Test
	void testeDividir() {
	Operacoes operacoes = new Operacoes();
	String resultado = operacoes.divideFracao(2, 2, 2, 2);
	assertEquals(4+"/"+4,resultado); 
	}

@Test
	void testeImc() {
	Operacoes operacoes = new Operacoes();
	double resultado = operacoes.imc(1.55, 63.55);
	assertEquals(26.430801248699268, resultado);
	}
@Test
	void testecelsiusToKelvin() {
	Operacoes operacoes = new Operacoes();
	double resultado = operacoes.celsiusToKelvin(32);
	assertEquals(305.15, resultado);
	}
@Test
	void testecelsiusToFahrenheit() {
	Operacoes operacoes = new Operacoes();
	double resultado = operacoes.celsiusToFarenheit(32);
	assertEquals(305.15, resultado);
	
	}
@Test
	void testekelvinToCelcius() {
	Operacoes operacoes = new Operacoes();
	double resultado = operacoes.kelvinToCelcius(32);
	assertEquals(-241.15, resultado);
	}
	
	@Test
	void testekelvinToFarenheit() {
		Operacoes operacoes = new Operacoes();
		double resultado = operacoes.kelvinToFarenheit(32);
		assertEquals(-402.07, resultado);
	}
@Test
	void testefarenheitToCelcius() {
		Operacoes operacoes = new Operacoes();
		double resultado = operacoes.celsiusToFarenheit(32);
		assertEquals(0, resultado);
	}
@Test
	void testefarenheitToKelvin() {
		Operacoes operacoes = new Operacoes();
		double resultado = operacoes.farenheitToKelvin(32);
		assertEquals(273.15, resultado);
	}

}
