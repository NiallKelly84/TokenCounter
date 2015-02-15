/**
 * Created by Kelly on 13/02/2015.
 */
public class Word {

    private String word;
    private int count = 0;

    public String getWord() {
        return this.word;
    }

    public int getCount() {
        return this.count;
    }

    public void setWord (String word) {
        this.word = word;
    }

    public void increaseCount () {
        this.count++;
    }
}
