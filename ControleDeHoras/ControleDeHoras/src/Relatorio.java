

public abstract class Relatorio extends Projeto{
	public int Id;
	
	public Relatorio() {}
	
	public Relatorio(int id, int idProjeto, String nome, double valorHora, double totalHoras, double valorTotal, int idUser, String nomeUser, String senioridade, double custoPorHora) {
		super(idProjeto, nome, totalHoras, valorTotal, idUser, nomeUser, senioridade, custoPorHora);
		id = this.Id;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	
}