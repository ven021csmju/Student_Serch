package Personal;

public class Alumni extends Person {
    private int salary;

    public String showInfo(){
        String info = null;
        info = "ID: " + getId() + ", Name: " + getName();
        System.out.println(info);
        return info;
    }


    public void setOccupation(int salary) {
        this.salary = salary;
    }
    public int showOccupation() {
        return salary;
    }
}
