import Magicschool.Griffindor;
import Magicschool.Koctevran;
import Magicschool.Puffendui;
import Magicschool.Slytherin;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Random random = new Random();

        Griffindor garry = new Griffindor("Гарри", "Гриффиндор",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));
        Griffindor germiona = new Griffindor("Гермиона", "Гриффиндор",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));
        Griffindor ron = new Griffindor("Рон", "Гриффиндор",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));
        System.out.println(germiona);
        System.out.println(garry);
        garry.compare(germiona);

        Slytherin drako = new Slytherin("Драко", "Слизерин",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101),random.nextInt(101));
        Slytherin gregory = new Slytherin("Грегори", "Слизерин",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101),random.nextInt(101),random.nextInt(101));
        Slytherin greghem = new Slytherin("Грехем", "Слизерин",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101),random.nextInt(101),random.nextInt(101));
        System.out.println(gregory);
        System.out.println(drako);
        System.out.println(greghem);
        Puffendui zahariya = new Puffendui("Захария", "Пуффендуй",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));
        Puffendui sedrik = new Puffendui("Седрик", "Пуффендуй",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));
        Puffendui jastin = new Puffendui("Джастин", "Пуффендуй",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));
        System.out.println(sedrik);
        System.out.println(zahariya);
        System.out.println(jastin);
        Koctevran chjou = new Koctevran("Чжоу", "Когтевран",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101),random.nextInt(101));
        Koctevran padma = new Koctevran("Падма", "Когтевран",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101),random.nextInt(101));
        Koctevran marcus = new Koctevran("Маркус", "Когтевран",
                random.nextInt(101),
                random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101),random.nextInt(101));
        System.out.println(chjou);
        System.out.println(marcus);
        System.out.println(padma);
        garry.compare(drako);
    }


}
