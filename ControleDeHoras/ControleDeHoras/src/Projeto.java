import java.util.Scanner;

public class Projeto extends Usuario {
    public int Id;
    public String Nome;
    public double TotalHoras;
    public double ValorTotal;

    public Projeto() {}

    public Projeto(int id, String nome, double totalHoras, double valorTotal, int idUser, String nomeUser, String senioridade, double custoPorHora) {
        super(idUser, nomeUser, senioridade, custoPorHora);
        this.Id = id;
        this.Nome = nome;
        this.TotalHoras = totalHoras;
        this.ValorTotal = valorTotal;
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

	public double getTotalHoras() {
		return TotalHoras;
	}

	public void setTotalHoras(double totalHoras) {
		TotalHoras = totalHoras;
	}

	public double getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}


    public void CadastrarProjeto(Scanner scanner) {
        System.out.print("Digite o nome do projeto: ");
        this.Nome = scanner.nextLine();
        System.out.print("Digite o valor cobrado por hora: ");
        double valorHora = scanner.nextDouble();
        setCustoPorHora(valorHora);
        System.out.print("Digite a quantidade de horas trabalhadas no projeto: ");
        this.TotalHoras = scanner.nextDouble();
        this.ValorTotal = this.TotalHoras * valorHora;
        scanner.nextLine();  
    }

    public void ExcluirProjeto() {
        this.Nome = null;
        this.TotalHoras = 0;
        this.ValorTotal = 0;
    }

    public void EditarProjeto(Scanner scanner) {
        System.out.print("Digite o novo nome do projeto: ");
        this.Nome = scanner.nextLine();
        System.out.print("Digite o novo valor cobrado por hora: ");
        double valorHora = scanner.nextDouble();
        setCustoPorHora(valorHora);
        System.out.print("Digite a nova quantidade de horas trabalhadas no projeto: ");
        this.TotalHoras = scanner.nextDouble();
        this.ValorTotal = this.TotalHoras * valorHora;
        scanner.nextLine(); 
    }

    @Override
    public String toString() {
        return "ID do Projeto: " + Id + "\n" +
               "Nome do Projeto: " + Nome + "\n" +
               "Valor Cobrado por Hora: " + getCustoPorHora() + "\n" +
               "Horas Trabalhadas: " + TotalHoras + "\n" +
               "Valor Total: " + ValorTotal + "\n" +
               "---------------------------";
    }
}
