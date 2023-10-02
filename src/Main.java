import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Character> alph = new ArrayList<>();
    static List<AutoNumber> numbers = new ArrayList<>();

    public static void main(String[] args) {
        createAlph();
        generateNum();
        System.out.println(numbers.size());

    }

    public static List<Character> createAlph() {
        for (int i = 0; i < 26; i++) {
            char k = (char) (97 + i);
            alph.add(k);
        }
        return alph;
    }

    public static List<AutoNumber> generateNum() {
        int index = 0;
        int index1 = 1;
        int index2 = 2;
        while (true) {
            if (index == 25 && index1 == 24 && index2 == 23) {
                break;
            }
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 5; j++) {
                    AutoNumber autoNumber = new AutoNumber();
                    autoNumber.setFirstLatter(alph.get(index).toString());
                    autoNumber.setNumber((j + "" + j + "" + j));
                    autoNumber.setSecThirLatter(alph.get(index1).toString() + "" + alph.get(index2).toString());
                    if (i < 10) {
                        autoNumber.setRegion(0 + "" + j + "");
                    } else {
                        autoNumber.setRegion(j + "");
                    }
                    numbers.add(autoNumber);
                }
            }
            if (index2 != 25) {
                index2++;
            }
            if (index1 != 24) {
                index1++;
            }
            if (index != 23){
                index++;
            }
        }
        return numbers;
    }
}