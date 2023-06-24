package Magicschool;

import java.util.Objects;

public class Koctevran extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int cretivity;

    public Koctevran(String name, String faculty, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int cretivity) {
        super(name, faculty, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.cretivity = cretivity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCretivity() {
        return cretivity;
    }

    public void setCretivity(int cretivity) {
        this.cretivity = cretivity;
    }

    public int sum() {
        return wisdom + mind + wit + cretivity;
    }

    public void compare(Koctevran other) {
        if (sum() > other.sum()) {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        }else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Koctevran koctevran = (Koctevran) o;
        return mind == koctevran.mind && wisdom == koctevran.wisdom && wit == koctevran.wit && cretivity == koctevran.cretivity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mind, wisdom, wit, cretivity);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ум = " + mind +" || "+
                "Мудрость = " + wisdom +" || "+
                "Остроумие = " + wit +" || "+
                "Креативность = " + cretivity;
    }
}
