import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Comparable> list = new ArrayList<Comparable>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(0);
        list.add(9);
        list.add(6);

        System.out.println(list);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(list);
        System.out.println(list);

    }

}
