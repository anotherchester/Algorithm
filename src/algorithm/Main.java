package algorithm;

public class Main {

    public static void main(String[] args) {

        Algorithm1 alg = new Algorithm1();
        int x = alg.wordCounter("java java java java ok ok");
        System.out.println(x);

        int y = alg.currentWordCounter("Java Oleg Cat Dog Java Java Cat Cat Cat Dog ");
        System.out.println(y);

    }
}

