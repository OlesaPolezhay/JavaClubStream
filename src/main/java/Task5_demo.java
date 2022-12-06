import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task5_demo {

    /* Даний клас Person з полями firstName, lastName, age.
    Вивести повне ім'я найстаршої людини, у якої довжина цього імені не перевищує 15 символів.*/

    private static void task5(List<Person> peoples) {

        /*
        List<String> result = peoples.stream()
                .sorted()
                .map(f1 -> (f1.getFirstName() + " " +f1.getLastName()))
                .filter(f1 ->f1.length() < 15)
                .limit(1)
                .collect(Collectors.toList());

        System.out.println(result);

         */

        String result2 = peoples.stream()
                .sorted()
                .map(f1 -> (f1.getFirstName() + " " +f1.getLastName()))
                .filter(f1 -> f1.length() < 15)
                .findFirst()
                .toString();

        System.out.println(result2);

       /* String result3 = peoples.stream()
                .sorted()
                .map(f1 -> (f1.getFirstName() + " " +f1.getLastName()))
                .filter(f1 -> f1.length() < 15)
                .limit(1)
                .toString();

        System.out.println(result3);

        */
    }

    public static void main(String[] args) {
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Lesia", "Polezhay", 20));
        peoples.add(new Person("Oleg", "Shevchenko", 40));
        peoples.add(new Person("Stiv", "Jobs", 50));
        peoples.add(new Person("Nadia", "Dodo", 30));
        task5(peoples);


    }


}
