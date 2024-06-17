
public class Usuario {
	public int Id;
	public String Nome;
	public String Senioridade;
	public double CustoPorHora;
	
	public Usuario() {}
	
	public Usuario(int id, String nome, String senioridade, double custoPorHora) {
		id = this.Id;
		nome = this.Nome;
		senioridade = this.Senioridade;
		custoPorHora = this.CustoPorHora;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSenioridade() {
		return Senioridade;
	}

	public void setSenioridade(String senioridade) {
		Senioridade = senioridade;
	}

	public double getCustoPorHora() {
		return CustoPorHora;
	}

	public void setCustoPorHora(double custoPorHora) {
		CustoPorHora = custoPorHora;
	}
		
}
