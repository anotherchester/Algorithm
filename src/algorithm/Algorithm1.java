package algorithm;

import java.util.Random;

public class Algorithm1 {

    public static int wordCounter(String text) {
        String[] arrayWords = text.split(" ");
        int count = 0;
        for (int i = 0; i < arrayWords.length; i++) {
            if (arrayWords[i].equals("java"))
            {count ++;}
    }return count;
}

    public static int currentWordCounter(String text) {
        String[] arrayWords = text.split(" ");
        int q = new Random().nextInt(arrayWords.length);
        int count = 0;
        for (int i = 0; i < arrayWords.length; i++)
        {
            if (arrayWords[i].equals(arrayWords[q]))
            {count ++;}
        }
        return  count;
    }


}



    


