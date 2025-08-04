package Personal;

public class Alumni extends Person {
    private int salary;
    private int persenBonus;

    public String showInfo(){
        String info = null;
        info = "ID: " + getId() + ", Name: " + getName();
        return info;
    }


    public void setOccupation(int salary) {
        this.salary = salary;
    }
    public int showOccupation() {
        return salary;
    }

    public void setPersenBonus(int persenBonus){
        this.persenBonus = persenBonus;
    }
    public int getPersenBonus() {
        return persenBonus;
    }

    public int computeBonus() {
        int Bonus = salary * persenBonus / 100;
        return Bonus;
    }
}
