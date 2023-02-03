
import java.util.Collections;
import java.util.List;

public class BubbleSort {


    public List<Comparable> sort(List<Comparable> input) {
        if (input.size() == 1 && input.contains(null)) {
            throw new RuntimeException();
        }

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) == null) {
                input.remove(i);
            }
            for (int j = 0; j < input.size() - 1; j++) {

                if (input.get(j).compareTo(input.get(j + 1)) > 0) {
                    Collections.swap(input, j, j + 1);
                }
            }
        }
        return input;
    }

}