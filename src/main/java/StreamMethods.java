import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {

        List<String> listNames = new ArrayList<>();

        listNames.add("Pjoter");
        listNames.add("Bartosz");
        listNames.add("Roman");
        listNames.add("Robert");
        listNames.add("Grzesiek");
        listNames.add("Artur");
        listNames.add("Adam");
        listNames.add("Janusz");
        listNames.add("Tony");
        listNames.add("Stefan");
        listNames.add("Stefan");
        listNames.add("Adolf");
        listNames.add("Klark");
        listNames.add("Bartłomiej");
        listNames.add("Artur");
        listNames.add("Michał");
        listNames.add("Maciek");
        listNames.add("Ania");
        listNames.add("Alicja");
        listNames.add("Genowefa");
        listNames.add("Pjoter");
        listNames.add("Stefan");
        listNames.add("Miroslawa");
        listNames.add("Muniek");
        listNames.add("Mozambique");
        listNames.add("Natan");
        listNames.add("Brajanek");
        listNames.add("Boner");

        //Posortowana lista
        listNames
                .stream()
                .sorted()
                .collect(Collectors.toList());

        //lista z imionami zaczynajaca sie na "A"
        listNames
                .stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        //tylko unikalne elementy listy
        listNames
                .stream()
                .distinct()
                .forEach(System.out::println);

        //szukanie pierwszego elementu listy
        listNames.stream()
                .findFirst()
                .ifPresent(System.out::println);

        //lista z imionami zaczynajace sie na litere "P", zamiana wszystkich liter na duze
        // i posortowanie listy
        listNames
                .stream()
                .filter(s -> s.startsWith("P"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        //bierze elementy z listy o podanym limicie
        listNames
                .stream()
                .limit(10)
                .collect(Collectors.toList());

        //pomija pierwsze elementy o podanym zakresie
        listNames
                .stream()
                .skip(5)
                .collect(Collectors.toList());

        //zlicza elementy na liscie
        System.out.println(listNames
                .stream()
                .count());

        //zwraca tablice z listy
        listNames
                .stream()
                .toArray();

        //zwraca najdluzszy element
        listNames
                .stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);

        //bierze z kazdego elementu znak z indexem 2
        listNames
                .stream()
                .flatMap(str -> Stream.of(str.charAt(2)))
                .forEach(System.out::println);

        //zastosowanie kilku metod
        listNames
                .stream()
                .filter(name -> name.startsWith("M"))
                .map(String::toUpperCase)
//                .distinct()
//                .limit(10)
//                .skip(3)
//                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

          // ".map(WebElement::getText) służy do konwersacji typu z WebElement na String
//        indexes.stream()
//                .filter(i -> i < elements.size())
//                .map(elements::get)
//                .map(WebElement::getText)
//                .collect(Collectors.toList())

    }
}