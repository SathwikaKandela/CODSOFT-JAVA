import  java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordCounter {

    /**import
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      


    
        String input = getInputText(); // Prompt the user to enter text or provide a file

        if (input != null && !input.isEmpty()) {
            int wordCount = countWords(input);
            System.out.println("Total word count: " + wordCount);

            Map<String, Integer> wordFrequency = countWordFrequency(input);
            System.out.println("Word frequency: ");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } else {
            System.out.println("No input provided.");
        }
    }

    private static String getInputText() {
        System.out.println("Enter the text or file name:");
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            inputBuilder.append(line).append("\n");
        }
        scanner.close();
        return inputBuilder.toString();
    }

    private static int countWords(String text) {
        // Step 3: Split the string into an array of words
        String[] words = text.split("\\s+");

        // Step 4: Initialize a counter variable
        int wordCount = 0;

        // Step 5: Iterate through the array of words and count them
        for (String word : words) {
            // Ignore punctuation and convert to lowercase
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        return wordCount;
    }

    private static Map<String, Integer> countWordFrequency(String text) {
        // Step 3: Split the string into an array of words
        String[] words = text.split("\\s+");

        // Step 8: Initialize a map to store word frequency
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Step 5: Iterate through the array of words and count their frequency
        for (String word : words) {
            // Ignore punctuation and convert to lowercase
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                // Increment the count for the word in the map
                int count = wordFrequency.getOrDefault(word, 0);
                wordFrequency.put(word, count + 1);
            }
        }

        return wordFrequency;
    }
}
