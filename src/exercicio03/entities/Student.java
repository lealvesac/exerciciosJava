package exercicio03.entities;

public class Student {
    public String name;
    public double score1, score2, score3;

    public double mediaScore() {
        return score1 + score2 + score3;
    }

    public double testScore() {
        if (mediaScore() < 60) {
            return 60.0 - mediaScore();
        }
        else {
            return 0.0;
        }
    }
}
