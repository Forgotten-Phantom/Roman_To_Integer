public class RomanToInteger {

    public int value(char character) {
        if (character == 'I')
            return 1;
        else if (character == 'V')
            return 5;
        else if (character == 'X')
            return 10;
        else if (character == 'L')
            return 50;
        else if (character == 'C')
            return 100;
        else if (character == 'D')
            return 500;
        else if (character == 'M')
            return 1000;
        return 0;
    }

    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int character1 = value(s.charAt(i));

            if (i + 1 < s.length()) {
                int character2 = value(s.charAt(i + 1));

                if (character1 >= character2) {
                    result += character1;
                } else {
                    result += character2 - character1;
                    i++;
                }
            } else {
                result += character1;
            }
        }
        return result;
    }
}
