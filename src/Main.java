import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {3, 3, 87, 56, 1, 87, 3, 2};
        List<Integer> array2 = new ArrayList<>();

        for (int num : array1) {
            if (!array2.contains(num)) {
                array2.add(num);
            }
        }

        System.out.println("Tekrarsız Array: " + array2);
    }
}
