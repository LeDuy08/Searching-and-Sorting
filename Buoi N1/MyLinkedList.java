// Khai báo cái Node Duyệt List  
public class MyLinkedList {  
    public static class Node {  
        int value;  
        Node next;  
        Node(int value) {  
            this.value = value;  
        }  
    }  

    public static void printLinkedList(Node head) {  
        if (head == null) {  
            System.out.println("List is empty");  
        } else {  
            Node temp = head;  
            while (temp != null) {  
                System.out.print(temp.value); // giá trị của node hiện tại  
                temp = temp.next; // thao tác con trỏ node temp trở tới phần tử tiếp theo  
                if (temp != null) {  
                    System.out.print(" -> ");  
                } else {  
                    System.out.println();  
                }  
            }  
        }  
    }  

    // Chèn vào đầu list  
    public static Node addToHead(Node headNode, int value) {  
        Node newNode = new Node(value);  
        if (headNode != null) {  
            newNode.next = headNode;  
        }  
        return newNode;  
    }  

    // Chèn vào đuôi list  
    public static Node addToTail(Node headNode, int value) {  
        Node newNode = new Node(value);  
        if (headNode == null) {  
            return newNode;  
        } else {  
            Node lastNode = headNode;  
            while (lastNode.next != null) {  
                lastNode = lastNode.next;  
            }  
            lastNode.next = newNode;  
        }  
        return headNode;  
    }  

    // Chèn vào một vị trí bất kỳ trong list (hay là chèn giữa list)  
    public static Node addToIndex(Node headNode, int value, int index) {  
        if (index == 0) {  
            return addToHead(headNode, value);  
        } else {  
            Node newNode = new Node(value);  
            Node curNode = headNode;  
            int count = 0;  
            while (curNode != null) {  
                if (count == index - 1) {  
                    newNode.next = curNode.next;  
                    curNode.next = newNode;  
                    return headNode;  
                }  
                curNode = curNode.next;  
                count++;  
            }  
        }  
        return headNode;  
    }  

    // Xóa phần tử đầu list  
    public static Node removeAtHead(Node headNode) {  
        if (headNode != null) {  
            return headNode.next;  
        }  
        return headNode;  
    }  

    // Xóa phần tử ở đuôi list  
    public static Node removeAtTail(Node headNode) {  
        if (headNode == null)  
            return null;  

        Node lastNode = headNode;  
        Node preNode = null;  
        while (lastNode.next != null) {  
            preNode = lastNode;  
            lastNode = lastNode.next;  
        }  
        
        if (preNode == null) {  
            return null;  
        } else {  
            preNode.next = null;  
        }  
        return headNode;  
    }  

    // Xóa ở vị trí bất kỳ trong list (xóa giữa list)  
    public static Node removeAtIndex(Node headNode, int index) {  
        if (headNode == null || index < 0)   
            return null;  
        if (index == 0)   
            return removeAtHead(headNode);  

        Node currNode = headNode;  
        Node preNode = null;  
        int count = 0;  
        
        while (currNode != null) {  
            if (count == index) {  
                if (preNode != null) {  
                    preNode.next = currNode.next;  
                }  
                return headNode;  
            }  
            preNode = currNode;  
            currNode = currNode.next;  
            count++;  
        }  
        return headNode;  
    }  

    // HÀM MAIN  
    public static void main(String[] args) {  
        Node n1 = new Node(1);  
        Node n2 = new Node(2);  
        Node n3 = new Node(3);  

        n1.next = n2;  
        n2.next = n3;  

        printLinkedList(n1);  

        n1 = addToHead(n1, 0);  
        printLinkedList(n1);  

        n1 = addToTail(n1, 4);  
        printLinkedList(n1);  

        n1 = addToIndex(n1, 5, 2);  
        printLinkedList(n1);  

        n1 = removeAtHead(n1);  
        printLinkedList(n1);  

        n1 = removeAtTail(n1);  
        printLinkedList(n1);  

        n1 = removeAtIndex(n1, 1);  
        printLinkedList(n1);  
    }  
}