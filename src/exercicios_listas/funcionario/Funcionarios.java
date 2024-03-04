package exercicios_listas.funcionario;

import java.util.List;

public class Funcionarios {
    private Integer id;
    private String nome;
    private Double salario;

    Funcionarios() {
    }

    ;

    public Funcionarios(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //MÉTODO PARA AUMENTAR O SALARIO
    public void aumentarSalario(double porcentagem) {
        salario += (salario * porcentagem) / 100;
    }

    //MÉTODO PARA BUSCA NA LISTA
    public static boolean buscaId(List<Funcionarios> funcionariosList, int id) {
        Funcionarios idFuncionarios = funcionariosList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return idFuncionarios != null;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nome: %s, Salário: R$%.2f.", id, nome, salario);
    }
}
