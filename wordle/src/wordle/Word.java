package wordle;

public class Word {
    private String word;
    private int[] color;
    private String correctWord;

    public Word(String word, String correctWord){
        this.correctWord = correctWord;
        this.word = word;
        calculateColor();
    }
    public String getWord(){
        return word;
    }
    public String getColor(){
        String temp = "";
        for(int i = 0; i < 5; i++){
            temp = temp + color[i];
        }
        return temp;
    }
    public void calculateColor(){
        color = new int [] {0,0,0,0,0};
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(word.charAt(i) == correctWord.charAt(j) && i == j ){
                    color[i] = 2;
                    break;
                }
                else if(word.charAt(i) == correctWord.charAt(j)){
                    color[i] = 1;
                }
            }
        }
    }


}
