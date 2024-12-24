package wordle;

import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hi this is wordle");
        GameRunner game = new GameRunner();
        Scanner scanner = new Scanner(System.in);
        String target = game.targetGenerator();
        while (game.getWin() == false && !game.isListFull()){
            System.out.println("Guess a word" + target);
            String wordGussed = scanner.next();
            if(wordGussed.length() == 5) {
                Word temp = new Word(wordGussed, target);
                game.add(temp);
            }
            else{
                System.out.println("the word must be 5 letters");
            }
        }
        if(!game.getWin()){
            System.out.println("You lost! \n The word was " + target);
        }
        else{
            System.out.println("You win!");
        }
    }
}