package youtube.com;

public class Usuario extends Pessoa {
	private String login;
	private int totAssistido;
	
	public Usuario(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login=login;
		this.totAssistido=0;
	}
	public void assistiuMaisUm() {
		this.totAssistido++;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	@Override
	public String toString() {
		return "Expectador [+super.toString()+ login=" + login + ", totAssistido=" + totAssistido + "]";
	}
	
	
	
	
	
	
	
	

}
