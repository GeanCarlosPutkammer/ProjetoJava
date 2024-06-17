import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroDeHora registroDeHora = new RegistroDeHora();

        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite sua senioridade: ");
        String senioridade = scanner.nextLine();
        System.out.print("Digite seu custo por hora: ");
        double custoPorHora = scanner.nextDouble();
        scanner.nextLine(); 

        new Usuario(1, nomeUsuario, senioridade, custoPorHora);

        boolean executando = true;
        while (executando) {
            System.out.println("1. Cadastrar Projeto");
            System.out.println("2. Excluir Projeto");
            System.out.println("3. Editar Projeto");
            System.out.println("4. Listar Relatórios");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    Projeto projeto = new Projeto();
                    projeto.CadastrarProjeto(scanner);
                    projeto.setId(registroDeHora.Projetos.size() + 1);
                    registroDeHora.adicionarProjeto(projeto);
                    break;
                case 2:
                    System.out.print("Digite o ID do projeto a excluir: ");
                    int idExcluir = scanner.nextInt();
                    Projeto projetoExcluir = null;
                    for (Projeto proj : registroDeHora.Projetos) {
                        if (proj.getId() == idExcluir) {
                            projetoExcluir = proj;
                            break;
                        }
                    }
                    if (projetoExcluir != null) {
                        registroDeHora.removerProjeto(projetoExcluir);
                        System.out.println("Projeto excluído com sucesso.");
                    } else {
                        System.out.println("Projeto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o ID do projeto a editar: ");
                    int idEditar = scanner.nextInt();
                    scanner.nextLine();  
                    Projeto projetoEditar = null;
                    for (Projeto proj : registroDeHora.Projetos) {
                        if (proj.getId() == idEditar) {
                            projetoEditar = proj;
                            break;
                        }
                    }
                    if (projetoEditar != null) {
                        projetoEditar.EditarProjeto(scanner);
                        System.out.println("Projeto editado com sucesso.");
                    } else {
                        System.out.println("Projeto não encontrado.");
                    }
                    break;
                case 4:
                    ArrayList<Projeto> relatorios = registroDeHora.ListarRelatorios();
                    for (Projeto proj : relatorios) {
                        System.out.println("ID do Projeto: " + proj.getId());
                        System.out.println("Nome do Projeto: " + proj.getNome());
                        System.out.println("Valor Cobrado por Hora: " + proj.getCustoPorHora());
                        System.out.println("Horas Trabalhadas: " + proj.getTotalHoras());
                        System.out.println("Valor Total: " + proj.getValorTotal());
                        System.out.println("---------------------------");
                    }
                    break;
                case 5:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
