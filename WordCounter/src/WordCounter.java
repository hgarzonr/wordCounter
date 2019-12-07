
/**
 * Created by hgarzon on 07/12/2019.
 */

public class WordCounter {
    public static void main(String[] args) {
        String arg = "lumu lumu lumu lumu lumu illuminates illuminates attacks and adversaries lumu illuminates all attacks and adversaries";
        Map<String, Integer> wordsMap = new HashMap<>();
        String[] words = arg.split(" ");
        Integer characters = 0;
        for (String word : words) {
            characters += word.split("").length;
            Integer value = wordsMap.get(word);
            if (Objects.nonNull(value)) {
                wordsMap.put(word, value + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        System.out.println(characters);
        System.out.println(words.length);
        System.out.println(wordsMap);
    }

}
