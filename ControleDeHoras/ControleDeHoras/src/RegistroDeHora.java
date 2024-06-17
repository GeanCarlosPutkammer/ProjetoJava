import java.util.ArrayList;
import java.util.Date;

public class RegistroDeHora {
    public int Id;
    ArrayList<Projeto> Projetos = new ArrayList<>();
    public Date HoraDeInicio;
    public Date HoraDeFim;

    public RegistroDeHora() {}

    public RegistroDeHora(int id, ArrayList<Projeto> projetos, Date horaDeInicio, Date horaDeFim) {
        this.Id = id;
        this.Projetos = projetos;
        this.HoraDeInicio = horaDeInicio;
        this.HoraDeFim = horaDeFim;
    }

    public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public ArrayList<Projeto> getProjetos() {
		return Projetos;
	}

	public void setProjetos(ArrayList<Projeto> projetos) {
		Projetos = projetos;
	}

	public Date getHoraDeInicio() {
		return HoraDeInicio;
	}

	public void setHoraDeInicio(Date horaDeInicio) {
		HoraDeInicio = horaDeInicio;
	}

	public Date getHoraDeFim() {
		return HoraDeFim;
	}

	public void setHoraDeFim(Date horaDeFim) {
		HoraDeFim = horaDeFim;
	}



    public ArrayList<Projeto> ListarRelatorios() {
        return Projetos;
    }

    public void adicionarProjeto(Projeto projeto) {
        Projetos.add(projeto);
    }

    public void removerProjeto(Projeto projeto) {
        Projetos.remove(projeto);
    }
}
