package Atividade1;

public class Funcionario {
private  String nome;
private  double salario;

    public Funcionario() {

    }
    public  String getNome() {
        return this.nome;
    }

    public  void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public  void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", salario=" + salario ;
    }
}
