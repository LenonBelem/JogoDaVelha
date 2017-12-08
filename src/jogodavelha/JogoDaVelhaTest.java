package jogodavelha;

import org.junit.Assert;
import org.junit.Test;

public class JogoDaVelhaTest {
	
	//////////////// Horizontais

	@Test
	public void verificaVencedorPrimeiraHorizontalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][0] = "X";
		jogo.getMatriz()[0][1] = "X";
		jogo.getMatriz()[0][2] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals("X", jogo.getVencedor());
		Assert.assertEquals(true, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaNaotemVencedorPrimeiraHorizontalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][0] = "X";
		jogo.getMatriz()[0][1] = "O";
		jogo.getMatriz()[0][2] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals(null, jogo.getVencedor());
		Assert.assertEquals(false, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaVencedorSegundaHorizontalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[1][0] = "X";
		jogo.getMatriz()[1][1] = "X";
		jogo.getMatriz()[1][2] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals("X", jogo.getVencedor());
		Assert.assertEquals(true, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaNaotemVencedorSegundaHorizontalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[1][0] = "X";
		jogo.getMatriz()[1][1] = "O";
		jogo.getMatriz()[1][2] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals(null, jogo.getVencedor());
		Assert.assertEquals(false, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaVencedorTerceiraHorizontalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[2][0] = "X";
		jogo.getMatriz()[2][1] = "X";
		jogo.getMatriz()[2][2] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals("X", jogo.getVencedor());
		Assert.assertEquals(true, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaNaotemVencedorTerceiraHorizontalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[2][0] = "X";
		jogo.getMatriz()[2][1] = "O";
		jogo.getMatriz()[2][2] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals(null, jogo.getVencedor());
		Assert.assertEquals(false, jogo.getTemVencedor());
	}
	
	////////////////////// Verticais
	
	@Test
	public void verificaVencedorPrimeiraVerticalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][0] = "X";
		jogo.getMatriz()[1][0] = "X";
		jogo.getMatriz()[2][0] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals("X", jogo.getVencedor());
		Assert.assertEquals(true, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaNaotemVencedorPrimeiraVerticalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][0] = "X";
		jogo.getMatriz()[1][0] = "O";
		jogo.getMatriz()[2][0] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals(null, jogo.getVencedor());
		Assert.assertEquals(false, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaVencedorSegundaVerticalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][1] = "X";
		jogo.getMatriz()[1][1] = "X";
		jogo.getMatriz()[2][1] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals("X", jogo.getVencedor());
		Assert.assertEquals(true, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaNaotemVencedorSegundaVerticalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][1] = "X";
		jogo.getMatriz()[1][1] = "O";
		jogo.getMatriz()[2][1] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals(null, jogo.getVencedor());
		Assert.assertEquals(false, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaVencedorTerceiraVerticalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][2] = "X";
		jogo.getMatriz()[1][2] = "X";
		jogo.getMatriz()[2][2] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals("X", jogo.getVencedor());
		Assert.assertEquals(true, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaNaotemVencedorTerceiraVerticalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][2] = "X";
		jogo.getMatriz()[1][2] = "O";
		jogo.getMatriz()[2][2] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals(null, jogo.getVencedor());
		Assert.assertEquals(false, jogo.getTemVencedor());
	}
	
	////////////////// Diagonais
	
	@Test
	public void verificaVencedorPrimeiraDiagonalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][0] = "X";
		jogo.getMatriz()[1][1] = "X";
		jogo.getMatriz()[2][2] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals("X", jogo.getVencedor());
		Assert.assertEquals(true, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaNaotemVencedorPrimeiraDiagonalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][0] = "X";
		jogo.getMatriz()[1][1] = "O";
		jogo.getMatriz()[2][2] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals(null, jogo.getVencedor());
		Assert.assertEquals(false, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaVencedorSegundaDiagonalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][2] = "X";
		jogo.getMatriz()[1][1] = "X";
		jogo.getMatriz()[2][0] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals("X", jogo.getVencedor());
		Assert.assertEquals(true, jogo.getTemVencedor());
	}
	
	@Test
	public void verificaNaotemVencedorSegundaDiagonalTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][2] = "X";
		jogo.getMatriz()[1][1] = "O";
		jogo.getMatriz()[2][0] = "X";
		jogo.retornaGanhador();
		Assert.assertEquals(null, jogo.getVencedor());
		Assert.assertEquals(false, jogo.getTemVencedor());
	}
	
	///////////// Todas as posições preenchida
	
	@Test
	public void verificaVencedorMatrizCompletaTest() {
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.getMatriz()[0][0] = "X";
		jogo.getMatriz()[0][1] = "X";
		jogo.getMatriz()[0][2] = "X";
		
		jogo.getMatriz()[1][0] = "O";
		jogo.getMatriz()[1][1] = "X";
		jogo.getMatriz()[1][2] = "O";
		
		jogo.getMatriz()[2][0] = "X";
		jogo.getMatriz()[2][1] = "O";
		jogo.getMatriz()[2][2] = "O";
		
		jogo.retornaGanhador();
		Assert.assertEquals("X", jogo.getVencedor());
		Assert.assertEquals(true, jogo.getTemVencedor());
	}

}
