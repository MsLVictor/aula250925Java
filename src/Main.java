import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Aluno a2 = new Aluno();

        String sair = "n";
        int menu;
        do {

            System.out.println("------- MENU -------");
            //System.out.println(" Conta atual: " + contaAtual.getTitular());
            System.out.println(" 1 - Cadastrar Aluno.");
            System.out.println(" 2 - Cadastrar Professor.");
            System.out.println(" 3 - Listar Alunos.");
            System.out.println(" 4 - Sair.");

            menu = sc.nextInt();

            switch(menu) {
                case 1:
                    Aluno aluno = new Aluno();
                    System.out.println("qual seu nome? ");
                    aluno.setNome(sc.next());
                    System.out.println("Qual curso você deseja iniciar? ");
                    aluno.setCurso(sc.next());
                    System.out.println("Qual turno você deseja ensinar? ");
                    aluno.setTurno(sc.next());
                    System.out.println("Aluno cadastrado com sucesso! SEJA BEM-VINDO!!");
                    alunos.add(aluno);
                    break;
                case 2:
                    Professor professor = new Professor();
                    System.out.println("qual seu nome? ");
                    professor.setNome(sc.next());
                    System.out.println("Qual Curso você vai ministrar? ");
                    professor.setCursoMinistrar(sc.next());
                    System.out.println("Qual turno você deseja ensinar? ");
                    professor.setTurno(sc.next());
                    System.out.println("Adicione o valor do salário do professor.");
                    professor.setSalario(sc.nextDouble());
                    System.out.println("Professor cadastrado com sucesso! SEJA BEM-VINDO!!");
                    professores.add(professor);
                    break;
                case 3:
                    for (Aluno aluno1 : alunos  ) {
                        System.out.println(aluno1.getNome());
                    }
                    break;
                case 4:
                    System.out.println("Tem Certeza? S/N");
                    sair = sc.next();
                    break;
            }
        } while(sair.equalsIgnoreCase("N"));
    }
}