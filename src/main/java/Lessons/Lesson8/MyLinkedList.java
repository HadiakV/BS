package Lessons.Lesson8;

import org.w3c.dom.Node;

import java.io.StringReader;
import java.util.Iterator;

public class MyLinkedList {

    private int size = 0;
    private Node first;


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException();
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public void add(String value) {
        if (isEmpty()) {
            first = new Node(value, null);
        } else {
            Node current = first;
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(value, null);
            current.next = newNode;
        }
        size++;
    }


    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        // AAA BBB CCC - [AAA, BBB, CCC]
        StringBuilder builder = new StringBuilder("[");
        Node current = first;
        while (current != null) {
            builder.append(current.data).append(", ");
            current = current.next;
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }


    private void test() {
        Node node = new Node("test", null);
        node.data = " ";
    }

    public Iterator<String> iterator() {
        return new MyIterator();
    }



    public class MyIterator implements Iterator<String> {
        private int cursor = 0;

        private MyLinkedList.Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            String result = current.data;
            current = current.next;
            return result;
        }
    }


    private class Node {
        private String data;
        private Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
