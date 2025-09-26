public class Aluno extends Pessoa {
    private String Curso;
    private String turno;

    public Aluno(String nome, int idade, String email, String curso, String turno){
        super(nome, idade, email);
        this.Curso = curso;
        this.turno = turno;
    }

    public Aluno() {

    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
