package Magicschool;

import java.util.Objects;

public class Puffendui extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, String faculty, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, faculty, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int sum() {
        return industriousness + loyalty + honesty;
    }

    public void compare(Puffendui other) {
        if (sum() > other.sum()) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + other.getName());
        }else {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Puffendui puffendui = (Puffendui) o;
        return industriousness == puffendui.industriousness && loyalty == puffendui.loyalty && honesty == puffendui.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industriousness, loyalty, honesty);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Трудолюбие = " + industriousness +" || "+
                "Верность = " + loyalty +" || "+
                "Честность =" + honesty;
    }
}
