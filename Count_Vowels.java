public class CountVowel {

    static int count = 0;

    public static void main(String[] args) {
        String text = "Mark Welly";
        int vowelCount = countVowels(text);
        System.out.println("Number of vowels in '" + text + "': " + vowelCount);
    }

    public static int countVowels(String text) {
        if (text == null || text.isEmpty()) {
            return 0; 
        }
        count = 0; 
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i)); 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
