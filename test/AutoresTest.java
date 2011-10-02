import static org.junit.Assert.*;

import org.junit.Test;

public class AutoresTest {

	@Test
	public void deveFormatarAutorComNomeESobrenome() {
		String autorFormatado = Autores.formata("joao silva");
		assertEquals("SILVA, Joao", autorFormatado);
	}
	
	@Test
	public void deveFormatarAutorComOutroNomeESobrenome() {
		String autorFormatado = Autores.formata("paulo coelho");
		assertEquals("COELHO, Paulo", autorFormatado);
	}
	
	@Test
	public void deveFormatarAutorSomenteComSobrenome() {
		String autorFormatado = Autores.formata("camoes");
		assertEquals("CAMOES", autorFormatado);
	}
	
	@Test
	public void deveFormatarAutorComNomeMaisDeESobrenome() {
		String autorFormatado = Autores.formata("celso de araujo");
		assertEquals("ARAUJO, Celso de", autorFormatado);
	}
}
