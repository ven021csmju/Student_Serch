package Personal;

public class Student {
    String id = "307" ;
    String name = "Kittikun";
    int score = 40;

    public void setterID(String id) {
            this.id = id;
        }
        public String getterID(){
            return id;
    }

    public void setterScore(int score) {
        this.score = score;
    }
    public int getterScore(){
        return score;
    }


    public void setterName(String name) {
        this.name = name;
    }
    public String getterName(){
        return name;
    }
    @Override
    public String toString() {
        return "รหัส: " + id + ", ชื่อ: " + name;
    }
}
