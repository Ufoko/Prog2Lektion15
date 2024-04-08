package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PeopleArray peopleArray = new PeopleArray();
        addPeople(peopleArray);
        System.out.println();

        //Den første person der hedder Klaus
        System.out.println("Den første person der hedder Klaus: " + peopleArray.findFirst(p -> p.getName().equals("Klaus")));
        //Den første person der har et navn med længden 4
        System.out.println("Den første person der har et navn med længden 4: " + peopleArray.findFirst(p -> p.getName().length() == 4));
        //Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1

        System.out.println();

        int ageToLookFor = 44;
        System.out.println("Den første der er 44 er: " + peopleArray.findFirst(p -> p.getAge() == ageToLookFor));

        System.out.println("Den første der starter med s er: " + peopleArray.findFirst(person -> person.getName().charAt(0) == 'S'));

     //   System.out.println("Første med mere end et i er: " + peopleArray.findFirst(person -> person.getName().com));

    }

    private static void addPeople(PeopleArray peopleArray) {
        peopleArray.addPerson(new Person("Bent", 25));
        peopleArray.addPerson(new Person("Susan", 54));
        peopleArray.addPerson(new Person("Mikael", 60));
        peopleArray.addPerson(new Person("Klaus", 44));
        peopleArray.addPerson(new Person("Birgitte", 17));
        peopleArray.addPerson(new Person("Liselotte", 9));
    }
}
