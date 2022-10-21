package variant_task8;

public class Consonant implements IAnalyseString {
    static final char[] consonants = "qwrtpsdfghjklzxcvbnm".toCharArray();

    @Override
    public int analyse(String str) {
        int nConsonants = 0;
        char[] chars = str.toLowerCase().toCharArray();

        for (char ch : chars) {
            for (char v : consonants) {
                if (v == ch) {
                    nConsonants++;
                    break;
                }
            }
        }

        return nConsonants;
    }
}
