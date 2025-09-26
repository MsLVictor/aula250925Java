public class Professor extends Pessoa {
    private String cursoMinistrar;
    private String turno;
    private double horaTrabalhada, valorHoraTrabalhada, salario;

    public Professor(String nome, int idade, String email, String turno, double horaTrabalhada, double ValorHoraTrabalhada, double salario) {
        super(nome, idade, email);
        this.turno = turno;
        this.horaTrabalhada = horaTrabalhada;
        this.valorHoraTrabalhada = ValorHoraTrabalhada;
        this.salario = salario;

    }

    public Professor() {

    }

    public String getCursoMinistrar() {
        return cursoMinistrar;
    }

    public void setCursoMinistrar(String cursoMinistrar) {
        this.cursoMinistrar = cursoMinistrar;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(double horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularHoraTrab() {
        salario = horaTrabalhada * valorHoraTrabalhada;
        System.out.println("Seu salário é R$" + salario);
    }
}
