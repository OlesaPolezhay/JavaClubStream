import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Task_1_2_3_4 {

    //1. Дано список цілих чисел. Знайти середнє всіх непарних чисел, що діляться на 5.
    private static void task1(List<Integer> number) {

        OptionalDouble result2 = number.stream()
                .filter(n->n%5==0)
                .filter(n->n%2!=0)
                .mapToInt(Integer::intValue)
                .average();

        System.out.println(result2);
    }

    /* 2. Дано перелік рядків (можна взяти вірш, як варіант). Знайти кількість унікальних рядків завдовжки більше
     8 символів (можна варіювати в залежності від Вашого вхідного тексту). */
    private static void task2(List<String> poem){


        Integer result2 = Math.toIntExact(poem.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .count());

        System.out.println(result2);
    }



    //3. Дана Map <String, Integer>. Знайти суму всіх значень, довжина ключів яких менше 7 символів.
    private static void task3(Map<String, Integer> map) {

       Integer sum = map.entrySet()
               .stream()
               .filter(e-> e.getKey().length() < 7)
               .map(Map.Entry::getValue)
               .reduce(0, Integer::sum);

        System.out.println(sum);
    }


   // 4. Дано список цілих чисел, вивести рядок, що є конкатенацією представлення рядковим типом  цих чисел.
   private static void task4(List<Integer> number) {

      String result = String.valueOf(number.stream()
              .map(element-> Integer.toString(element))
              .reduce(String::concat));

       System.out.println(result);

   }



    public static void main(String[] args) {

        System.out.println("Task1");
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 5, 15, 20, 30, 2, 14, 7));
        task1(number);

        System.out.println("\nTask2");
        List<String> poem = new ArrayList<>();
        poem.add("Java is the language of choice");
        poem.add("It's the most popular computer voice");
        poem.add("Programming in Java is a breeze");
        poem.add("Able to make apps with ease");
        poem.add("It's got methods and classes galore");
        poem.add("And a syntax that's not hard to adore");
        poem.add("Programming in Java is a breeze");
        poem.add("Able to make apps with ease");
        task2(poem);

        System.out.println("\nTask 3");
        Map <String, Integer> map = new HashMap<>();
        map.put("Red", 2);
        map.put("Yellow", 5);
        map.put("Black", 7);
        map.put("Red-Blue", 2);
        map.put("Yellow-BLue", 5);
        map.put("Black-grey", 7);
        task3(map);

        System.out.println("\nTask4");
        task4(number);


    }
}
