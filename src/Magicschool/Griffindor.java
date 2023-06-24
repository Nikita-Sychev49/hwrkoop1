package Magicschool;

import java.util.Objects;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, String faculty, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, faculty, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int sum() {
        return nobility + honor + courage;
    }

    public void compare(Griffindor other) {
        if (sum() > other.sum()) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + other.getName());
        }else {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Griffindor that = (Griffindor) o;
        return nobility == that.nobility && honor == that.honor && courage == that.courage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, courage);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Благородство = " + nobility +" || "+
                "Честь = " + honor +" || "+
                "Храбрость = " + courage;
    }
}
