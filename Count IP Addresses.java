public class CountIPAddresses {

    public static long StrtoLong(String s) {
        long rez = 0, digit = 1;
        for(int i = 0; i < s.length(); i++) {
            for(int j = s.length() - 2 - i; j >= 0; j--) {
                digit *= 10;
            }
            rez += (s.charAt(i) - '0') * digit;
            digit = 1;
        }
        return rez;
    }

    public static long ipsBetween(String start, String end) {
        String first[] = start.split("\\."), second[] = end.split("\\.");

        return (StrtoLong(second[0]) - StrtoLong(first[0]) ) * 256 * 256 * 256 + (StrtoLong(second[1]) - StrtoLong(first[1])) * 256 * 256
        + (StrtoLong(second[2]) - StrtoLong(first[2])) * 256 + StrtoLong(second[3]) - StrtoLong(first[3]);

    }
}