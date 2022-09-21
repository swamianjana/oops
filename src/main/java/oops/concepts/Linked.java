package src.main.java.oops.concepts;

import javax.sound.sampled.SourceDataLine;

public class Linked {

    public static void main(String[] args) {

        Node naveen = new Node(90, "Naveen", null);
        Node anjana = new Node(70, "Anjana", null);
        Node mummy = new Node(60, "Mummy", null);
        Node papa = new Node(50, "Papa", null);

        naveen.next = anjana;
        // System.out.println(naveen.next.marks); // output comes 70
        // System.out.println(naveen.marks); // output comes 90
        // System.out.println(anjana.marks); // output comes 70
        anjana.next = mummy;
        mummy = null;
        // System.out.println(mummy.marks); // output is null which is error

        // System.out.println(anjana.next.marks); // output comes 60

        anjana.next.next = papa;
        System.out.println(anjana.next.next.name); // output comes papa
        mummy = anjana.next;
        // anjana;
        // anjana.next;
        // anjana.next.next;

        // naveen -> anjana -> mummy -> papa process goes like this
    }
}

class Node {
    int marks;
    String name;
    Node next;

    public Node(int marks, String name, Node next) {
        this.marks = marks;
        this.name = name;
        this.next = next;

    }
}
