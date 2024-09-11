import java.util.Scanner;

public class LabFourth {

    // Метод для вилучення попередніх входжень останньої літери з кожного слова
    public static String processText(String text) {
        // Розділити текст на слова (включаючи розділові знаки як роздільники)
        String[] words = text.split("\\s+|(?=[,.!?;:])|(?<=[,.!?;:])");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.isEmpty()) {
                result.append(" ");
                continue;
            }
            
            // Видалити всі попередні входження останньої літери
            char lastChar = word.charAt(word.length() - 1);
            StringBuilder processedWord = new StringBuilder();
            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i) != lastChar) {
                    processedWord.append(word.charAt(i));
                }
            }
            processedWord.append(lastChar);  // Додати останню літеру

            // Додати оброблене слово до результату
            result.append(processedWord).append(" ");
        }

        return result.toString().trim();  // Видалити зайві пробіли в кінці
    }

    public static void run(Scanner scanner) {
        // Введення тексту
        System.out.println("Input text:");
        String text = scanner.nextLine();

        // Обробка
        String processedText = processText(text);

        //Результат
        System.out.println("Processed text:");
        System.out.println(processedText);
    }
}
