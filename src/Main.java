import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        for (int i = intList.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int tmp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, tmp);
                }
            }
        }

        for (int i = 0; i < intList.size(); i++) {
            if(intList.get(i) > 0 && intList.get(i) % 2 == 0) System.out.println(intList.get(i));
        }

    }
}