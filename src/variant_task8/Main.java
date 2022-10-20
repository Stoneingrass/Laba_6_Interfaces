package variant_task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please input a string: ");
        String input = s.nextLine();

        IAnaliseString vowelAnalyzer = new Vowel();
        IAnaliseString consonantAnalyzer = new Consonant();

        System.out.printf("Analyzing result: vowels: %d, consonants: %d.", vowelAnalyzer.analyse(input), consonantAnalyzer.analyse(input));
    }
}
