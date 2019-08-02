package algorithm;

public class Main {

    public static void main(String[] args) {

        int x = Algorithm1.wordCounter("java java java java ok ok");
        System.out.println(x);

        int y = Algorithm1.currentWordCounter("Java Oleg Cat Dog Java Java Cat Cat Cat Dog ","Cat");
        System.out.println(y);

    }
}

