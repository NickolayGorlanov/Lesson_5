import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        // Создаем массив слов, включая повторяющиеся
        String[] wordsArray = {"apple", "banana", "apple", "orange", "banana", "apple",
                "grape", "pear", "orange", "kiwi", "kiwi", "banana"};

        // Используем Set для хранения уникальных слов
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(wordsArray));
        System.out.println("Уникальные слова: " + uniqueWords);

        // Подсчитываем количество вхождений каждого слова с помощью Map
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : wordsArray) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим количество вхождений каждого слова
        System.out.println("Частота встречаемости слов:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
