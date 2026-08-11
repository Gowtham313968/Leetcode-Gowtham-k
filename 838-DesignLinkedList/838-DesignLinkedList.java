// Last updated: 8/11/2026, 2:18:25 PM
class Node {
    int ele;
    Node next;

    public Node(int ele) {
        this.ele = ele;
    }
}

class MyLinkedList {
    Node head;
    Node tail;
    int count = 0;

    public int get(int index) {
        if (index < 0 || index >= count) return -1;

        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.ele;
    }

    public void addAtHead(int val) {
        Node n = new Node(val);

        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
        count++;
    }

    public void addAtTail(int val) {
        Node n = new Node(val);

        if (tail == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        count++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > count) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == count) {
            addAtTail(val);
            return;
        }

        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        Node n = new Node(val);
        n.next = curr.next;
        curr.next = n;
        count++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= count) return;

        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
            count--;
            return;
        }

        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        if (index == count - 1) {
            curr.next = null;
            tail = curr;
        } else {
            curr.next = curr.next.next;
        }

        count--;
    }
}