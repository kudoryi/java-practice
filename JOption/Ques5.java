import javax.swing.JOptionPane;

public class Ques5 {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word:");
        int vcount = vowels(word);
        JOptionPane.showMessageDialog(null, "The word \"" + word + "\" has " + vcount + " vowel(s).");
    }
    
    public static int vowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' ||
                letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') {
                count++;
            }
        }
        return count;
    }
}

