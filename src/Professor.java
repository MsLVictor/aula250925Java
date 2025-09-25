public class Professor extends Pessoa {
    private String cursoMinistrar;
    private String turno;
    private double horaTrabalhada, valorHoraTrabalhada, salario;

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
