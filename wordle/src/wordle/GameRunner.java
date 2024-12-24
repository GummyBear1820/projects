package wordle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class GameRunner {
    private String target;
    private List<Word> word = new ArrayList<>();
    private boolean win = false;

    public GameRunner() {

    }

    public boolean add(Word newWord) {
        if (word.size() == 5) {
            return false;
        }
        word.add(newWord);
        //System.out.println(newWord.getWord());
        System.out.println(newWord.getColor());
        if (newWord.getColor().equals("22222")) {
            win = true;
        }

        return true;
    }
    public boolean getWin(){
        return win;
    }

    public boolean isListFull() {
        return word.size() == 5;
    }

    public String targetGenerator() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("listOfWords.txt"));
            Random random = new Random();
            int randomNum = random.nextInt(100000);
            int i = 0;
            while (i != randomNum) {
                i++;
                reader.readLine();
            }
            target = reader.readLine();
            reader.close();
            return target;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "zzzzz";
    }
}
