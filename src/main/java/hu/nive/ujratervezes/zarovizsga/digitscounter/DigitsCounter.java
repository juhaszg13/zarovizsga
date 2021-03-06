package hu.nive.ujratervezes.zarovizsga.digitscounter;

public class DigitsCounter {

    public int getCountOfDigits(String digit) {

        if (digit==null||digit.equals("")) {
            return 0;
        }

        String digits = "0123456789";
        String[] tmp = digit.split("");
        int[] counter = new int[10];
        int sum = 0;

        for (String i : tmp) {
            if (digits.contains(i)&&(counter[Integer.parseInt(i)]==0)) {
                sum++;
            }
        }
        return sum;
    }
}

