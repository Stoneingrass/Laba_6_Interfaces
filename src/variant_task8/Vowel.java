package variant_task8;

public class Vowel implements IAnalyseString {
    static final char[] vowels = "eyuioa".toCharArray();

    @Override
    public int analyse(String str) {
        int nVowels = 0;
        char[] chars = str.toLowerCase().toCharArray();

        for (char ch: chars) {
            for (char v: vowels) {
                if(v==ch) {
                    nVowels++;
                    break;
                }
            }
        }

        return nVowels;
    }
}
