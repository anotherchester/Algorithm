package algorithm;

public class Algorithm1 {

    public static int wordCounter(String text) {
        String[] arrayWords = text.split(" ");
        int count = 0;
        for (int i = 0; i < arrayWords.length; i++) {
            if (arrayWords[i].equals("java"))
            {count ++;}

    }return count;
}}



    


