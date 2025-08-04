package Personal;

public class Student extends Person {
    private int score;

    public void setterScore(int score) {
        this.score = score;
    }
    public int getterScore(){
        return score;
    }

    public int computeGrade() {
        if (score >= 80) {
            return 4; // A

        } else if (score >= 70) {
            return 3; // B
        } else if (score >= 60) {
            return 2; // C
        } else if (score >= 50) {
            return 1; // D
        } else {
            return 0; // F
        }
    }
}
