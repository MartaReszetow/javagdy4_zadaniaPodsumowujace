package zad1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class WordsCounter {


    public Map<String, Integer> countWords(String tekst) {
        Map<String, Integer> mapOfWords = new HashMap<>();
        String[] singleWord = tekst.split(" ");


        for (String word : singleWord
        ) {
            if (!mapOfWords.containsKey(word)) {
                mapOfWords.put(word, 1);
            } else {
                Integer integer = mapOfWords.get(word);
                mapOfWords.put(word, integer + 1);
            }
        }
        mapOfWords.remove("xxx");
        return mapOfWords;
    }
}
