package variant_task8;

public class Vowel implements IAnaliseString {
    static final char[] vowels = "eyuioa".toCharArray();

    @Override
    public int analyse(String str) {
        int nVowels = 0;
        char[] chars = str.toCharArray();

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
