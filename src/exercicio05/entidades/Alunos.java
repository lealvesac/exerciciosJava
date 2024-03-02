package exercicio05.entidades;

public class Alunos {
    public String nome;
    public String  matricula;
    public String nomeCurso;
    public String[] nomeDisciplinas = new String[3];
    public double[][] notasDisciplinas = new double[3][4];

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do Curso: " + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j] + " / ");
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indices) {
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[indices].length; i++) {
            soma += notasDisciplinas[indices][i];
        }

        double media = soma / 4;

        return media >= 7;
    }

}
