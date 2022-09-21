import java.util.*;

public class ColFramwork {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addFirst("naveen");
        list.addLast("intelligent");

        System.out.println(list);

        System.out.println(list.size()); // print size

        for (int i = 0; i < list.size(); i++) {
            // if(list.get(i) == value); // this particular code use to search the value
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        // list.removeFirst();
        // System.out.println(list); // line 26-27 use to delete first word

        // list.removeLast(); // line 29-30 use to delete last word
        // System.out.println(list);

        list.remove(2); // line 32- 33 use to delete with his index value
        System.out.println(list);

    }
}
