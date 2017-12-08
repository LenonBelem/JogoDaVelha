package jogodavelha;

public class JogoDaVelha {

	private String matriz[][];
	private String vencedor;
	
	public JogoDaVelha() {
		matriz = new String[3][3];
		vencedor = null;
	}
	
	public void retornaGanhador() {
		if (temVencedorPrimeiraHorizontal()) {
			vencedor = matriz[0][0];
		}else if(temVencedorSegundaHorizontal()){
			vencedor = matriz[1][0];
		}else if(temVencedorTerceiraHorizontal()){
			vencedor = matriz[2][0];
		} else if(temVencedorPrimeiraVertical()) {
			vencedor = matriz[0][0];
		} else if(temVencedorSegundaVertical()) {
			vencedor = matriz[0][1];
		} else if(temVencedorTerceiraVertical()) {
			vencedor = matriz[0][2];
		} else if(temVencedorPrimeiraDiagonal()) {
			vencedor = matriz[0][0];
		} else if(temVencedorSegundaDiagonal()) {
			vencedor = matriz[0][2];
		}

	}
	
	private boolean temVencedorPrimeiraHorizontal(){
		return matriz[0][0] == matriz[0][1] && matriz[0][0] == matriz[0][2] && matriz[0][0] != null;
	}
	
	private boolean temVencedorSegundaHorizontal(){
		return matriz[1][0] == matriz[1][1] && matriz[1][0] == matriz[1][2] && matriz[1][0] != null;
	}
	
	private boolean temVencedorTerceiraHorizontal(){
		return matriz[2][0] == matriz[2][1] && matriz[2][0] == matriz[2][2] && matriz[2][0] != null;
	}
	
	private boolean temVencedorPrimeiraVertical(){
		return matriz[0][0] == matriz[1][0] && matriz[0][0] == matriz[2][0] && matriz[0][0] != null;
	}
	
	private boolean temVencedorSegundaVertical(){
		return matriz[0][1] == matriz[1][1] && matriz[0][1] == matriz[2][1] && matriz[0][1] != null;
	}
	
	private boolean temVencedorTerceiraVertical(){
		return matriz[0][2] == matriz[1][2] && matriz[0][2] == matriz[2][2] && matriz[0][2] != null;
	}
	
	private boolean temVencedorPrimeiraDiagonal(){
		return matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2] && matriz[0][0] != null;
	}
	
	private boolean temVencedorSegundaDiagonal() {
		return matriz[0][2] == matriz[1][1] && matriz[0][2] == matriz[2][0] && matriz[0][2] != null;
	}

	public Boolean getTemVencedor() {
		return vencedor != null;
	}
	
	public String[][] getMatriz() {
		return matriz;
	}


	public String getVencedor() {
		return vencedor;
	}
}
