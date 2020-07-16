package zad1;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
git
        Scanner scanner = new Scanner(System.in);
        System.out.println("wypisuj tekst w którym chcesz policzyć słowa\n"+ "[wypisz] - jeżeli chcesz zwrócić mapęsów, [quit] - jeżeli chcesz zakończyć program");
        String komenda;
        String textToCount = "xxx";
        do {
            komenda = scanner.nextLine();
            textToCount = textToCount + " " + komenda;
            if (komenda.contains("wypisz")) {
                textToCount = textToCount.replace("wypisz", "xxx");
                WordsCounter counter = new WordsCounter();
                Map<String, Integer> mapOfWords = counter.countWords(textToCount);
                System.out.println(mapOfWords);
            }
        }
        while (!komenda.equalsIgnoreCase("quit"));
    }
}
